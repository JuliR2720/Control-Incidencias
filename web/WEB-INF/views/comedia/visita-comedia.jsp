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
                <h1> Peliculas de Comedia <img src="public/img/cine-accion.png" alt="Logo Cine Comedia"/></h1>
                <div>
                    <h2> ¿Que me pasa Doctor? </h2>
                    <img src="public/img/comedia/que-me-pasa.jpg" alt="¿Que me pasa Doctor?"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> El Circo </h2>
                    <img src="public/img/comedia/el-circo.jpg" alt="El Circo"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> El rey pasmado </h2>
                    <img src="public/img/comedia/el-rey.jpg" alt="El rey pasmado"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> La Vida de Brian </h2>
                    <img src="public/img/comedia/la-vida-brian.jpg" alt="La Vida de Brian"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Nightlife </h2>
                    <img src="public/img/comedia/nightlife.jpg" alt="Nightlife"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Los Productores </h2>
                    <img src="public/img/comedia/los-productores.jpg" alt="Los Productores"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Siete Ocasiones </h2>
                    <img src="public/img/comedia/siete-ocasiones.jpg" alt="Siete Ocasiones"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Cuento de Verano </h2>
                    <img src="public/img/comedia/cuento-verano.jpg" alt="Cuento de Verano"/>
                    <a href="#"> Descripcion </a>
                </div>
            </main>
            <%@include file="../partial/footer.jspf" %>

        </div>
        <script src="public/js/visita/visita-landing.js"></script>
    </body>
</html>
