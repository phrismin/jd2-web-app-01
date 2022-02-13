<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Cars Page</title>
    <link rel="stylesheet" href="css/carClassPage.css">
</head>

<body>
<div>
<p>
    <%@include file="header.jsp" %>
</p>


    <c:forEach var="car" items="${requestScope.cars}">
        <p>${car.brand} ${car.model} ${car.bodyType} ${car.color}</p>
        <br>
    </c:forEach>
</div>


</body>
</html>
