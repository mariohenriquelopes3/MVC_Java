<%@ page import="controle.Home" %>
<html>
<body>
	<h2>Home</h2>
	
	<% Home controle = (Home) request.getAttribute(Home.ATTR_CONTROLE); %>
	<%=controle.getLista() %>
</body>
</html>