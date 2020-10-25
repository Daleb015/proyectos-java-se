<%@page import="pildorasinformaticas.com.CalculosMatematicos.*"%>
<html>
<body>
<h1>
Con métodos externos
</h1>
La suma de 5 y 7: <%= new Cálculos().metodoSuma(5, 7) %>
<br>
La resta de 5 y 7: <%= new Cálculos().metodoResta(5, 7) %>
<br>
La multiplicación es: <%= new Cálculos().metodoMultiplica(5, 7) %>
</body>
</html>