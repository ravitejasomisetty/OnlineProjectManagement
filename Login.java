import java.io.*;
import java.util.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Login extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
String uname=req.getParameter("username");
String pwd=req.getParameter("password");
String x;


try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","teja861992");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select password from login where username='"+uname+"'");
while(rs.next())
{
x=rs.getString("password");
if(pwd.equals(x))
res.sendRedirect("http://localhost:8000/Ravi/index.html");
else
pw.println("Incorrect username or password");
}
con.close();
}
catch(Exception e)
{
pw.println("error"+e);
}

}
}
