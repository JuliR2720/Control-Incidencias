package org.japo.java.dll.usuario;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.sql.DataSource;
import org.japo.java.entities.Usuario;
import org.japo.java.libraries.UtilesServlets;

/**
 *
 * @author Julian David Ramos Gómez <juli12319@hotmail.com>
 */
public final class DLLUsuario {

    // Acceso a la Base de Datos ( Pool de Conexiones )
    private DataSource ds;

    public DLLUsuario(ServletConfig config) {
        ds = UtilesServlets.obtenerDataSource(config);
    }

    public final Usuario consultar(String user) {
        // Referencia
        Usuario usuario = null;

        // SQL 
        String sql = ""
                + "SELECT "
                + "usuarios.id AS id, "
                + "usuarios.user AS user, "
                + "usuarios.pass AS pass, "
                + "usuarios.avatar AS avatar, "
                + "usuarios.perfil AS perfil, "
                + "perfiles.info AS perfil_info "
                + "FROM "
                + "usuarios "
                + "INNER JOIN "
                + "perfiles ON perfiles.id = usuarios.perfil "
                + "WHERE "
                + "usuarios.user=?";

        // Busqueda
        try {
            try (
                     Connection conn = ds.getConnection();  PreparedStatement ps = conn.prepareStatement(sql);) {

                // Parametrizar la Sentencia
                ps.setString(1, user);

                // BBDD > Listado de Entidades 
                try ( ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        // Fila Actual > Campos
                        int id = rs.getInt("id");
                        String pass = rs.getString("pass");
                        String avatar = rs.getString("avatar");
                        int perfil = rs.getInt("perfil");
                        String perfilInfo = rs.getString("perfil_info");

                        usuario = new Usuario(id, user, pass, avatar, perfil, perfilInfo);
                    }
                }
            }

        } catch (SQLException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        //Return
        return usuario;
    }

    public List<Usuario> listar() {
        // SQL
        String sql = ""
                + "SELECT "
                + "usuarios.id AS id, "
                + "usuarios.user AS user, "
                + "usuarios.pass AS pass, "
                + "usuarios.avatar AS avatar, "
                + "usuarios.perfil AS perfil, "
                + "perfiles.info AS perfil_info "
                + "FROM "
                + "usuarios "
                + "INNER JOIN "
                + "perfiles ON perfiles.id = usuarios.perfil ";

        // Lista Vacia
        List<Usuario> usuarios = new ArrayList<>();

        try {
            try (
                     Connection conn = ds.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
                // BD > Lista de Entidades
                try ( ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        // Fila Actual > Campos 
                        int id = rs.getInt("id");
                        String user = rs.getString("user");
                        String pass = rs.getString("pass");
                        String avatar = rs.getString("avatar");
                        int perfil = rs.getInt("perfil");
                        String perfil_info = rs.getString("perfil_info");

                        // Campos > Entidad
                        Usuario usuario = new Usuario(id, user, pass, avatar, perfil, perfil_info);
                        // Entidad > Lista
                        usuarios.add(usuario);
                    }
                }
            }
        } catch (NullPointerException | SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }

        // Retorno Lista
        return usuarios;
    }

}
