package org.japo.java.libraries;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.japo.java.bll.commands.ICommand;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public final class UtilesComando {

    //Constantes
    private static final String COMMAND_PKG = "org.japo.java.bll.commands";
    private static final String COMMAND_PRE = "Command";

    private UtilesComando() {
    }

    public static void procesar(
            ServletConfig config,
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        // Request > Nombre del Comando
        String cmdName = request.getParameter("cmd");

        // Nombre Comando > Objeto que lo represente 
        ICommand cmd = obtenerComando(cmdName);

        // Objeto Comando > Inicializar Comando
        cmd.init(config, request, response);

        // Ejecutar Proceso Comando
        cmd.process();

    }

    private static ICommand obtenerComando(String cmdName)
            throws ServletException {
        // Referencia Comando
        ICommand cmd;
        try {

            // Nombre Comando Obtiene el nombre de la clase
            String cmdClassName = obtenerNombreComando(cmdName);

            // Nombre de la Clase obtener Objeto class
            Class<?> cmdClass = Class.forName(cmdClassName);

            // Objeto Class > Constructor Clase
            Constructor<?> constructor = cmdClass.getConstructor();

            // Constructor Clase > Intanciar Objeto
            cmd = (ICommand) constructor.newInstance();

        } catch (ClassNotFoundException
                | NoSuchMethodException
                | SecurityException
                | InstantiationException
                | IllegalAccessException
                | IllegalArgumentException
                | InvocationTargetException ex) {

            // Clase indefinida o desconocida
            throw new ServletException(ex.getMessage());
        }

        // Retorno del Comando
        return cmd;
    }

    private static String obtenerNombreComando(String cmdName)
            throws ServletException {
        // Subpaquete 
        String sub;

        // Nombre Comando > Subpaquete
        if (cmdName == null) {
            throw new ServletException("Comando NO Especificado");
        } else if (cmdName.equals("validation")) {
            sub = "admin";
        } else if (cmdName.contains("-")) {
            sub = cmdName.substring(0, cmdName.lastIndexOf("-"));
            sub = sub.replace("-", ".");
        } else {
            sub = cmdName;
        }

        // Comando  Kebab-Case > Comando Camel Case
        cmdName = UtilesFormato.cmabiarKebab2Camel(cmdName);

        // Retorno Nombre Cualificado Clase
        return String.format("%s.%s.%s%s", COMMAND_PKG, sub, COMMAND_PRE, cmdName);
    }

}
