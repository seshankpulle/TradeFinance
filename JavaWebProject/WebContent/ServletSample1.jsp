<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Servlet Sample</title>
</head>
<body>

<h1>Servlet Sample</h1>

<form action="${pageContext.request.contextPath}/ServletSample1" METHOD="POST">

<div style="background-color:lightblue">

<table>
<tr>
	<th>
	  Request: <br> 
  	<input type="text" attribute="request" name="request" size="90"><br>	
	</th>
	<th>
	  Response: <br> 
  <input type="text" attribute="response" name="response" size="90"><br>
	</th>
</tr>
	</table>  
</div>

<div style="background-color:lightgreen">
	<input type="submit" value="Submit">
</div>

  
</form>

</body>
</html>