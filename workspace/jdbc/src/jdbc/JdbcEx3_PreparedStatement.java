package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * PreparedStatement 예제
 *   Statement의 하위 인터페이스
 *   setInt(순서,값) => 자료형을 인식. 
 */
public class JdbcEx3_PreparedStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException {
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = conn.prepareStatement
				("select * from student where grade=?"); //DB에 SQL문장을 먼저 전달.
		System.out.print("학년을 입력하세요:");
		Scanner scan = new Scanner(System.in);
		int grade = scan.nextInt();
		//setInt(?순서,값) : ?순서에 값을 int 형으로 값 저장
		pstmt.setInt(1, grade); //1:?의 순서. grade:?에 치환될 값
		ResultSet rs = pstmt.executeQuery();
		  while(rs.next()) {
			System.out.printf  ("학번:%7s,이름:%-5s,학년:%3d,키:%5.2f,몸무게:%5.2f,학과코드:%-5s\n",
	    		  rs.getString("studno"),
	    		  rs.getString("name"),
	    		  rs.getInt("grade"),
	    		  rs.getDouble("height"),
	    		  rs.getDouble("weight"),
	    		  rs.getString("major1"));
		  }
	}
}