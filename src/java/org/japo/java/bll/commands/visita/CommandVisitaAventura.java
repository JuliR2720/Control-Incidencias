package org.japo.java.bll.commands.visita;

import java.io.IOException;
import javax.servlet.ServletException;
import org.japo.java.bll.commands.Command;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public class CommandVisitaAventura extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Nombre Salida

        String out = "aventura/visita-aventura";

        // Redireccion
        forward(out);

    }

}
