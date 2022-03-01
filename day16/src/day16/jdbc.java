package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sample","root","Pass@@123");

		Statement st = con.createStatement();
		
		String query = "Create table Customer(ID int Primary key  , SName varchar(20), SMark int )";
		
		st.executeUpdate(query);
		System.out.println("Customer Table Create Successfully");
		
	}

}
