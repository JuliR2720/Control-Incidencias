<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Cinema Life </title>

        <!-- References -->
        <meta name="author" content="Julian David Ramos Gomez - juli12319@hotmail.com" />
        <meta name="description" content=" Cinema Life - Visita Landing " />

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
        <link rel="stylesheet" href="public/css/usuario/usuario-registro.css"/>
        <link rel="stylesheet" href="public/css/partial/footer.css"/>
    </head>
    <body>

        <div id="container">

            <%@include file="../partial/header.jspf" %>
            <main>
                <h2> Registro </h2>

                <form method="post" accept-charset="Windows-1252">
                    <div>
                        <label for="user"> Usuario </label>
                        <input 
                            id="user" 
                            type="text" 
                            name="user"
                            required
                            pattern="\w{3,20}"
                            autocomplete="username"
                            />
                    </div>
                    <div>
                        <label for="password">Password</label>
                        <input 
                            id="password" 
                            type="password" 
                            name="password"
                            required
                            pattern="\w{3,20}"
                            autocomplete="current-password"/>
                    </div>
                    <div>
                        <button type="submit">Acceder</button>
                        <button type="reset">Reiniciar</button>
                    </div>
                </form>        
            </main>
            <%@include file="../partial/footer.jspf" %>

        </div>

        <script src="public/js/usuario/usuario-registro.js"></script>
    </body>
</html>
