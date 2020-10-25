<html>
<body>
<h2>Objetos predefinidos JSP</h2>
Petición datos del navegador: <%= request.getHeader("User-Agent") %>
<br/><br/>
Petición de Idioma Usado <%= request.getLocale() %>
<jsp:include page="Calculos.jsp"></jsp:include>
</body>
</html>
