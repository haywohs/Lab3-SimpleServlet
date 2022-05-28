<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First:</label>
            <input type="text" name="firstnum" value="${first}">
            <br>
            <label>Second:</label>
            <input type="text" name="secondnum" value="${second}">
            <br>
            <input type="submit" name="operator" value="+">
            &nbsp;
            <input type="submit" name="operator" value="-">
            &nbsp;
            <input type="submit" name="operator" value="*">
            &nbsp;
            <input type="submit" name="operator" value="%">
            <br><br>
            <p>Result: ${line}${message}${display}</p>
            <a href="age">Age Calculator</a>
        </form>

    </body>
</html>
