
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Edit customer</title>
</head>
<body>
<form:form action="create" method="post" modelAttribute="customer">
    <table>
        <tr>
            <td>ID:</td>
            <td>
                ${customer.id}
                <form:hidden path="id"/>
            </td>
        </tr>
        <tr>
            <td>Name:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td>Address:</td>
            <td><form:input path="address"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Edit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
