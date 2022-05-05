<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web App</title>
        <link rel="stylesheet" href="public/css/partial/header.css"/>
        <link rel="stylesheet" href="public/css/message/recurso-inaccesible.css"/>
        <link rel="stylesheet" href="public/css/partial/footer.css"/>

    </head>
    <body>
        <div id="container">

            <%@include file="/WEB-INF/views/partial/header.jspf" %>
            <main>
                <h2> La Página que usted solicita no está disponible </h2>
                <p>Disculpe, estamos teniendo un problema en la ejecución de su peticion.</p>
                <p>Es posible que su link o enlace no exista.</p>
                <p>Por favor, consulte el enlace para más información.</p>
                <a href="/control-incidencias?cmd=visita-landing"> Continuar </a>
            </main>
            <%@include file="/WEB-INF/views/partial/footer.jspf" %>

        </div>   
        <script src="public/js/message/recurso-inaccesible.js"></script>
    </body>
</html>
