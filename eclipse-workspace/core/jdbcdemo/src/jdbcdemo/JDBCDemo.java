package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo 
{{
	try 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql:localhost://3306:kush","root","root");
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery("Select * from result");
		
		while (rs.next()) 
		{
			int rollno=rs.getInt("rollno");
			String name=rs.getString("name");
			String Result=rs.getString("Result");
			String grade=rs.getString("grade");
			
			 System.out.print("rollno: " + rollno);
	         System.out.print(", name: " + name);
	         System.out.print(", Result: " + Result);
	         System.out.println(", grade: " + grade);
			
			
			
		
			
		}
		
		
	} 
	catch (Exception e) 
		{
		// TODO: handle exception
		}

}
}