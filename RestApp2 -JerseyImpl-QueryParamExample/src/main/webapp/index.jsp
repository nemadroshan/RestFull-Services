<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 28-03-2020
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Form</title>
</head>
<body>
<h1 style="color: rebeccapurple;text-align: center">Product Registration Form </h1>
<div align="center">
    <form action="rest/product/register" method="post">
        <input type="text" name="pid" placeholder="Product Id"><br><br>
        <input type="text" name="pname" placeholder="Product Name"/><br><br>
        <input type="text" name="mrfDate" placeholder="Manufacturing Date"/><br><br>
        <input type="text" name="expDate" placeholder="Expiry Date"/><br><br>
        <input type="submit" value="Save"> &nbsp;&nbsp;<input type="reset" value="Reset"/>
    </form>
</div>
</body>
</html>