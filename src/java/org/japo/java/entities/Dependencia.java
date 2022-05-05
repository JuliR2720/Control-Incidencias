package org.japo.java.entities;

import java.io.Serializable;
import java.util.Objects;
import org.japo.java.libraries.UtilesDependencias;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public final class Dependencia implements Serializable {

    // Campos
    private int id;
    private String nombre;
    private String info;
    private String codigo;

    // Constructor Predeterminado
    public Dependencia() {
        id = UtilesDependencias.DEF_ID;
        nombre = UtilesDependencias.DEF_NOMBRE;
        info = UtilesDependencias.DEF_INFO;
        codigo = UtilesDependencias.DEF_CODIGO;

    }

    // Contructor Parametrizado
    public Dependencia(int id, String nombre, String info, String codigo) {
        if (UtilesDependencias.validarId(id)) {
            this.id = id;
        } else {
            this.id = UtilesDependencias.DEF_ID;
        }
        if (UtilesDependencias.validarNombre(nombre)) {
            this.nombre = nombre;
        } else {
            this.nombre = UtilesDependencias.DEF_NOMBRE;
        }
        if (UtilesDependencias.validarInfo(info)) {
            this.info = info;
        } else {
            this.info = UtilesDependencias.DEF_INFO;
        }
        if (UtilesDependencias.validarCodigo(codigo)) {
            this.codigo = codigo;
        } else {
            this.codigo = UtilesDependencias.DEF_CODIGO;
        }
    }

    // Set & Get
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (UtilesDependencias.validarId(id)) {
            this.id = id;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (UtilesDependencias.validarNombre(nombre)) {
            this.nombre = nombre;
        }
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        if (UtilesDependencias.validarInfo(info)) {
            this.info = info;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (UtilesDependencias.validarCodigo(codigo)) {
            this.codigo = codigo;
        }
    }

    @Override
    public boolean equals(Object o) {
        boolean testOK = false;
        if (o instanceof Dependencia) {
            Dependencia e = (Dependencia) o;
            testOK = id == e.getId()
                    && nombre.equals(e.getNombre())
                    && info.equals(e.getInfo())
                    && codigo.equals(e.getCodigo());
        }

        return testOK;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.info);
        hash = 97 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

}
