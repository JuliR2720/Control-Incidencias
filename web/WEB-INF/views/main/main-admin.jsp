<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web App</title>
        <link rel="stylesheet" href="public/css/partial/header.css"/>
        <link rel="stylesheet" href="public/css/main/main-usuario.css"/>
        <link rel="stylesheet" href="public/css/partial/footer.css"/>


    </head>
    <body>

        <div id="container">

            <%@include file="../partial/header.jspf" %>
            <main>
                <h1> Estas en el Main Administrador </h1>
                <a href="?cmd=usuario-galeria"> Listado de Usuarios </a>
            </main>
            <%@include file="../partial/footer.jspf" %>

        </div>        
        <script src="public/js/main/main-usuario.js"></script>
    </body>
</html>
