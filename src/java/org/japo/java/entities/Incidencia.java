package org.japo.java.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import org.japo.java.libraries.UtilesDependencias;
import org.japo.java.libraries.UtilesEspecialidades;
import org.japo.java.libraries.UtilesIncidencias;
import org.japo.java.libraries.UtilesUsuarios;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public final class Incidencia implements Serializable {

    // Campos
    private int id;
    private String nombre;
    private String info;
    private int estado;
    private Date creacion;
    private int autor;
    private String autorInfo;
    private int dependencia;
    private String dependenciaInfo;
    private int especialidad;
    private String especialidadInfo;

    // Constructor Predeterminado
    public Incidencia() {
        id = UtilesIncidencias.DEF_ID;
        nombre = UtilesIncidencias.DEF_NOMBRE;
        info = UtilesIncidencias.DEF_INFO;
        estado = UtilesIncidencias.DEF_ESTADO;
        creacion = UtilesIncidencias.DEF_CREACION;
        autor = UtilesUsuarios.DEF_ID;
        autorInfo = UtilesUsuarios.DEF_USER;
        dependencia = UtilesDependencias.DEF_ID;
        dependenciaInfo = UtilesDependencias.DEF_INFO;
        especialidad = UtilesEspecialidades.DEF_ID;
        especialidadInfo = UtilesEspecialidades.DEF_INFO;
    }

    // Contructor Parametrizado
    public Incidencia(int id, String nombre, String info, int estado, Date creacion, int autor, String autorInfo, int dependencia, String dependenciaInfo, int especialidad, String especialidadInfo) {
        if (UtilesIncidencias.validarId(id)) {
            this.id = id;
        } else {
            this.id = UtilesIncidencias.DEF_ID;
        }
        if (UtilesIncidencias.validarNombre(nombre)) {
            this.nombre = nombre;
        } else {
            this.nombre = UtilesIncidencias.DEF_NOMBRE;
        }
        if (UtilesIncidencias.validarInfo(info)) {
            this.info = info;
        } else {
            this.info = UtilesIncidencias.DEF_INFO;
        }
        if (UtilesIncidencias.validarEstado(estado)) {
            this.estado = estado;
        } else {
            this.estado = UtilesIncidencias.DEF_ESTADO;
        }
        if (UtilesIncidencias.validarCreacion(creacion)) {
            this.creacion = creacion;
        } else {
            this.creacion = UtilesIncidencias.DEF_CREACION;
        }
        if (UtilesUsuarios.validarId(autor)) {
            this.autor = autor;
        } else {
            this.autor = UtilesUsuarios.DEF_ID;
        }
        if (UtilesUsuarios.validarUser(autorInfo)) {
            this.autorInfo = autorInfo;
        } else {
            this.autorInfo = UtilesUsuarios.DEF_USER;
        }
        if (UtilesDependencias.validarId(dependencia)) {
            this.dependencia = dependencia;
        } else {
            this.dependencia = UtilesDependencias.DEF_ID;
        }
        if (UtilesDependencias.validarInfo(dependenciaInfo)) {
            this.dependenciaInfo = dependenciaInfo;
        } else {
            this.dependenciaInfo = UtilesDependencias.DEF_INFO;
        }
        if (UtilesEspecialidades.validarId(especialidad)) {
            this.especialidad = especialidad;
        } else {
            this.especialidad = UtilesEspecialidades.DEF_ID;
        }
        if (UtilesEspecialidades.validarInfo(especialidadInfo)) {
            this.especialidadInfo = especialidadInfo;
        } else {
            this.especialidadInfo = UtilesEspecialidades.DEF_INFO;
        }
    }

    // Set & Get
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (UtilesIncidencias.validarId(id)) {
            this.id = id;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (UtilesIncidencias.validarNombre(nombre)) {
            this.nombre = nombre;
        }
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        if (UtilesIncidencias.validarInfo(info)) {
            this.info = info;
        }
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        if (UtilesIncidencias.validarEstado(estado)) {
            this.estado = estado;
        }
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        if (UtilesIncidencias.validarCreacion(creacion)) {
            this.creacion = creacion;
        }
    }

    public int getAutor() {
        return autor;
    }

    public void setAutor(int autor) {
        if (UtilesUsuarios.validarId(autor)) {
            this.autor = autor;
        }
    }

    public String getAutorInfo() {
        return autorInfo;
    }

    public void setAutorInfo(String autorInfo) {
        if (UtilesUsuarios.validarUser(autorInfo)) {
            this.autorInfo = autorInfo;
        }
    }

    public int getDependencia() {
        return dependencia;
    }

    public void setDependencia(int dependencia) {
        if (UtilesDependencias.validarId(dependencia)) {
            this.dependencia = dependencia;
        }
    }

    public String getDependenciaInfo() {
        return dependenciaInfo;
    }

    public void setDependenciaInfo(String dependenciaInfo) {
        if (UtilesDependencias.validarInfo(dependenciaInfo)) {
            this.dependenciaInfo = dependenciaInfo;
        }
    }

    public int getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(int especialidad) {
        if (UtilesEspecialidades.validarId(especialidad)) {
            this.especialidad = especialidad;
        }
    }

    public String getEspecialidadInfo() {
        return especialidadInfo;
    }

    public void setEspecialidadInfo(String especialidadInfo) {
        if (UtilesEspecialidades.validarInfo(especialidadInfo)) {
            this.especialidadInfo = especialidadInfo;
        }
    }

    // Equals 
    @Override
    public boolean equals(Object o) {
        boolean testOK = false;
        if (o instanceof Incidencia) {
            Incidencia e = (Incidencia) o;
            testOK = id == e.getId()
                    && nombre.equals(e.getNombre())
                    && info.equals(e.getInfo())
                    && estado == e.getEstado()
                    && creacion == e.getCreacion()
                    && autor == e.getAutor()
                    && autorInfo.equals(e.getAutorInfo())
                    && dependencia == e.getDependencia()
                    && dependenciaInfo.equals(e.getDependenciaInfo())
                    && especialidad == e.getEspecialidad()
                    && especialidadInfo.equals(e.getEspecialidadInfo());
        }

        return testOK;
    }

    // HashCode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(this.info);
        hash = 47 * hash + this.estado;
        hash = 47 * hash + Objects.hashCode(this.creacion);
        hash = 47 * hash + this.autor;
        hash = 47 * hash + Objects.hashCode(this.autorInfo);
        hash = 47 * hash + this.dependencia;
        hash = 47 * hash + Objects.hashCode(this.dependenciaInfo);
        hash = 47 * hash + this.especialidad;
        hash = 47 * hash + Objects.hashCode(this.especialidadInfo);
        return hash;
    }

}
