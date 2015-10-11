function validate()
	   {
		   var str=Form1.username.value;
		   var pat=/^(\d\d\d\d\d\d\d\d\d\d)+$/;
		   if((Form1.username.value=="")||(Form1.password.value==""))
		   {
					
				window.alert("Please enter the values");
				document.Form1.username.focus();
				return false;
		   }
		  if(Form1.username.value.length<6)
				{
			      window.alert("Your username should contain atleast 6 characters");
				  document.Form1.username.value="";
				  document.Form1.password.value="";
				  document.Form1.username.focus();
				  return false;
				}
		 if(Form1.password.value.length<6)
				{
				  window.alert("Your password should contain atleast 6 characters");
				  document.Form1.username.value="";
				  document.Form1.password.value="";
				  document.Form1.password.focus();
				  return false;
				}
				if(!pat.test(str))
				{
					window.alert("username must contain numbers only");
					return false;
				}
		 
			  return true;
	   }
	  