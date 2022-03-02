<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"
         errorPage="errorPage.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Hello Page</title>
    <%--    <link rel="stylesheet" href="css/helloPage_registration.css">--%>

    <fmt:setLocale value="${sessionScope.locale}"/>
    <fmt:setBundle basename="local" var="loc"/>

    <fmt:message bundle="${loc}" key="locale.locbutton.name.en" var="en_button"/>
    <fmt:message bundle="${loc}" key="locale.locbutton.name.ru" var="ru_button"/>
    <fmt:message bundle="${loc}" key="locale.locbutton.name.signup" var="sign_button"/>
    <fmt:message bundle="${loc}" key="locale.locbutton.name.login" var="login_button"/>
    <fmt:message bundle="${loc}" key="locale.name.login" var="login_name"/>
</head>git

<body>
<form class="box" action="controller" method="post">
    <h1>${login_name}</h1>
    <input type="text" name="login" placeholder="Username">
    <input type="password" name="password" placeholder="Password">
    <input type="hidden" name="command" value="Log in">
    <input type="submit" value="${login_button}"/>
    <hr>
    <h3>
        <a href="controller?command=GO_TO_REGISTRATION_PAGE">${sign_button}</a>
    </h3>
    <hr>

</form>

<form action="controller" method="get">
    <input type="hidden" name="command" value="ru">
    <input style="color: #c2be14" type="submit" value="${ru_button}">
</form>
<form action="controller" method="get">
    <input type="hidden" name="command" value="en">
    <input style="color: #0bd0c9" type="submit" value="${en_button}">
</form>

<br>

</body>
</html>
