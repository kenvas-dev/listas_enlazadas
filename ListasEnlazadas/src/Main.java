public class Main {
    public static void main(String[] args) {
        runApp();
    }


    /**
     * @name runApp
     * @description Metodo responsable de centralizar los metodos para
     * poder hacer la implementacion del programa.
     */
    public static void runApp() {
        CustomMessage.title("   LISTAS ENLAZADAS - KEVIN AQUINO  ");

        // Se instancia la lista EnlazadaSimple
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();

        // Se llena una lista por defecto con valores aleatorios
        for (int i = 0; i < 10; i++) {
            lista.insertarAlInicio((int) (Math.random() * 12));
        }

        // Se visualiza la lista por defecto con los valores aleatorios
        CustomMessage.outln(new String[]{"Lista por defecto"});
        lista.listar();

        // Se inserta un valor en el primer elemento del array
        CustomMessage.outln(new String[]{"Insertar el primer elemento (99)"});
        lista.insertarAlInicio(99);
        lista.listar();

        // Se elimina el valor en el primer elemento del array
        CustomMessage.outln(new String[]{"Borrar el primer elemento"});
        lista.eliminarAlInicio();
        lista.listar();

        // Se elimina el valor del ultimo elemento del array
        CustomMessage.outln(new String[]{"Insertar elemento al final (1200)"});
        lista.insertar(1200);
        lista.listar();

        // Se elimina el valor seleccionado
        CustomMessage.outln(new String[]{"Borrar un elemento (8)"});
        lista.eliminar(8);
        lista.listar();

        // Se busca el valor seleccionado
        CustomMessage.outln(new String[]{"Buscar un elemento (5)"});
        lista.buscar(5);
        CustomMessage.outln(new String[]{""});

        // Se elimina la lista
        CustomMessage.outln(new String[]{"Vaciar lista"});
        lista.vaciarLista();
        lista.listar();
    }
}