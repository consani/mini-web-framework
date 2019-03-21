<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Testando objetos implícitos</title>
</head>
<body>

<form action="/mini-framework/controller">
		
	Nome:
	<input type="text" name="nome"/>
	<br>
	Login:
	<input type="text" name="login"/>
	<br>
	Senha:
	<input type="text" name="senha"/>
	<br>
	<input type="submit" name=acao  value="adicionar"/>
	<input type="submit" name=acao  value="remover"/>
	<input type="submit" name=acao  value="consultar"/> 
 
</form>


</body>
</html>