import infraestructure.ListaEnlazadaSimpleActionsImplement;
import infraestructure.ListaEnlazadaSimpleImplement;

public class ListaEnlazadaSimple implements ListaEnlazadaSimpleImplement, ListaEnlazadaSimpleActionsImplement {

    private Nodo cabeza;
    private int contador;

    public ListaEnlazadaSimple() {
        this.cabeza = null;
        contador = 0;
    }

    @Override
    public void insertarAlInicio(int dato) {
        cabeza = new Nodo(dato, cabeza);
        contador++;
    }

    @Override
    public void eliminarAlInicio() {
        final int indexInit = 0;
        if (indexInit < contador) {
            cabeza = cabeza.getSiguiente();
            contador--;
        }
    }

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

    @Override
    public void eliminar(int element) {

        deleteNodeElement(element);
    }

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

    @Override
    public void listar() {
        if (cabeza != null) {
            Nodo aux = cabeza;
            int i = 0;
            while (aux != null) {
                System.out.print("| " + aux.getDato() + " |");
                aux = aux.getSiguiente();
                i++;
            }
        }else{
            System.out.println("lista vacía");
        }
        System.out.println();
        System.out.println();
    }


    private void deleteNodeElement(int element) {
        if (cabeza == null)
            System.out.println("lista vacía");
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
    @Override
    public void vaciarLista(){
        cabeza = null;
        contador = 0;
    }
}
