<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <div class="container">

		<h1 align="center">Sistema de Registro de Denuncias</h1>

		<h2 align="center">Inicio de Sesión</h2>

		<br> <br>
		<div style="text-align: center; padding-left: 35%">
			<div  >

				<form action="" method="post" >

					<input type="hidden" name="type" value="login">

					<div >
						<label>Correo</label> <input  type="text"
							name="txtCorreo">
					</div>

					<div >
						<label>Contraseña</label> <input 
							type="password" name="txtClave">
					</div>

					<input name="validateBtn" type="submit" 
						value="Ingresar">

				</form>

			
			</div>
		</div>

	</div>



</body>
</html>