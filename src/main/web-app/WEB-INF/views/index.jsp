
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Customer manager</title>
</head>
<body>

<div align="center">
    <h1>Customer manager</h1>
    <form method="get" action="search">
        <input type="text" name="keyword">
        <input type="submit" name="Search">
    </form>
    <h3><a href="/create">Create new customer</a></h3>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td aria-readonly="true">${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.email}</td>
            <td>${customer.address}</td>
            <td><a href="/edit?id=${customer.id}">Edit</a></td>
            <td><a href="/delete?id=${customer.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>

</div>

</body>
</html>
