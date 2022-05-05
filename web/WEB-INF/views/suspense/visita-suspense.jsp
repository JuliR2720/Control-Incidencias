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
                <h1> Peliculas de Suspense <img src="public/img/cine-accion.png" alt="Logo Cine suspense"/></h1>
                <div>
                    <h2> Atrapados </h2>
                    <img src="public/img/suspense/atrapados.jpg" alt="Atrapados en la Oscuridad"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Visitante </h2>
                    <img src="public/img/suspense/visitante.jpg" alt="Visitante"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Espíritu Sagrado </h2>
                    <img src="public/img/suspense/espiritu.jpg" alt="Espíritu Sagrado"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Till Death </h2>
                    <img src="public/img/suspense/till-death.jpg" alt="Till Death. Hasta que la muerte nos separe"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Tiburon Blanco </h2>
                    <img src="public/img/suspense/tiburon-blanco.jpg" alt="Tiburon Blanco"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Pequeños Detalles </h2>
                    <img src="public/img/suspense/pequeños.jpg" alt="Pequeños Detalles"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> La Maldicion </h2>
                    <img src="public/img/suspense/la-maldicion.jpg" alt="La Maldicion de Lake Manor"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Salvaje </h2>
                    <img src="public/img/suspense/salvaje.jpg" alt="Salvaje"/>
                    <a href="#"> Descripcion </a>
                </div>
            </main>
            <%@include file="../partial/footer.jspf" %>

        </div>
        <script src="public/js/visita/visita-landing.js"></script>
    </body>
</html>
