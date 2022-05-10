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
                <h1> Estas en el Main de Visita </h1>
                <img src="public/img/astronauta.jpg" alt="astronauta"/>
            </main>
            <%@include file="../partial/footer.jspf" %>

        </div>      
        <script src="http://code.jquery.com/jquery-3.6.0.js"></script>
        <script src="public/js/main/main-usuario.js"></script>

    </body>
</html>
