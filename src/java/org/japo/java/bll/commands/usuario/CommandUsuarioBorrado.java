/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.japo.java.bll.commands.usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import org.japo.java.bll.commands.Command;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public class CommandUsuarioBorrado extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Nombre de la Pagina de Salida
        String page = "usuario/usuario-borrado";

        // Validar Sesion
        if (validarSesion(request)) {
            // Validar Acceso
        }
    }

}
