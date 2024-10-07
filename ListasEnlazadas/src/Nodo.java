/**
 * @name Nodo
 * @description Clase creada para almacenar y acceder a valores asignados
 */
public class Nodo {
    /**
     * Propiedad privada de tipo int
     * con sus metodos de accesos
     */
    private int dato;

    /**
     * Propiedad privada de tipo Nodo
     * con sus metodos de accesos
     */
    private Nodo siguiente = null;

    public Nodo(int dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
