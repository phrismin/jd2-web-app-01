<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"
         errorPage="errorPage.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Sign Up Page</title>
    <link rel="stylesheet" href="css/helloPage_registration.css">
</head>
<body>
    <form class="box" action="controller" method="post">
        <h1>Sign up</h1>

        <c:set var="greeting" scope="request" value="${requestScope.myObj}"/>
        <c:if test="${greeting != null}" var="testGreeting">
            <h3>
                <c:out value="${greeting.message}"/>
            </h3>
        </c:if>

        <c:set var="errorMessage" scope="request" value="${param.errorMessage}"/>
        <c:if test="${errorMessage != null}" var="testError">
            <h3>
                <c:out value="${errorMessage}"/>
            </h3>
        </c:if>

        <input type="hidden" login="command" value="Sign up">
        <input type="text" login="login" placeholder="Username">
        <input type="email" login="email" placeholder="Email">
        <input type="password"  login="psw" placeholder="Password">
        <input type="submit" value="Sign Up"/>
        <hr>
        <h3>
            <a href="controller?command=GO_TO_INDEX_PAGE">Back</a>
        </h3>
    </form>
</body>
</html>
