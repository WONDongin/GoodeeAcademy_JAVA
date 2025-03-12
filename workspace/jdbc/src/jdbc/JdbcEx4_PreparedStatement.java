package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcEx4_PreparedStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException {
		Connection conn = DBConnection.getConnection();
		String sql = "create table login "
				+ "(id varchar(10) primary key, password varchar(10))";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		int result = pstmt.executeUpdate(); //create table 실행. login 테이블 생성됨 
		System.out.println("login 테이블 create :" + result); //0
		//데이터 추가
		sql = "insert into login (id,password) values (?,?)";
		pstmt = conn.prepareStatement(sql); //sql문장 db에 전달
		pstmt.setString(1, "hongkd"); //첫번째 ?에 hongkd 값을 파라미터로 전달
		pstmt.setString(2, "1234");   //두번쨰 ?에 1234 값을 파마미터로 전달 
		result = pstmt.executeUpdate();  //hongkd,1234 데이터가 db 에 저장
		System.out.println("hongkd insert : " + result); //1
		pstmt.setString(1,"leemy");
		pstmt.setString(2,"3456");
		result = pstmt.executeUpdate();
		System.out.println("leemy insert : " + result); //1
		//table의 내용 조회
		sql = "select * from login";
		pstmt = conn.prepareStatement(sql); //sql 구문만 db에 전달
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.print("id:" + rs.getString(1));
			System.out.println(",password:" + rs.getString(2));
		}
		sql = "drop table login";
		pstmt = conn.prepareStatement(sql);
		result = pstmt.executeUpdate();
		System.out.println("login 테이블 drop :" + result);
		
	}
}