<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"
         errorPage="errorPage.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Main Page</title>
    <%--    <link rel="stylesheet" href="css/mainPage.css">--%>
</head>
<body>

<main>
    <p>
        <%@include file="header.jsp" %>
    </p>

    <hr>

    <h3>
        <a style="color: #563000" href="controller?command=GO_TO_CLASSES_PAGE">Classes cars</a>
    </h3>
    <hr>
    <h3>
        <c:if test="${sessionScope.role.equals('customer')}">
            <a style="color: #004960" href="controller?command=GO_TO_ORDER_PAGE">My orders</a>
        </c:if>
    </h3>


</main>
</body>
</html>
