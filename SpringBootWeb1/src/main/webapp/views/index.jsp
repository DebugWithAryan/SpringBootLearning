<%@page language="java" %>
<html>
    <body>
        <h2>My Calculator</h2>
        <form action="add">
            <label for="num1">Enter 1st number: </label>
            <input type="text" id="num1" name="num1"><br>
            <label for="num2">Enter 2nd number: </label>
            <input type="text" id="num2" name="num2"><br>
            <input type="submit" value="submit">
        </form>
        <form action="addAlien">
            <label for="id">Enter id: </label>
            <input type="text" id="id" name="id"><br>
            <label for="name">Enter name:  </label>
            <input type="text" id="name" name="name"><br>
            <input type="submit" value="submit">
        </form>
    </body>
</html>
