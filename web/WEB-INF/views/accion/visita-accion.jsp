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
                <h1> Peliculas de Accion <img src="public/img/cine-accion.png" alt="Logo Cine"/></h1>
                <div>
                    <h2> Morbius </h2>
                    <img src="public/img/accion/morbius.jpg" alt="Morbius"/>
                    <a href="?cmd=accion-morbius"> Descripcion </a>
                </div>
                <div>
                    <h2> El Francotirador </h2>
                    <img src="public/img/accion/el-francotirador.jpg" alt="El Francotirador"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> X-Men </h2>
                    <img src="public/img/accion/x-men-dias-del-futuro.jpg" alt="X-men: Dias del Futuro"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> La Lego Película </h2>
                    <img src="public/img/accion/la-lego-pelicula.jpg" alt="La Lego Pelicula"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Capitan América  </h2>
                    <img src="public/img/accion/capitan-america-soldado-invierno.jpg" alt="Capitan America: El Soldado del Invierno"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Fast & Furious 6 </h2>
                    <img src="public/img/accion/rapido-furioso-6.jpg" alt="Fast & Furious 6"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> The Karate Kid </h2>
                    <img src="public/img/accion/karate-kid.jpg" alt="Karate Kid"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Malditos Bastardos </h2>
                    <img src="public/img/accion/malditos-bastardos.jpg" alt="Malditos Bastardos"/>
                    <a href="#"> Descripcion </a>
                </div>
            </main>
            <%@include file="../partial/footer.jspf" %>

        </div>
        <script src="public/js/visita/visita-landing.js"></script>
    </body>
</html>
