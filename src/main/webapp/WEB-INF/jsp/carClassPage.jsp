<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Car Class Page</title>
    <link rel="stylesheet" href="css/helloPage_registration.css">
</head>
<body>
    <c:forEach var="car" items="${requestScope.cars}">
        <p>${car.brand} ${car.model}</p>
        <br>
    </c:forEach>
</body>
</html>
