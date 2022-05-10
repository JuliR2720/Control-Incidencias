/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.japo.java.libraries;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public final class UtilesDependencias {

    // Valores por Defectos (constantes publicas)
    public static final int DEF_ID = 0;
    public static final String DEF_NOMBRE = "Indefinido";
    public static final String DEF_INFO = "Especialidad Indefinida";

    // Expresiones Regulares
    public static final String REG_NOMBRE = "[\\w áéíóúñÁÉÍÓÚÑçÇ]{3,10}";
    public static final String REG_INFO = "[\\w áéíóúñÁÉÍÓÚÑçÇ]{3,100}";

    private UtilesDependencias() {
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
}
