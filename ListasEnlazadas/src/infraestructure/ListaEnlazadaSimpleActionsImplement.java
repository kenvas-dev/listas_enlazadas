package infraestructure;

/**
 * @descrioption Interface creada para tipar la implemntacion de los
 * metodos a utilizar, los cuales son:
 * insertar
 * eliminar
 * vaciarLista
 * buscar
 * listar
 */
public interface ListaEnlazadaSimpleActionsImplement {
    void insertar(int dato);

    void eliminar(int element);

    void vaciarLista();

    boolean buscar(int dato);

    void listar();
}
