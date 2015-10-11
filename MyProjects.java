import java.io.*;
import java.util.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class MyProjects extends GenericServlet
{
public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
{
PrintWriter pw=res.getWriter();
String id=req.getParameter("phase");

pw.println("<html><body>");
pw.println("<form action='http://localhost:8000/Ravi/MyProjects' method='GET'>");
pw.println("Phase<select size='1' name='phase'>");
pw.println("<option selected='selected' value='In Progress'>In Progress</option>");
pw.println("<option value='In Planning'>In Planning</option>");
pw.println("<option value='On Hold'>On Hold</option>");
pw.println("<option value='Archived'>Archived</option>");
pw.println("</select><input type='submit' value='Go'/>");
pw.println("<br /><br />");
pw.println("<table border='0' cellpadding='20'><tr><td>Project</td><td>Start</td><td>Deadline</td><td>Phase</td><td>Schedule Status</td><td>Manager</td></tr>");

try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","teja861992");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from MyProjects where Phase='"+id+"'");
while(rs.next())
{
pw.println("<tr><td>"+rs.getString("Project")+"</td>"+"<td>"+rs.getString("Startdate")+"</td>"+"<td>"+rs.getString("Deadline")+"</td>"+"<td>"+rs.getString("Phase")+"</td>"+"<td>"+rs.getString("schedulestatus")+"</td>"+"<td>"+rs.getString("Manager")+"</td></tr></table>");
}
pw.println("</form></body></html>");
con.close();
}
catch(Exception e)
{
}
}
}
