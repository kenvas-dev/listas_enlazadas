/**
 * @name CustomMessage
 * @description
 * Clase presonalizada para mostrar mensajes
 */
public class CustomMessage {

    /**
     * @name title
     * @description
     * Banner creado para mostrar enunciados
     * @param title
     */
    public static void title(String title) {
        System.out.println("********************************************");
        System.out.println("*** "+title+" ***");
        System.out.println("********************************************");
    }

    /**
     * @name out
     * @description
     * Es una personalizacion del syop
     * para un listado de opciones, sin saltos de linea.
     * @param texts
     */
    public static void out(String[] texts) {
        for (String text : texts) {
            System.out.print(text+"   ");
        }
    }

    /**
     * @name outln
     * @description Es una personalizacion del syop
     * para un listado de opciones, con saltos de linea.
     */
    public static void outln(String[] texts) {
        for (String text : texts) {
            System.out.println(text);
        }
    }
}
