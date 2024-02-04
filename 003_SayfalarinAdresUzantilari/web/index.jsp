<%-- 
    Document   : index
    Created on : 01.Şbt.2024, 12:20:21
    Author     : Hüseyin AYDIN
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Sayfasıdır!</title>
    </head>
    <body>
        <h1>Selamu Aleyküm Dayıoğlu!</h1><br />
        <%
            for(int i = 1; i <= 10; i++){
                out.println("Selam" + i + "<br />");
            }
        %>
        
        <%=
            new Date()
        %>
    </body>
</html>