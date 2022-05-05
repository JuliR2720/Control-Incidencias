package org.japo.java.libraries;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.sql.DataSource;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public final class UtilesServlets {

    // Lapso Inactividad por Defecto
    private static final int DEF_LAPSO = 1800;

    private UtilesServlets() {
    }

    public static DataSource obtenerDataSource(ServletConfig config) {

        // dataSource
        DataSource ds;
        try {
            // Contexto Inicial Nombres JNDI
            Context iniCtx = new InitialContext();

            // Situar Contexto Inicial 
            Context envCtx = (Context) iniCtx.lookup("java:/comp/env");

            // Contexto Inicial > DataSource 
            ds = (DataSource) envCtx.lookup("jdbc/" + obtenerNombreBD(config));

            //
        } catch (NamingException ex) {
            ds = null;
        }

        return ds;
    }

    private static Object obtenerNombreBD(ServletConfig config) {
        // Parametros de Contexto ( web.xml )
        String paramName = "base-datos";

        // Servlet Config 
        ServletContext context = config.getServletContext();

        // Retorno: Nombre Base de Datos
        return context.getInitParameter(paramName);

    }

    // Modificar el fichero de web.xml 
    public static final int obtenerLapsoInactividad(ServletConfig config) {
        // Tiempo Maximo de Inactividad de Sesion
        int lapso;

        // Nombre del Parámetro
        String paramName = "lapso-inactividad";

        // Obtener Contexto de la App
        ServletContext context = config.getServletContext();

        // Contexto > Valor Parámetro 
        String paramValue = context.getInitParameter(paramName);

        try {
            // String > int
            lapso = Integer.parseInt(paramValue);
        } catch (NumberFormatException e) {
            lapso = DEF_LAPSO;
        }

        // Return lapso
        return lapso;
    }
}
