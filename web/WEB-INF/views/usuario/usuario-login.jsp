<%@page import="org.japo.java.libraries.UtilesUsuarios"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Cinema Life </title>

        <!-- References -->
        <meta name="author" content="Julian David Ramos Gomez - juli12319@hotmail.com" />
        <meta name="description" content=" Cinema Life - Login " />

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
        <link rel="stylesheet" href="public/css/usuario/usuario-login.css"/>
        <link rel="stylesheet" href="public/css/partial/footer.css"/>
    </head>
    <body>

        <div id="container">

            <%@include file="../partial/header.jspf" %>
            <main>
                <h2>Login</h2>

                <form action="?cmd=usuario-login&op=proceso" 
                      method="post" 
                      accept-charset="ISO-8859-1">
                    <div>
                        <label for="user"> Usuario </label>
                        <input 
                            id="user" 
                            type="text" 
                            name="user"
                            required
                            pattern="<%=UtilesUsuarios.REG_USER%>"

                            />
                    </div>
                    <div>
                        <label for="pass"> Password </label>
                        <input 
                            id="pass" 
                            type="password" 
                            name="pass"
                            required
                            pattern="<%=UtilesUsuarios.REG_PASS%>"
                            />
                    </div>
                    <div>
                        <button type="submit"> Acceder </button>
                        <button type="reset"> Reiniciar </button>
                    </div>
                </form>        
            </main>
            <%@include file="../partial/footer.jspf" %>

        </div>

        <script src="public/js/usuario/usuario-login.js"></script>
    </body>
</html>
