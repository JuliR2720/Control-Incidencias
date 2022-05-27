package org.japo.java.libraries;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.japo.java.dll.usuario.DLLUsuario;
import org.japo.java.entities.Usuario;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public final class UtilesUsuarios {

    // Constantes
    public static final int DEF_ID = 0;
    public static final String DEF_USER = "Usuario Indefenido";
    public static final String DEF_PASS = "123456";
    public static final String DEF_AVATAR = "data:image/png;base64,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";

    // Expresiones Regulares
    public static final String REG_USER = "\\w{3,30}";
    public static final String REG_PASS = "\\w{3,30}";

    private UtilesUsuarios() {
    }

    public static final boolean validarId(int id) {
        return id >= DEF_ID;
    }

    public static final boolean validarUser(String user) {
        return user.matches(REG_USER);
    }

    public static final boolean validarPass(String pass) {
        return pass.matches(REG_PASS);
    }

    public static final boolean validarAvatar(String avatar) {
        return UtilesBase64.validar(avatar);
    }

    public static String obtenerComandoVistaPrincipal(HttpServletRequest request) {
        // Salida
        String out;

        // Request > Obtener Session
        HttpSession sesion = request.getSession(false);

        // Sesion > Usuario 
        Usuario usuario = (Usuario) sesion.getAttribute("usuario");

        // Discriminar la Salida
        switch (usuario.getPerfil()) {
            case UtilesPerfiles.VISIT_CODE:
                out = "main/main-visit";
                break;
            case UtilesPerfiles.BASIC_CODE:
                out = "main/main-basic";
                break;
            case UtilesPerfiles.ADMIN_CODE:
                out = "main/main-admin";
                break;
            case UtilesPerfiles.DESAR_CODE:
                out = "main/main-desar";
                break;
            default:
                // Eror Interno NO deberia Ocurrir
                out = "main/main-basic";
        }

        return out;
    }

    public static Usuario obtenerUsuarioRequest(ServletConfig config, HttpServletRequest request) {
        // Instanciar capa de Datos - Usuario
        DLLUsuario dllUsuario = new DLLUsuario(config);

        // Request > Nombre de Usuario  (mismo nombre del html)
        String user = request.getParameter("user");

        // Validar Nombre de Usuario
        if (!UtilesUsuarios.validarUser(user)) {
            user = UtilesUsuarios.DEF_USER;
        }

        // Base de Datyos + user > Usuario
        Usuario usuario = dllUsuario.consultar(user);

        // Peticion > Password 
        String pass = request.getParameter("pass");

        // Validar Contraseña
        if (!UtilesUsuarios.validarPass(pass)) {
            pass = UtilesUsuarios.DEF_PASS;
        }

        // Validar Password 
        if (usuario != null && !usuario.getPass().equals(pass)) {
            usuario = null;
        }

        // Retorno de Usuario
        return usuario;

    }

    public static HttpSession reiniciarSesion(ServletConfig config, HttpServletRequest request) {

        // Request > Obtener Sesion
        HttpSession sesion = request.getSession(false);

        // verificar Existencia Sesion
        if (sesion != null) {
            sesion.invalidate();
        }

        // Crear Sesion
        sesion = request.getSession();

        // Config > Lapso
        int lapso = UtilesServlets.obtenerLapsoInactividad(config);

        // Tiempo Maximo Sesion Inactiva
        sesion.setMaxInactiveInterval(lapso);

        // Devolver sesion
        return sesion;
    }
}
