package listener;

import java.sql.Connection;
import java.sql.DriverManager;

public class EstablishConnection {
	
	public static void main(String[] args) {
		
		try {
			
				Class.forName("com.mysql.cj.jdbc.Driver");
				String jdbcurl = "jdbc:mysql://localhost:3306/know_it";
				Connection con = DriverManager.getConnection(jdbcurl,"root","root");
				System.out.println("Connected");
				con.close();
				
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
