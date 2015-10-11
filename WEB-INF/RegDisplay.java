import java.io.*;
import java.util.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.Enumeration ;
import java.sql.*;



public class RegDisplay extends HttpServlet
{

	public void service( HttpServletRequest request, HttpServletResponse res ) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter	out	= res.getWriter();
		
		String sqlStmt = "select * from register";
		
		out.print("Before registering driver ");
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con;
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","teja861992");
		Statement stmt = con.createStatement();
		ResultSet rs=stmt.executeQuery(sqlStmt);
		out.println("Used :" +sqlStmt);
		while(rs.next())
		{
		out.println(rs.getString(1)+rs.getString(2));
		}		

		con.close();
		}catch(Exception e){
			out.print("Falied to store "+ e);
		}
		
		
	}
}
