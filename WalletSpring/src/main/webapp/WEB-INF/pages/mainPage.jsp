<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="./resources/CSS/myCSS.css" rel="stylesheet" type="text/css" >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Online Banking</title>
</head>
<body id="back">
<div id="bankcnt">
<h1 align="center">Capg Banking Application</h1>
</div>
<hr>
<div id="menuCnt">
<ul>
<li><a href="createAccount" target="cntframe">Create Account</a></li>
<li><a href="showbalance" target="cntframe">Show Balance</a></li>
<li><a href="deposit" target="cntframe">Deposit</a></li>
<li><a href="withdraw" target="cntframe">Withdraw</a></li>
<li><a href="transfer" target="cntframe">Fund Transfer</a></li>
<li><a href="transaction" target="cntframe">Transaction Summary</a></li>
<li><a href="logout">Logout</a></li>
</ul>
</div>

<div id="content">
<iframe name="cntframe" id="frm" src="welcomePage.jsp"></iframe>

</div>
<form>
<table>


</table>
</form>
<br><br><br><br>
<hr>
<div style="float:bottom;">
	<div style="float: left;">Capgemini FLP 2018 </div>
	<div style="margin-left: 1200px;">JEE June 2018</div>
</div>
<hr>
</body>
</html>