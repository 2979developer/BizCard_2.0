package DataBase;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
//	public static Connection getConnection() throws Exception {
//		String url = "jdbc:mysql://localhost:3306/bizcard_ai";
//		String user = "root";
//		String password = "ROOT"; 
//
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		return DriverManager.getConnection(url, user, password);
//	}
	
	public static Connection getConnection() throws Exception {
		String url = "jdbc:mysql://bizcard-db-bizcard-project.f.aivencloud.com:14273/defaultdb?sslmode=REQUIRED";
		String user = "avnadmin";
		String password = "AVNS_YUkC8oAfQsPM2aJ_kKg";

		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url, user, password);
	}
}
