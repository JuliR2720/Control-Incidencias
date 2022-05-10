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
public final class UtilesNotificaciones {

    // Valores por Defectos (constantes publicas)
    public static final int DEF_ID = 0;
    public static final Date DEF_FECHA = new Date();
    public static final String DEF_INFO = "Notificacion Indefinida";

    // Expresiones Regulares
    public static final String REG_INFO = "[\\w áéíóúñÁÉÍÓÚÑçÇ,\\.]{3,255}";

    private UtilesNotificaciones() {
    }

    public static final boolean validarId(int id) {
        return id >= DEF_ID;
    }

    public static final boolean validarInfo(String info) {
        return info.matches(REG_INFO);

    }

    public static final boolean validarFecha(Date fecha) {
        // Hace 20 años : ms
//        long millis = 20 * 365 * 24 * 3600 * 1000;
        return fecha != null;
    }

}
