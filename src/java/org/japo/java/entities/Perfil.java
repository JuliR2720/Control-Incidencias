package org.japo.java.entities;

import java.io.Serializable;
import java.util.Objects;
import org.japo.java.libraries.UtilesPerfiles;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public final class Perfil implements Serializable {

    // Campos
    private int id;
    private String nombre;
    private String info;

    public Perfil() {
        id = UtilesPerfiles.DEF_ID;
        nombre = UtilesPerfiles.DEF_NOMBRE;
        info = UtilesPerfiles.DEF_INFO;

    }

    public Perfil(int id, String nombre, String info) {
        if (UtilesPerfiles.validarId(id)) {
            this.id = id;
        } else {
            this.id = UtilesPerfiles.DEF_ID;
        }
        if (UtilesPerfiles.validarNombre(nombre)) {
            this.nombre = nombre;
        } else {
            this.nombre = UtilesPerfiles.DEF_NOMBRE;
        }
        if (UtilesPerfiles.validarInfo(info)) {
            this.info = info;
        } else {
            this.info = UtilesPerfiles.DEF_INFO;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (UtilesPerfiles.validarId(id)) {
            this.id = id;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (UtilesPerfiles.validarNombre(nombre)) {
            this.nombre = nombre;
        }
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        if (UtilesPerfiles.validarInfo(info)) {
            this.info = info;
        }
    }

    @Override
    public boolean equals(Object o) {
        boolean testOK = false;
        if (o instanceof Perfil) {
            Perfil p = (Perfil) o;
            testOK = id == p.getId()
                    && nombre.equals(p.getNombre())
                    && info.equals(p.getInfo());
        }

        return testOK;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.info);
        return hash;
    }
}
