<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Cinema Life </title>

        <!-- References -->
        <meta name="author" content="Julian David Ramos Gomez - juli12319@hotmail.com" />
        <meta name="description" content=" Cinema Life - Visita Galeria " />

        <!-- Configuration -->
        <meta name="keywords" content="HTML CSS JS" />
        <meta name="robots" content="noindex, nofollow" />

        <!-- Viewport Setup for mobile devices -->
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1.0, shrink-to-fit=no"
            />

        <!-- Favicon -->
        <link rel="icon" href="img/favicon.ico" type="image/x-icon" />

        <!-- Style Sheet Links -->
        <link rel="stylesheet" href="public/css/partial/header.css"/>
        <link rel="stylesheet" href="public/css/visita/visita-galeria.css"/>
        <link rel="stylesheet" href="public/css/partial/footer.css"/>
    </head>
    <body>

        <div id="container">

            <%@include file="../partial/header.jspf" %>
            <nav> 
                <a href="?cmd=visita-accion"> Accion </a>
                <a href="?cmd=visita-aventura"> Aventuras </a>
                <a href="?cmd=visita-ficcion"> Ciencia Ficcion </a>
                <a href="?cmd=visita-comedia"> Comedia </a>
                <a href="?cmd=visita-drama"> Drama </a>
                <a href="?cmd=visita-suspense"> Suspense </a>
                <a href="?cmd=visita-terror"> Terror </a>
            </nav>
            <main>
                <h1> Peliculas de Drama <img src="public/img/cine-accion.png" alt="Logo Cine Drama"/></h1>
                <div>
                    <h2> Nietzshe lloró </h2>
                    <img src="public/img/drama/dia-nietzshe.jpg" alt="El día en que Nietzche lloró"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> La defensa del Dragón </h2>
                    <img src="public/img/drama/defensa-dragon.jpg" alt="La defensa del Dragón"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Mujeres de la noche </h2>
                    <img src="public/img/drama/mujeres-noche.jpg" alt="Mujeres de la noche"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Said </h2>
                    <img src="public/img/drama/said.jpg" alt="Said"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Yi yi </h2>
                    <img src="public/img/drama/yiyi.jpg" alt="Yi yi"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Bhonsle </h2>
                    <img src="public/img/drama/bhonsle.jpg" alt="Bhonsle"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Tricked </h2>
                    <img src="public/img/drama/tricked.jpg" alt="Tricked"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Sly </h2>
                    <img src="public/img/drama/sly.jpg" alt="Sly"/>
                    <a href="#"> Descripcion </a>
                </div>
            </main>
            <%@include file="../partial/footer.jspf" %>

        </div>
        <script src="public/js/visita/visita-landing.js"></script>
    </body>
</html>
