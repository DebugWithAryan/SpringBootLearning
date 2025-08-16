<%@page language="java" %>
<html>
<body>
<%--One way--%>
<%--<h2>Num1 is : <%=  session.getAttribute("num1") %></h2>--%>
<%--<h2>Num2 is : <%= session.getAttribute("num2") %></h2>--%>
<%--<h2>Result is: <%= session.getAttribute("result") %> </h2>--%>

<%--JSTL way--%>
<h2>Num1 is : ${num1}</h2>
<h2>Num2 is : ${num2}</h2>
<h2>Result is: ${result} </h2>

<h2>Result is: ${alien} </h2>
</body>
</html>
