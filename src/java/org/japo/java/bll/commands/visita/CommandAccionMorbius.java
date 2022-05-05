package org.japo.java.bll.commands.visita;

import java.io.IOException;
import javax.servlet.ServletException;
import org.japo.java.bll.commands.Command;

/**
 *
 * @author Julián David Ramos Gómez <juli12319@hotmail.com>
 */
public class CommandAccionMorbius extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Nombre Salida

        String out = "accion/accion-morbius";

        // Redireccion
        forward(out);
    }
}
