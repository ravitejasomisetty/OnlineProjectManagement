import java.io.*;
import java.util.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class MyProjects_insert extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
String name=req.getParameter("name");
String phase=req.getParameter("phase");
String start=req.getParameter("start");
String deadline=req.getParameter("deadline");
String manager=req.getParameter("manager");
String sql="insert into myprojects values('"+name+"','"+start+"','"+deadline+"','"+phase+"',null,'"+manager+"')";

pw.println("Creating new project..");

try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","teja861992");
Statement st=con.createStatement();
st.executeUpdate(sql);

pw.println("Successful");


con.close();
}
catch(Exception e)
{
pw.println("error"+e);
}

}
}
