package database.java.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConection {
		//JDBS driver name and URL
		static final String JDBS_DRIVER = "org.h2.Driver";
		static final String DB_URL = "jdbc:h2:tcp://localhost/~/test";
		
		//database user
		static final String USER = "sa";
		static final String PASS = "";
		private static Connection conn;
		
public  DataBaseConection() {
	getDataBaseConection();
}		
		
public static Connection getDataBaseConection() {
	
	System.out.println("worc");
	try {
		//register driver
		Class.forName(JDBS_DRIVER);
		//open connection
		System.out.println("connecting to database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		return conn;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
