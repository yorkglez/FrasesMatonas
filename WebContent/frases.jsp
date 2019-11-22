<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Frases</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
</head>
<body>
	<div class="container-fluid">
		<%@ include file="includes/navigation.jsp" %>
	
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Id</td>
					<th scope="col">Contenido</td>
					<th scope="col">Cantidad</td>
					<th scope="col">Fecha desde</td>
					<th scope="col">Fecha</td>
				</tr>
		</thead>
		<tbody>
			<c:forEach items="${fraseList}" var="frase">
				<tr>
					<th scope="row"><c:out value="${frase.getId()}"></c:out></th>
					<td><c:out value="${frase.getContenido()}"></c:out></td>
					<td><c:out value="${frase.getCantidad()}"></c:out></td>
					<td><c:out value="${frase.getFechaDesde()}"></c:out></td>
					<td><c:out value="${frase.getFecha()}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>