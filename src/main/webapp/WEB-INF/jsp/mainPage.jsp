<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"
    errorPage="error.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Main Page</title>
    <link rel="stylesheet" href="css/mainPage.css">
</head>
<body>
    <main>
        <c:set var="logInfo" scope="request" value="${param.loginationInfo}"/>
        <c:set var="regInfo" scope="request" value="${param.registrationInfo}"/>
        <c:set var="userName" scope="session" value="${sessionScope.userName}"/>
        <c:set var="userRole" scope="session" value="${sessionScope.userRole}"/>

        <c:if test="${userRole == 'user' && userName != null}" var="testIf">
            <h3>
                <c:out value="${logInfo} ${userName}(${userRole})"/>
            </h3>
        </c:if>

        <c:if test="${regInfo != null}" var="testIf">
            <h3>
                <c:out value="${regInfo}"/>
            </h3>
        </c:if>

        <c:forEach var="car" items="${requestScope.cars}">
            Cars: <p><c:out value="${car.name} ${car.type}"/></p>
        </c:forEach>
        <h5>Code from mainPage</h5>
    </main>
</body>
</html>
