<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cars Car Page</title>
<%--    <link rel="stylesheet" href="css/carClassPage.css">--%>
</head>
<body>
<div>
    <p>
        <%@include file="header.jsp" %>
    </p>

    <c:forEach var="classCar" items="${requestScope.classes}">
        <a style="color: coral"
           href="controller?command=GO_TO_${classCar.toUpperCase()}_CAR_PAGE">${classCar}</a>
        <br>
        <br>
    </c:forEach>
</div>


</body>
</html>
