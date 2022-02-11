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
    <h2><c:out value="${param.get(registrationInfo)}"/></h2>


    <c:set var="greeting" scope="request" value="${requestScope.}"/>
    <c:if test="${greeting != null}" var="testGreeting">
        <h3>
            <c:out value="${greeting.message}"/>
        </h3>
    </c:if>


    <h2><c:out value="${requestScope.get(registrationInfo)}"/></h2>

    <h3>
        Login: <c:out value="${sessionScope.userName}"/>
        <br>
        Role: <c:out value="${sessionScope.role}"/>
    </h3>
    <br>

    <c:forEach var="carClass" items="${requestScope.carClasses}">
        <a style="color: antiquewhite" href="controller?command=GO_TO_${carClass.toUpperCase()}_CAR_PAGE">${carClass}</a>
        <br>
    </c:forEach>

</main>
</body>
</html>
