package jdbcTest;

import java.sql.Connection;

public class ConnectionManager {
	
	public static Connection getConnection() {
		Connection conn = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";	// jdbc는 DB 이름
		String id = "root";
		String pwd = "1234";
		
		try {
			Class.forName(driver);
			conn = 
			System.out.println("connection success!");
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
