public class Main {
    public static void main(String[] args) {
        CustomMessage.title("    LISTAS ENLAZADAS - EQUIPO #XD    ");

        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        for (int i = 0; i < 10; i++) {
            lista.insertarAlInicio((int) (Math.random() * 12));
        }
        CustomMessage.outln(new String[]{"Lista por defecto"});
        lista.listar();

        CustomMessage.outln(new String[]{"Insertar el primer elemento"});
        lista.insertarAlInicio(99);
        lista.listar();

        CustomMessage.outln(new String[]{"Borrar el primer elemento"});
        lista.eliminarAlInicio();
        lista.listar();

        CustomMessage.outln(new String[]{"Insertar elemento al final"});
        lista.insertar(1200);
        lista.listar();

        CustomMessage.outln(new String[]{"Borrar un elemento"});
        lista.eliminar(8);
        lista.listar();

        CustomMessage.outln(new String[]{"Buscar un elemento"});
        System.out.println(lista.buscar(5));

        CustomMessage.outln(new String[]{"Vaciar lista"});
        lista.vaciarLista();
        lista.listar();
    }
}