package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC2 {

	public static void main(String[] args) throws Exception {
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sample","root","Pass@@123");
		
		Statement st = cn.createStatement();
		            //this is used for table creation
		//String query = "Create Table Salary1 (ID int Primary key, EName varchar(20), SAmount int)";
		           //This is used for value insertion
		//String query1 = "Insert into Salary1 Value( 3 , 'Dipak', 20000 )";
		           //this is used for update values 
		//String query2 = "Update Salary set EName = 'Shubham' Where ID = 2";
		          //this is used for delete
		//String query3 = "Delete From Salary1 Where ID = 3";
		
		ResultSet rs = st.executeQuery("SELECT ID,EName, SAmount FROM Salary1");
		while(rs.next())
		{
				
			System.out.print(rs.getString(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");	
			System.out.println(" ");
			
		}
		//st.executeUpdate(query);
		//st.executeUpdate(query1);
		//st.executeUpdate(query2);
		//st.executeUpdate(query3);
		
		//System.out.println("Table Created Sucessfully");
		//System.out.println("Value Inserted Sucessfully");
		//System.out.println("Value Update Sucessfully");
		//System.out.println("Value Deleted Sucessfully");

	}

}
