<%@page import="beans.PoliciaDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">LISTADO DE POLICIAS</h1>
<table>
		<tr>
			<th>CÓDIGO</th>
			<th>NOMBRES</th>
			<th>APELLIDOS</th>
			<th>CARGO</th>
			<th>DNI</th>
			<th>COMISARIA</th>
			<th>SEXO</th>
			<th colspan="2">ACCIONES</th>
		</tr>
		<%
			ArrayList<PoliciaDTO> lista = (ArrayList<PoliciaDTO>) request.getAttribute("data");

				if (lista != null) {
			for (PoliciaDTO xPol : lista) {
				out.println("<tr>");
				out.println("<td>" + xPol.getCodpol() + "</td>");
				out.println("<td>" + xPol.getNompol() + "</td>");
				out.println("<td>" + xPol.getApepol() + "</td>");
				out.println("<td>" + xPol.getCargo() + "</td>");
				out.println("<td>" + xPol.getDni() + "</td>");
				out.println("<td>" + xPol.getCodcom() + "</td>");
				out.println("<td>" + xPol.getSexo() + "</td>");
				out.println("<td align='center'><a href='ServletPolicia?tipo=buscar&cod=" + xPol.getCodpol() + "'>"
				+ "<img src='img/editado.png' title='Editar'></a></td>");
				out.println("<td align='center'><a href='ServletPolicia?tipo=eliminar&cod=" + xPol.getCodpol() + "'>"
				+ "<img src='img/eliminado.png' title='Eliminar'></a></td>");
				out.println("</tr>");
			}
				}
		%>
	</table>

</body>
</html>