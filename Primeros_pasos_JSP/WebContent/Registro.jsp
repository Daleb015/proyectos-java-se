<html>
<body>
<h2>Usuarios Registrados</h2>
Usuario confirmado: <br/>
Nombre: <%= request.getParameter("nombre") %> &nbsp;Apellido: <%=request.getParameter("apellido") %>
<jsp:include page="Fecha.jsp"></jsp:include>
</body>
</html>