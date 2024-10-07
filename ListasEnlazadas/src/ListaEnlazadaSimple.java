import infraestructure.ListaEnlazadaSimpleActionsImplement;
import infraestructure.ListaEnlazadaSimpleImplement;

/**
 * @name ListaEnlazadaSimple
 * @description Clase creada para crear una lista de elementos.
 */
public class ListaEnlazadaSimple implements ListaEnlazadaSimpleImplement, ListaEnlazadaSimpleActionsImplement {

    private Nodo cabeza;
    private int contador;

    public ListaEnlazadaSimple() {
        this.cabeza = null;
        contador = 0;
    }

    /**
     * @param dato int
     * @name insertarAlInicio
     * @description metodo que permite insertar valores al inicio
     * de la lista enlazada
     */
    @Override
    public void insertarAlInicio(int dato) {
        cabeza = new Nodo(dato, cabeza);
        contador++;
    }

    /**
     * @name eliminarAlInicio
     * @description metodo que permite eliminar valores al inicio
     * de la lista enlazada
     */
    @Override
    public void eliminarAlInicio() {
        final int indexInit = 0;
        if (indexInit < contador) {
            cabeza = cabeza.getSiguiente();
            contador--;
        }
    }

    /**
     * @name insertar
     * @description metodo que permite insertar valores al final
     * de la lista enlazada
     */
    @Override
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato, null);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();

            }
            actual.setSiguiente(nuevo);
            contador++;
        }
    }

    /**
     * @param element
     * @name eliminar
     * @description metodo que permite eliminar el valor digitado
     * de la lista enlazada
     */
    @Override
    public void eliminar(int element) {
        if (cabeza == null)
            CustomMessage.outln(new String[]{"lista vacía"});
        else if (cabeza.getDato() == element) {
            cabeza = cabeza.getSiguiente();
            contador--;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null && actual.getSiguiente().getDato() != element)
                actual = actual.getSiguiente();
            if (actual.getSiguiente() == null)
                CustomMessage.outln(new String[]{"El elemento " + element + " no esta en la lista"});
            else {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                contador--;
            }
        }
    }

    /**
     * @param element
     * @name eliminar
     * @description metodo que permite buscar el valor digitado
     * de la lista enlazada
     */
    @Override
    public boolean buscar(int element) {
        Nodo aux = cabeza;
        boolean encontrado = false;
        while (aux != null && !encontrado) {
            if (element == aux.getDato()) {
                encontrado = true;
            } else {
                aux = aux.getSiguiente();
            }
        }
        if (!encontrado)
            CustomMessage.outln(new String[]{"El elemento " + element + " no esta en la lista"});
        if (encontrado)
            CustomMessage.outln(new String[]{"El elemento " + element + " se encontro en la lista"});

        return encontrado;
    }

    /**
     * @name listar
     * @description metodo que permite listar la lista enlazada
     */
    @Override
    public void listar() {
        if (cabeza != null) {
            Nodo aux = cabeza;
            int i = 0;
            while (aux != null) {
                CustomMessage.out(new String[]{"| " + aux.getDato() + " |"});
                aux = aux.getSiguiente();
                i++;
            }
        } else {
            CustomMessage.outln(new String[]{"lista vacía"});
        }
        System.out.println();
        System.out.println();
    }


    /**
     * @name vaciarLista
     * @description metodo que permite vaciar la lista enlazada
     */
    @Override
    public void vaciarLista() {
        cabeza = null;
        contador = 0;
    }
}
