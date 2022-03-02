<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <c:if test="${not empty sessionScope.userName}">
        <form action="controller" method="post">
            <input type="hidden" name="command" value="Sign out">
            <input style="color: #5cc58f" type="submit" value="Log Out">
        </form>
    </c:if>
    <h3>
        <p style="color: #00572a">
            Login: <c:out value="${sessionScope.userName}"/>
            <br>
            Role: <c:out value="${sessionScope.role}"/>
        </p>
    </h3>
</div>
