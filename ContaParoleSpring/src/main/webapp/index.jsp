<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="sceltaAzione" method="post">

		<input type="radio" value="parole" id="parole" name="scelta">
		<label for="parole">Conta parole</label><br> <input type="radio"
			value="voc" id="vocali" name="scelta"> <label
			for="vocali">Conta vocali</label><br> <input type="radio"
			value="cons" id="consonanti" name="scelta"> <label
			for="consonanti">Conta consonanti</label><br> <input type="submit"
			value="Scegli i numeri adesso!!!">
	</form>


</body>
</html>