<%@ page  contentType="text/html" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employee Registration</title>
</head>
<body>
<H1>Employee Registration</H1>
<form:form action="addRegistration" modelAttribute="emp">
<table>
    <tr>
        <td>Name</td>
        <td><form:input type="text" path="name"/>
    </tr>
    <tr>
        <td>Department</td>
        <td><form:input type="text" path="department"/>
    </tr>
    <tr>
            <td>Designation</td>
            <td><form:input type="text" path="designation"/>
        </tr>
    <tr>
        <td colspan=2><input type="submit" value="Add" /></td>
    </tr>
</table>

</form:form>

</body>
</html>