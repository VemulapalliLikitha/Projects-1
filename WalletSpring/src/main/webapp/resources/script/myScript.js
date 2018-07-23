function validationForm(){
	var uname=myForm.username.value;
	var pass=myForm.password.value;
	var flag=false;
	if(uname==""||uname==null){
		document.getElementById("errMsg").innerHTML="Please enter Username";
	}
	else if(pass==""||pass==null){
		flag=false;
		document.getElementById("userErrMsg").innerHTML="Please enter Username";
		document.getElementById("passErrMsg").innerHTML="Please enter Password";
	}
	else{
		flag=true;
		document.getElementById("userErrMsg").innerHTML="";
		document.getElementById("passErrMsg").innerHTML="";
	}
}