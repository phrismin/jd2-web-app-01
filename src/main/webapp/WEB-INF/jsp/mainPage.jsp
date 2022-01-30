<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"
         errorPage="errorPage.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Main Page</title>
    <link rel="stylesheet" href="css/mainPage.css">
</head>
<body>
<main>
    <h3>
        Login: <c:out value="${sessionScope.userName}"/>
        <br>
        Role: <c:out value="${sessionScope.role}"/>
    </h3>
    <br>

    <c:forEach var="car" items="${requestScope.mapCar.entrySet()}">
        <a style="color: antiquewhite" href="controller?command=GO_TO_${car.getValue()}_CAR_PAGE">${car.getKey()}</a>
        <br>
    </c:forEach>

</main>
</body>
</html>
