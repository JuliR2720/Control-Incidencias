package org.japo.java.libraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public final class UtilesEstaticos {

    private UtilesEstaticos() {
    }

    public static void procesarEstatico(HttpServletRequest request,
            HttpServletResponse response) throws IOException {

//        File fichero = localizarRecursoPrivado(request);
        File fichero = localizarRecurso(request);

        servirRecurso(fichero, response);
    }

    private static File localizarRecurso(HttpServletRequest request) {

        /* Convertimos la ruta especifica y la concatenamos y cambiamos la barra para obetener la ruta local */
        String base = "/WEB-INF/static";
        String ruta = request.getPathTranslated().replace("\\", "/");

        String peticion = request.getPathInfo();
        String servicio = base + peticion;
        ruta = ruta.replace(peticion, servicio);

        return new File(ruta);

    }

    private static void servirRecurso(File fichero, HttpServletResponse response)
            throws IOException {

        byte[] buffer = new byte[(int) fichero.length()];

        try (
                 FileInputStream origen = new FileInputStream(fichero);  ServletOutputStream destino = response.getOutputStream()) {

            // Del origen al array buffer lee el array
            origen.read(buffer);

            // Del array al Destino 
            destino.write(buffer);
        }
    }

    private static File localizarRecursoPrivado(HttpServletRequest request) {

        /* Convertimos la ruta especifica y la concatenamos y cambiamos la barra para obetener la ruta local */
        String base = "/WEB-INF/static";

        /* Crear Sesion */
        HttpSession session = request.getSession();

        /* Sacar Id de la Sesion Navegador */
        String id = session.getId();

        String ruta = request.getPathTranslated().replace("\\", "/");

        if (ruta.contains(id)) {
            String peticion = request.getPathInfo();
            String servicio = base + peticion.replace("/" + id, "");
            ruta = ruta.replace(peticion, servicio);

        } else {
            ruta = null;
        }

        return new File(ruta);

    }
}
