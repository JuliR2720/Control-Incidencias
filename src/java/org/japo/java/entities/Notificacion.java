package org.japo.java.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import org.japo.java.libraries.UtilesIncidencias;
import org.japo.java.libraries.UtilesNotificaciones;
import org.japo.java.libraries.UtilesUsuarios;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public final class Notificacion implements Serializable {

    // Campos
    private int id;
    private Date fecha;
    private int autor;
    private String autorInfo;
    private int incidencia;
    private String incidenciaInfo;
    private String info;

    // Constructor Predeterminado
    public Notificacion() {
        id = UtilesNotificaciones.DEF_ID;
        fecha = UtilesNotificaciones.DEF_FECHA;
        autor = UtilesUsuarios.DEF_ID;
        autorInfo = UtilesUsuarios.DEF_USER;
        incidencia = UtilesIncidencias.DEF_ID;
        incidenciaInfo = UtilesIncidencias.DEF_INFO;
        info = UtilesNotificaciones.DEF_INFO;

    }

    // Contructor Parametrizado
    public Notificacion(int id, Date fecha, int autor, String autorInfo, int incidencia, String incidenciaInfo, String info) {
        if (UtilesNotificaciones.validarId(id)) {
            this.id = id;
        } else {
            this.id = UtilesNotificaciones.DEF_ID;
        }
        if (UtilesNotificaciones.validarFecha(fecha)) {
            this.fecha = fecha;
        } else {
            this.fecha = UtilesNotificaciones.DEF_FECHA;
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
        if (UtilesIncidencias.validarId(incidencia)) {
            this.incidencia = incidencia;
        } else {
            this.incidencia = UtilesIncidencias.DEF_ID;
        }
        if (UtilesIncidencias.validarInfo(incidenciaInfo)) {
            this.incidenciaInfo = incidenciaInfo;
        } else {
            this.incidenciaInfo = UtilesIncidencias.DEF_INFO;
        }
        if (UtilesNotificaciones.validarInfo(info)) {
            this.info = info;
        } else {
            this.info = UtilesNotificaciones.DEF_INFO;
        }
    }

    // Set & Get
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (UtilesNotificaciones.validarId(id)) {
            this.id = id;
        }
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        if (UtilesNotificaciones.validarFecha(fecha)) {
            this.fecha = fecha;
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

    public int getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(int incidencia) {
        if (UtilesIncidencias.validarId(incidencia)) {
            this.incidencia = incidencia;
        }
    }

    public String getIncidenciaInfo() {
        return incidenciaInfo;
    }

    public void setIncidenciaInfo(String incidenciaInfo) {
        if (UtilesIncidencias.validarInfo(incidenciaInfo)) {
            this.incidenciaInfo = incidenciaInfo;
        }
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        if (UtilesNotificaciones.validarInfo(info)) {
            this.info = info;
        }
    }

    // Equals
    @Override
    public boolean equals(Object o) {
        boolean testOK = false;
        if (o instanceof Notificacion) {
            Notificacion e = (Notificacion) o;
            testOK = id == e.getId()
                    && fecha == e.getFecha()
                    && autor == e.getAutor()
                    && autorInfo.equals(e.getAutorInfo())
                    && incidencia == e.getIncidencia()
                    && incidenciaInfo.equals(e.getIncidenciaInfo())
                    && info.equals(e.getInfo());
        }

        return testOK;
    }

    // HashCode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.id;
        hash = 83 * hash + Objects.hashCode(this.fecha);
        hash = 83 * hash + this.autor;
        hash = 83 * hash + Objects.hashCode(this.autorInfo);
        hash = 83 * hash + this.incidencia;
        hash = 83 * hash + Objects.hashCode(this.incidenciaInfo);
        hash = 83 * hash + Objects.hashCode(this.info);
        return hash;
    }

}
