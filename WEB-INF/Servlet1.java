import java.io.*;
import javax.servlet.*;
import java.util.*;
public class Servlet1 extends GenericServlet
{
public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException
{
PrintWriter pw=res.getWriter();
pw.println("S1");
ServletContext sc=getServletContext();
RequestDispatcher rd=sc.getRequestDispatcher("/Servlet2");
pw.println("pothundi");
rd.forward(req,res);
pw.println("poyochindhi");
pw.close();
}
}