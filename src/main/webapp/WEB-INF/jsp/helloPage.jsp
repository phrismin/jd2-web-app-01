<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"
         errorPage="error.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Hello Page</title>
    <link rel="stylesheet" href="css/helloPage_registration.css">
</head>
<body>
    <form class="box" action="controller" method="post">
        <h1>Log in</h1>
            <input type="text" name="login" placeholder="Username" >
            <input type="password" name="" placeholder="Password" >
            <input type="hidden" name="command" value="Log in">
            <input type="submit" value="Log In"/>
            <hr>
            <h3>
                <a href="controller?command=GO_TO_REGISTRATION_PAGE">Sign Up</a>
            </h3>
<%--            <c:forEach var="car" items="${requestScope.cars}">--%>
<%--                <p><c:out value="${car.type} - ${car.name}"/></p>--%>
<%--            </c:forEach>--%>
        </form>
</body>
</html>