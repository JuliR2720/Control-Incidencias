/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.japo.java.libraries;

import java.util.Date;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public final class UtilesIncidencias {

    // Valores por Defectos (constantes publicas)
    public static final int DEF_ID = 0;
    public static final String DEF_NOMBRE = "Indefinido";
    public static final String DEF_INFO = "Incidencia Indefinida";
    public static final int DEF_ESTADO = 0;
    public static final Date DEF_CREACION = new Date();
    public static final int INCIDENCIA_CERRADA = 0;
    public static final int INCIDENCIA_ABIERTA = 1;

    // Expresiones Regulares
    public static final String REG_NOMBRE = "[\\w áéíóúñÁÉÍÓÚÑçÇ]{3,50}";
    public static final String REG_INFO = "[\\w áéíóúñÁÉÍÓÚÑçÇ]{3,255}";

    private UtilesIncidencias() {
    }

    public static final boolean validarId(int id) {
        return id >= DEF_ID;
    }

    public static final boolean validarNombre(String nombre) {
        return nombre.matches(REG_NOMBRE);
    }

    public static final boolean validarInfo(String info) {
        return info.matches(REG_INFO);

    }

    public static final boolean validarEstado(int estado) {
        return estado == INCIDENCIA_CERRADA || estado == INCIDENCIA_ABIERTA;
    }

    public static final boolean validarCreacion(Date creacion) {
        // Hace 20 años : ms
        long millis = 20 * 365 * 24 * 3600 * 1000;
        return creacion != null
                && creacion.after(new Date(new Date().getTime() - millis))
                && creacion.before(new Date(new Date().getTime() + 3600 * 1000));
    }

}
