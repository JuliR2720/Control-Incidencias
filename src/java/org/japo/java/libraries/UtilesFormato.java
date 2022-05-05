package org.japo.java.libraries;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public final class UtilesFormato {

    private UtilesFormato() {
    }

    public static final String cmabiarKebab2Camel(String cmdName) {
        // String > String []
        String[] items = cmdName.split("-");

        // Buffer String
        StringBuilder sb = new StringBuilder();

        // Bucle 
        for (String item : items) {
            sb.append(capitalizar(item));
        }

        // Retorno: Notacion Camel-Case
        return sb.toString();
    }

    public static final String capitalizar(String item) {
        if (item != null) {
            // Item > inicial Mayuscula
            char head = Character.toUpperCase(item.charAt(0));

            // Item > Resto Cadena miniscula
            String tail = item.substring(1).toLowerCase();

            // Head + tail
            item = head + tail;
        }

        // Retorno: item
        return item;
    }

}
