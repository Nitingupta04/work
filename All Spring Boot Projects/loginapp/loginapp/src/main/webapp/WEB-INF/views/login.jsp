<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login Form</h2>
    <form:form action="/login" modelAttribute="user">
        <table>
            <tr>
                <td>Username:</td>
                <td><form:input path="username"/></td>
                <td><form:errors path="username" cssClass="error"/></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><form:password path="password"/></td>
                <td><form:errors path="password" cssClass="error"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Login"/>
                </td>
            </tr>
        </table>
        <c:if test="${not empty errorMessage}">
            <p style="color: red;">${errorMessage}</p>
        </c:if>
    </form:form>
</body>
</html>
