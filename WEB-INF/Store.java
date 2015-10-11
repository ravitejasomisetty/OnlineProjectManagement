import java.io.*;
import java.util.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.Enumeration ;
import java.sql.*;



public class Store extends HttpServlet
{

	public void service( HttpServletRequest request, HttpServletResponse res ) throws ServletException, IOException
	{
		
		String id = request.getParameter("pid");
		String name = request.getParameter("pname");
		
		String sqlStmt = "insert into products values ("+id+",'"+name+"')";
		PrintWriter	out	= res.getWriter();
		out.print("Before registring driver ");
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con;
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","teja861992");
		Statement stmt = con.createStatement();
		stmt.executeUpdate(sqlStmt);
		out.println("Used :" +sqlStmt);
		con.close();
		}catch(Exception e){
			out.print("Falied to store "+ e);
		}	
	}
}
