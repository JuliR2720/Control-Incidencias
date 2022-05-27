<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.japo.java.entities.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
// Datos Inyectados
    List<Usuario> usuarios = (ArrayList<Usuario>) request.getAttribute("usuarios");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Galeria de Usuarios </title>        

        <link rel="stylesheet" href="public/css/partial/header.css"/>
        <link rel="stylesheet" href="public/css/usuario/usuario-listado.css"/>
        <link rel="stylesheet" href="public/css/partial/footer.css"/>

    </head>


    <body>

        <div id="container">
            <%@include file="../partial/header.jspf" %>
            <main>
                <div>
                    <% for (Usuario u : usuarios) {%>
                    <a href="#">
                        <img src="<%= u.getAvatar()%>" alt="avatar"/>
                        <p><%= u.getUser()%></p>
                        <p><%= u.getPerfilInfo()%></p>
                    </a>
                    <%}%>
                </div>
                <div>
                    <a href="?cmd=usuario-login&op=proceso"> Volver </a>
                </div>
            </main>
            <%@include file="../partial/footer.jspf" %>
        </div>     

        <script src="public/js/usuario/usuario-galeria.js"></script>
    </body>
</html>
