<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Abbiamo fatto una scelta in precedenza che è: ${sceltaDaController }

Ora inserisci il testo
<form action="contaVocaboli" method="post">
<input type="text" name="testo" placeholder="Inserisci testo" >


<input type="hidden" name="scelta" value = ${sceltaDaController} >
<input type="submit" value="analizza">
</form>

</body>
</html>