package org.japo.java.bll.commands.usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import org.japo.java.bll.commands.Command;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public class CommandUsuarioLogout extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Nombre Salida
        String out = "controller?cmd=usuario-login";

        // Comprobar si el Usuario ya esta Identificado
        if (validarSesion(request)) {
            // Cierre Artefactos Externos
            // ---
            // Request > Sesion
            HttpSession sesion = request.getSession(false);

            // Cerrar Sesion Actual
            sesion.invalidate();

        }

        // Redireccion
        forward(out);

    }

}
