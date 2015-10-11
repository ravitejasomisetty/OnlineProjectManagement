// JavaScript Document
function validate()
{
	var str=newreg.uname.value;
		   var pat=/^(\d\d\d\d\d\d\d\d\d\d)+$/;
		   if((newreg.uname.value=="")||(newreg.pwd.value==""))
		   {
					
				window.alert("Please enter the values");
				document.newreg.uname.focus();
				return false;
		   }
		  if(newreg.uname.value.length<6)
				{
			      window.alert("Your username is no lessthan 10 digits");
				  document.newreg.uname.value="";
				  document.newreg.pwd.value="";
				  document.newreg.uname.focus();
				  return false;
				}
		 if(newreg.pwd.value.length<6)
				{
				  window.alert("Your password should contain atleast 6 characters");
				  document.newreg.uname.value="";
				  document.newreg.pwd.value="";
				  document.newreg.pwd.focus();
				  return false;
				}
				if(!pat.test(str))
				{
					window.alert("username must contain numbers only");
					return false;
				}
		 
			  return true;
}