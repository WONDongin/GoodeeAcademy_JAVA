package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
/*
 * 외부 파일에서 db관련 설정 내용 저장.
 * 
 */
public class DBConnection {
	static Connection getConnection() throws ClassNotFoundException, SQLException,IOException {
		/*
		 * Properties : Hashtable의 하위 클래스. (Key,객체) => (String,String). 제네릭 표현 없음
		 *              FileInputStream과 연동하여 Properties 객체로 값을 저장. 
		 */
		Properties pro = new Properties();
//		pro.put("dirver", "org.mariadb.jdbc.Driver");
		FileInputStream fis = new FileInputStream("jdbc.properties");
		pro.load(fis);  //key = value
		Class.forName((String)pro.get("driver"));
		Connection conn = DriverManager.getConnection
				(pro.getProperty("url"),pro.getProperty("user"),pro.getProperty("password"));
		return conn;
	}
}