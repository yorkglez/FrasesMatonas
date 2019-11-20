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
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <a class="navbar-brand" href="#">Navbar</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarNav">
	    <ul class="navbar-nav">
	      <li class="nav-item active">
	        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/FrasesMatonas/personas.jsp">Personas</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/FrasesMatonas/frases.jsp">Frases</a>
	      </li>
	        <li class="nav-item">
	        <a class="nav-link" href="/FrasesMatonas/crearfrase.jsp">Crear frases</a>
	      </li>
	        <li class="nav-item">
	        <a class="nav-link" href="/FrasesMatonas/crearpersona.jsp">Crear personas</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
	      </li>
	    </ul>
	  </div>
	</nav>
	
		<h1 class="text-center">Create person</h1>
		<form class="form-row" action="PersonaServlet" method="post">
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
				<input class="form-control" id="txtEdad" type="text" name="txtEdad" required>
			</div>
			<input type="submit" class="btn btn-primary" value="Save">
		</form>		
	</div>
</body>
</html>