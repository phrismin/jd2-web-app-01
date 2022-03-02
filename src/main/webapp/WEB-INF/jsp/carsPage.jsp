<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Cars Page</title>
    <%--    <link rel="stylesheet" href="css/carClassPage.css">--%>
</head>

<body>
<div>
    <p>
        <%@include file="header.jsp" %>
    </p>

    <c:forEach var="car" items="${requestScope.cars}">
    <table border="">
        <caption>${car.brand} ${car.model}</caption>
        <tr>
            <th>Body type</th>
            <th>Year of issue</th>
            <th>Color</th>
            <th>Engine capacity</th>
            <th>Fuel type</th>
            <th>Transmission</th>
            <th>Number doors</th>
            <th>Number seats</th>
        </tr>
        <tr>
            <td>${car.bodyType}</td>
            <td>${car.yearOfIssue}</td>
            <td>${car.color}</td>
            <td>${car.engineCapacity}</td>
            <td>${car.fuelType}</td>
            <td>${car.transmission}</td>
            <td>${car.numberDoors}</td>
            <td>${car.numberSeats}</td>
        </tr>
        <br>
        <br>
        <form action="controller" method="get">
            <input type="hidden" name="command" value="select"<c:out value="${car.id}"/>>
            <input type="hidden" name="carId" value=<c:out value="${car.id}"/>>
            <input style="color: #7a6502" type="submit" value="SELECT">
        </form>
        </c:forEach>
</div>


</body>
</html>
