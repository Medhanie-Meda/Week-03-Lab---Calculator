<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple JSP Calculator</h1>
        
        <form action="calculatorServlet" method="GET">
            First: <input type="text" name="first"><br/>
            Second: <input type="text" name="second"><br/>
            <input type="submit" name="operation" value="+"> 
            <input type="submit" name="operation" value="-"> 
            <input type="submit" name="operation" value="*"> 
            <input type="submit" name="operation" value="%">
        </form>
        <br/>
    <c:if test="${result != null}">
        RESULT: ${result}
    </c:if>
        
    </body>
</html>
