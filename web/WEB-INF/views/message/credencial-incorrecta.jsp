<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Credenciales Incorrectas </title>
        <link rel="stylesheet" href="public/css/partial/header.css"/>
        <link rel="stylesheet" href="public/css/message/credencial-incorrecta.css"/>
        <link rel="stylesheet" href="public/css/partial/footer.css"/>

    </head>
    <body>
        <div id="container">

            <%@include file="/WEB-INF/views/partial/header.jspf" %>
            <main>
                <h2> Credencial Incorrecta </h2>
                <p> La credencial introducida no esta registrada </p>
                <a href="/control-incidencias?cmd=usuario-login"> Login </a>
            </main>
            <%@include file="/WEB-INF/views/partial/footer.jspf" %>

        </div>
    </body>
</html>
