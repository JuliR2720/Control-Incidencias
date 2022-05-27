package org.japo.java.bll.commands.usuario;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import org.japo.java.bll.commands.Command;
import org.japo.java.dll.usuario.DLLUsuario;
import org.japo.java.entities.Usuario;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public class CommandUsuarioGaleria extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Nombre Salida
        String out = "usuario/usuario-galeria";

        // Comprobar si el Usuario ya esta Identificado
        if (validarSesion(request)) {

            // Validar Acceso 
            CommandUsuarioValidation validator = new CommandUsuarioValidation(config, request.getSession(false));
            if (validator.validarAccesoAdmin(request.getSession(false))) {

                // Capa de Datos
                DLLUsuario dllUsuario = new DLLUsuario(config);

                // BD > Lista de Registro
                List<Usuario> usuarios = dllUsuario.listar();

                // 
                request.setAttribute("usuarios", usuarios);
            } else {
                out = "message/acceso-denegado";
            }
        } else {
            out = "message/sesion-invalidada";
        }
        // Redireccion
        forward(out);
    }

}
