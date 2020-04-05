<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 05-04-2020
  Time: 08:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Book Registraton Detail</title>
</head>
<body>
<h2 align="center">Book Registraton </h2><br>
<h3>${responseDTO.message}</h3>
<div>
    <form action="bookServlet" method="post"   >
        Isbn : <input type="text" name="isbn"><br><br>
        Title: <input type="text" name="title"><br><br>
        Author:<input type="text" name="author"><br><br>
        Price : <input type="text" name="price"><br><br>
        <input type="submit" value="Register">
    </form>
</div>
</body>
</html>
