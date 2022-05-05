/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.japo.java.bll.commands;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.japo.java.entities.Usuario;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public abstract class Command implements ICommand {

    protected ServletConfig config;
    protected HttpServletRequest request;
    protected HttpServletResponse response;

    @Override
    public void init(
            ServletConfig config,
            HttpServletRequest resquest,
            HttpServletResponse response) {
        this.config = config;
        this.request = resquest;
        this.response = response;

    }

    protected void forward(String out) throws IOException, ServletException {
        if (out.startsWith("controller")) {
            /* Redireccion de Comando */
            // Eliminar Prefijo
            out = out.replace("controller", "");

            // Redireccion del comando
            response.sendRedirect(out);

        } else {
            /* Redireccion de Vista */
            // Configuracion > Ruta Base Vistas
            String ruta = config.getServletContext().getInitParameter("ruta-vistas");

            // Obtener Ruta completa de la vista
            out = String.format("%s/%s.jsp", ruta, out);

            // Request + Nombre Vista > Despachador
            RequestDispatcher dispatcher = request.getRequestDispatcher(out);

            // Ejecutar el Despachador
            dispatcher.forward(request, response);
        }
    }

    protected boolean validarSesion(HttpServletRequest request) {
        //Semaforo de Validacion
        boolean checkOK = false;

        //Request > obtener sesion
        HttpSession sesion = request.getSession(false);
        // Validacion
        if (sesion != null) {
            Usuario usuario = (Usuario) sesion.getAttribute("usuario");

            if (usuario != null) {
                // Se deberia comprobar la existencia del Usuario de la sesion en la BBDD
                checkOK = true;
            }
        }

        // Retorno
        return checkOK;
    }

}
