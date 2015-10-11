// JavaScript Document
function validate()
	   {
		   var str=newproject1.start.value;
		   var str1=newproject1.deadline.value;
		   var datepat=/^(\d\d\-\d\d\-\d\d)+$/;
		   if((newproject1.name.value==""))
		   {
					
				window.alert("Please enter the name of the project");
				document.newproject1.name.focus();
				return false;
		   }
		   if((newproject1.start.value==""))
		   {
					
				window.alert("Please enter the project start date");
				document.newproject1.start.focus();
				return false;
		   }
		   if((newproject1.deadline.value==""))
		   {
					
				window.alert("Please enter the deadline of the project");
				document.newproject1.deadline.focus();
				return false;
		   }
		   if((newproject1.manager.value==""))
		   {
					
				window.alert("Please enter the name of the manager");
				document.newproject1.manager.focus();
				return false;
		   }
		  
				if((!datepat.test(str)||(!datepat.test(str1))))
				{
					window.alert("date format: dd-mm-yy");
					return false;
				}
		 
			  return true;
	   }
	  