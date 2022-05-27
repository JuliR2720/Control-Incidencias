/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.japo.java.bll.commands.usuario;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpSession;
import org.japo.java.entities.Usuario;
import org.japo.java.libraries.UtilesPerfiles;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
class CommandUsuarioValidation {

    CommandUsuarioValidation(ServletConfig config, HttpSession session) {
    }

    public final boolean validarAccesoAdmin(HttpSession session) {
        // Semáforo
        boolean checkOK;

        try {
            // Sesión > Usuario
            Usuario usuario = (Usuario) session.getAttribute("usuario");

            // Usuario > Perfil
            int perfil = usuario.getPerfil();

            // Validar Perfil Desarrollador
            checkOK = perfil >= UtilesPerfiles.ADMIN_CODE;
        } catch (NullPointerException e) {
            checkOK = false;
        }

        // Retorno: true | false
        return checkOK;
    }

    public final boolean validarAccesoDev(HttpSession session) {
        // Semáforo
        boolean checkOK;

        try {
            // Sesión > Usuario
            Usuario usuario = (Usuario) session.getAttribute("usuario");

            // Usuario > Perfil
            int perfil = usuario.getPerfil();

            // Validar Perfil Desarrollador
            checkOK = perfil >= UtilesPerfiles.DESAR_CODE;
        } catch (NullPointerException e) {
            checkOK = false;
        }

        // Retorno: true | false
        return checkOK;
    }

    public final boolean validarAccesoBasic(HttpSession session) {
        // Semáforo
        boolean checkOK;

        try {
            // Sesión > Usuario
            Usuario usuario = (Usuario) session.getAttribute("usuario");

            // Usuario > Perfil
            int perfil = usuario.getPerfil();

            // Validar Perfil Desarrollador
            checkOK = perfil >= UtilesPerfiles.BASIC_CODE;
        } catch (NullPointerException e) {
            checkOK = false;
        }

        // Retorno: true | false
        return checkOK;
    }

}
