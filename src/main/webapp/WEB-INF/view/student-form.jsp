<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Student Registration Form</title>
        <style>
            .error{
                color:red;
            }
        </style>
    </head>
    <body>

        <form:form action="process-form" modelAttribute="student">
            First name*: <form:input path="firstName" />
            <form:errors path="firstName" cssClass="error" />

            <br><br>

            Last name*: <form:input path="lastName" />
            <form:errors path="lastName" cssClass="error" />

            <br><br>

            Age*: <form:input path="age" />
            <form:errors path="age" cssClass="error" />

            <br><br>

            Course Code: <form:input path="courseCode" />
            <form:errors path="courseCode" cssClass="error" />

            <br><br>

            <input type="submit" value="Register" />
        </form:form>
    </body>
</html>