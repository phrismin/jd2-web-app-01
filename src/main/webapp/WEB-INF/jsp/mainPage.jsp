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
    <p>
        <%@include file="header.jsp" %>
    </p>

    <hr>

    <h3>
        <p style="color: #5cc58f">
            Login: <c:out value="${sessionScope.userName}"/>
            <br>
            Role: <c:out value="${sessionScope.role}"/>
        </p>
        <br>
        <hr>

        <h3>
            <a style="color: antiquewhite" href="controller?command=GO_TO_CLASSES_PAGE">Classes cars</a>
        </h3>

<%--        <c:forEach var="carClass" items="${requestScope.carClasses}">--%>
<%--            <a style="color: antiquewhite"--%>
<%--               href="controller?command=GO_TO_${carClass.toUpperCase()}_CAR_PAGE">${carClass}</a>--%>
<%--            <br>--%>
<%--        </c:forEach>--%>
    </h3>

    <hr>
    <h3>

    </h3>

</main>
</body>
</html>
