<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Estado</title>

		
		<!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    
     <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    
    	<link rel="stylesheet" type="text/css" href="css/estilo.css">
		<script src = js/jquery.js></script>
		<script src = js/index.js></script>
</head>
<body>
	<div class="row div">
		<form> 
			<input type = "text" placeholder = "Nome" name = "estado_nome" id = "tf_estado" />
			<input type = "text" placeholder = "Sigla" name = "estado_sigla" id = "tf_sigla"/>
			<input type = "text" placeholder = "Status" name = "estado_status" id = "slc_status"/>
	
			<input class="button" type = "button" value="Salvar" id="btn-salvar" />
		</form>
	</div>
</body>
</html>