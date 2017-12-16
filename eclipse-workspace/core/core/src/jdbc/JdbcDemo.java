package jdbc;

import java.sql.Statement;
import java.sql.*;


public class JdbcDemo
{
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("entered");
			Connection con =DriverManager.getConnection("jdbc:mysql:localhost://3306:kush","root","root");
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("Select * from result");
			
			while (rs.next()) 
			{
				int rollno=rs.getInt("rollno");
				String name=rs.getString("name");
				String Result=rs.getString("Result");
				String grade=rs.getString("grade");
				System.out.println("class loaded");
				
			
				
			}
			
			
		} catch (Exception e) {
			System.out.println("class could not load");
			// TODO: handle exception
		}
		
	}

}
