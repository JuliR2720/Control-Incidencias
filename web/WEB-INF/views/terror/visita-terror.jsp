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
                <h1> Peliculas de Terror <img src="public/img/cine-accion.png" alt="Logo Cine Terror"/></h1>
                <div>
                    <h2> ¿Quien puede? </h2>
                    <img src="public/img/terror/quien-puede.jpg" alt="¿Quien puede Matar a un niño?"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Zombie </h2>
                    <img src="public/img/terror/zombie.jpg" alt="Zombie: El regreso de los muertos vivientes"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Carrera con el Diablo </h2>
                    <img src="public/img/terror/carrera.jpg" alt="Carrera con el Diablo"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Muertos y Enterrados </h2>
                    <img src="public/img/terror/muertos-enterrados.jpg" alt="Muertos y Enterrados"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Hellraiser  </h2>
                    <img src="public/img/terror/hellraiser.jpg" alt="Hellraiser:Los que traen el Infierno"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> The Ring </h2>
                    <img src="public/img/terror/the-ring.jpg" alt="The Ring"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> La Cabaña Siniestra </h2>
                    <img src="public/img/terror/la-cabaña.jpg" alt="La Cabaña Siniestra"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Terror sin Límite </h2>
                    <img src="public/img/terror/terror-limite.jpg" alt="Terror sin Límite"/>
                    <a href="#"> Descripcion </a>
                </div>
            </main>
            <%@include file="../partial/footer.jspf" %>

        </div>
        <script src="public/js/visita/visita-landing.js"></script>
    </body>
</html>
