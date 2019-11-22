<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create person</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid">
		<%@ include file="includes/navigation.jsp" %>
		
		<h1 class="text-center">Create person</h1>
		<form class="form" action="PersonaServlet" method="post">
			<div class="form-group col-md-4">
				<label for="txtNombre">Nombre</label>
				<input class="form-control" id="txtNombre" type="text" name="txtNombre" required>
			</div>
			<div class="form-group col-md-4">
				<label for="txtCarrera">Carrera</label>
				<input class= "form-control" id="txtCarrera" type="text" name="txtCarrera" required>
			</div>
			<div class="form-group col-md-4">
				<label for="txtEdad">Edad</label>
				<input class="form-control" id="txtEdad" type="number" name="txtEdad" required>
			</div>
			<input type="submit" class="btn btn-primary" value="Save">
		</form>		
	</div>
</body>
</html>