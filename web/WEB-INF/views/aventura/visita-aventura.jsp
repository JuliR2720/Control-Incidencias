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
                <h1> Peliculas de Aventura <img src="public/img/cine-accion.png" alt="Logo Cine Aventura"/></h1>
                <div>
                    <h2> Malefica </h2>
                    <img src="public/img/aventura/malefica.jpg" alt="Malefica"/>
                    <a href=""> Descripcion </a>
                </div>
                <div>
                    <h2> Los Muppets </h2>
                    <img src="public/img/aventura/muppets.jpg" alt="Los Muppets"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> En Solitario </h2>
                    <img src="public/img/aventura/en-solitario.jpg" alt="En Solitario"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Futbolín </h2>
                    <img src="public/img/aventura/futbolin.jpg" alt="Futbolín"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> El Hobbit  </h2>
                    <img src="public/img/aventura/hobbit.jpg" alt="El Hobbit: La desolación de Smaug"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> After Earth </h2>
                    <img src="public/img/aventura/after.jpg" alt="After Earth"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Paul </h2>
                    <img src="public/img/aventura/paul.jpg" alt="Paul"/>
                    <a href="#"> Descripcion </a>
                </div>
                <div>
                    <h2> Twister </h2>
                    <img src="public/img/aventura/twister.jpg" alt="Twister"/>
                    <a href="#"> Descripcion </a>
                </div>
            </main>
            <%@include file="../partial/footer.jspf" %>

        </div>
        <script src="public/js/visita/visita-landing.js"></script>
    </body>
</html>
