import java.io.*;
import javax.servlet.*;
import java.util.*;
public class Servlet2 extends GenericServlet
{
public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException
{
PrintWriter pw=res.getWriter();
pw.println("S2");

pw.close();
}
}