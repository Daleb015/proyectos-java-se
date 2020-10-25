<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Esta es la página presentación.jsp</h1>
<h3>Variable request: ${name1}</h3>
<h3>Variable Sesion: ${nameSesion}</h3>
<h3>Variable Contexto: ${nameContext}</h3>
<a href="presentacion1.jsp"> Llevar a presentación</a>
<br>
<% 
	int a=10;
	int b=5;
	int c=b+a;
	out.print(c);
%>
<br>
<%=request.getAttribute("name1") %>
<br>
<%=request.getSession().getAttribute("nameSesion") %>
<br>
<%=getServletContext().getAttribute("nameContext") %>

</body>
</html>