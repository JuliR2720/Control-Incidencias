package org.japo.java.bll.commands.usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import org.japo.java.bll.commands.Command;
import org.japo.java.entities.Usuario;
import org.japo.java.libraries.UtilesUsuarios;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public class CommandUsuarioLogin extends Command {

    @Override
    public void process() throws ServletException, IOException {
        // Nombre Salida
        String out;

        // Comprobar si el Usuario ya esta Identificado
        if (validarSesion(request)) {
            out = UtilesUsuarios.obtenerComandoVistaPrincipal(request);
        } else {
            //Operacion
            String op = request.getParameter("op");

            // Discriminacion de Operacion
            if (op == null || op.equals("captura")) {
                // Lanzar el formulario
                out = "usuario/usuario-login";
            } else if (op.equals("proceso")) {
                // Entrada + BD > Entidad Usuario
                Usuario usuario = UtilesUsuarios.obtenerUsuarioRequest(config, request);

                // Validar Usuario en Formulario
                if (usuario == null) {
                    out = "message/credencial-incorrecta";
                } else {

                    // Regenerar Sesion
                    HttpSession sesion = UtilesUsuarios.reiniciarSesion(config, request);

                    // Usuario > Sesión
                    sesion.setAttribute("usuario", usuario);

                    // Usuario + Perfil > Salida
                    out = UtilesUsuarios.obtenerComandoVistaPrincipal(request);
                }
            } else {
                out = "message/operacion-desconocida";
            }
        }

        // Redireccion
        forward(out);

    }

}
