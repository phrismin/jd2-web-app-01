<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BOOKING PAGE</title>
</head>
<body>
<p>
    <%@include file="header.jsp" %>
</p>


<form class="box" action="controller" method="post">
    <h1>Booking car</h1>

    <input type="text" name="startReservDate" placeholder="Start booking time">
    <input type="text" name="endReservDate" placeholder="End booking time">
    <br>
    <br>
    <textarea name="comment">Input your desire</textarea>
    <input type="hidden" name="command" value="book">
    <br>
    <br>
    <input type="submit" value="BOOKING"/>
</form>

</body>
</html>
