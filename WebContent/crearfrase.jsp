<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
	<div class="container-flid">
	<h1 class="text-center">Create Frase</h1>
		<form class="form-row" action="FraseServlet" method="post">
			<div class="form-group col-md-4">
				<label for="txtContenido">Contenido</label>
				<input class="form-control" id="txtContenido" type="text" name="txtContenido" required>
			</div>
			<div class="form-grou col-md-4">
				<label for="txtCantidad">Cantidad</label>
				<input class= "form-control" id="txtCantidad" type="text" name="txtCantidad" required>
			</div>
			<div class="form-group col-md-4">
				<label for="txtFechadesde">Fecha desde</label>
				<input class="form-control" id="txtFechadesde" type="date" name="txtFechadesde" required>
			</div>
			<input type="submit" class="btn btn-primary" value="Save">
		</form>
	</div>
</body>
</html>