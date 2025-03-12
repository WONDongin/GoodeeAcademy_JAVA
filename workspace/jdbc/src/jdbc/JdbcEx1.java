package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * JDBC : 자바애플리케이션과 DBMS를 연결하기 위한 도구
 *   1. 드라이버파일 연결 : classpath 연결 : Build Path 메뉴이용
 *   2. JDBC 관련 패키지 : java.sql.*
 *   3. 드라이버클래스를 로드하기
 *   4. dbms와 java를 연결하여 객체 생성
 *   
 */
public class JdbcEx1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//3. Class.forName(문자열) : 문자열에 해당하는 클래스를 찾아서 클래스파일을 메모리 로드
		//   mariadb : org.mariadb.jdbc.Driver 
		//   oracle  : oracle.jdbc.driver.OracleDriver
		Class.forName("org.mariadb.jdbc.Driver");
		//4. conn : db와 연결 객체
		//  localhost : IP 주소. 
		//  3306 : PORT 번호
		//  gdjdb : Mariadb에서 설정한 데이터베이스이름
		// "gduser","1234" : db사용자,비밀번호 
		Connection conn = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/gdjdb","gduser","1234");
		System.out.println("jdbc 연결 완료");
		//SQL 명령문을 DB에 전달을 위한 객체
		Statement stmt = conn.createStatement();
		//stmt.executeQuery(sql구문) : sql문장을 실행 
		//ResultSet : select 구문의 결과를 저장하는 객체
		ResultSet rs = stmt.executeQuery("select * from student");
		while(rs.next()) { //레코드 한개씩 조회
			//rs.getString(컬럼명) : 컬럼의 값을 문자열로 리턴 
			System.out.print("학번:" + rs.getInt(1)); //첫번째 컬럼
			System.out.print(",이름:" + rs.getString("name"));
			System.out.print(",학년:" + rs.getString("grade"));
			System.out.println(",학과코드:" + rs.getString("major1"));
		}		
	}
}