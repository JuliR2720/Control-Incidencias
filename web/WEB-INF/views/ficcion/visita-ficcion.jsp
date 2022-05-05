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
                <h1> Peliculas de Ciencia Ficcion <img src="public/img/cine-accion.png" alt="Logo Cine Ciencia Ficcion"/></h1>
                <div>
                    <h2> Star Trek </h2>
                    <img src="public/img/ficcion/star-trek.jpg" alt="Star Trek: Mas allá"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Marte </h2>
                    <img src="public/img/ficcion/marte.jpg" alt="Marte"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Extinction </h2>
                    <img src="public/img/ficcion/extinction.jpg" alt="Extinction"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Mad Max </h2>
                    <img src="public/img/ficcion/mad-max.jpg" alt="Mad Max"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Automata  </h2>
                    <img src="public/img/ficcion/automata.jpg" alt="Automata"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Interstellar </h2>
                    <img src="public/img/ficcion/interestelar.jpg" alt="Interstellar"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Godzilla </h2>
                    <img src="public/img/ficcion/godzilla.jpg" alt="Godzilla"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Origen </h2>
                    <img src="public/img/ficcion/origen.jpg" alt="Origen"/>
                    <a href="#"> Descripcion </a>
                </div>
            </main>
            <%@include file="../partial/footer.jspf" %>

        </div>
        <script src="public/js/visita/visita-landing.js"></script>
    </body>
</html>
