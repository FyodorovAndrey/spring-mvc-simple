<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Search results</title>
</head>
<body>
<div align="center">
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
        </tr>
        <c:forEach items="${customers}" var="customer">
            <tr>
                <td aria-readonly="true">${customer.id}</td>
                <td>${customer.name}</td>
                <td>${customer.email}</td>
                <td>${customer.address}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
