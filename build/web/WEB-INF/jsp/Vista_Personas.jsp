<%-- 
    Document   : Vista_Seguros
    Created on : 14-feb-2017, 20:25:19
    Author     : Isidro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de personas:</h1>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Apellidos</th>
            </tr>
            <c:forEach var="Perso" items="${lista}">
                <tr>
                    <td><c:out value="${Perso.getId()}"></c:out></td>
                    <td><c:out value="${Perso.getNombre()}"></c:out></td>
                    <td><c:out value="${Perso.getApellidos()}"></c:out></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
