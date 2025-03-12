package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * ResultSet executeQuery(sql문장) : select 구문 실행시 호출. db로부터 조회된 레코드를 리턴
 *       int executeUpdate(sql문장) : 실행 후 변경(추가,변경,삭제)된 레코드의 갯수 리턴
 *                             create,drop,alter,insert,update,delete 구문에서 사용함
 */
public class JdbcEx2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException {
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement();
		String sql ="create table jdbctest (id int primary key, name varchar(100))";
		int result = stmt.executeUpdate(sql); //jdbctest 테이블을 생성하기
		System.out.println("1 결과:" + result); //0
		sql = "insert into jdbctest values(1,'홍길동')";
		result = stmt.executeUpdate(sql);
		System.out.println("2 결과:" + result); //1
		//2.김삿갓,3,이몽룡 데이터를 추가하기
		sql = "insert into jdbctest values (2,'김삿갓'),(3,'이몽룡')";
		result = stmt.executeUpdate(sql);
		System.out.println("3 결과:" + result); //2
		//모든 레코드 삭제
		sql = "delete from jdbctest";
		result = stmt.executeUpdate(sql);
		System.out.println("4 결과:" + result); //3
		//jdbctest 테이블 삭제하기
		sql = "drop table jdbctest";
		result = stmt.executeUpdate(sql);
		System.out.println("5 결과:" + result); //0
	}
}