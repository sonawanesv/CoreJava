package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sample","root","Pass@@123");

		Statement st = con.createStatement();
		
		String query = "Create table Customer1(ID int Primary key  , SName varchar(20), SMark int )";
		String query1 = "Insert into Customer Value(2, 'Amit',40)";
		String query2 = "Delete from Customer Where ID=2";
		String query3 = "Update Customer Set SName='Shyam' Where ID=1";
		st.executeUpdate(query);
		st.executeUpdate(query2);
		st.executeUpdate(query3);
		System.out.println("Customer1 Table Create Successfully");
		
	}

}
