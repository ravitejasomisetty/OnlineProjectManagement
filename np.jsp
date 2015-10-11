<jsp:useBean id="user" class="com.cse.UserBean" scope="session"/>
 <HTML>
 <BODY>
 You entered<BR> Name: <%= user.getUsername() %><BR> 
Email: <%= user.getEmail() %><BR> 
Age: <%= user.getAge() %><BR>
 </BODY> 
</HTML>
