package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
/*
 * ResultSet executeQuery() : select 문장 실행
 * int  executeUpdate()  : select 문장 이외 구문 실행
 * boolean execute()     : 모든 sql 문장 사용가능
 *     true : 실행된 구문이 select 인경우
 *     false :실행된 구문이 select가 아닌경우 
 */
public class JdbcEx6_execute {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
//		String sql = "select * from student";
		String sql = "delete from depttest2";
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		if(pstmt.execute()) { //sql 실행 후, select 구문인 경우 : true 리턴
			//getResultSet() : ResultSet 객체를 리턴
			ResultSet rs = pstmt.getResultSet();
			ResultSetMetaData rsmd = rs.getMetaData();
			for(int i=1;i<=rsmd.getColumnCount();i++) {
				System.out.printf("%10s",rsmd.getColumnName(i));
			}
			System.out.println();
			while(rs.next()) {
				for(int i=1;i <= rsmd.getColumnCount();i++) {
					System.out.printf("%10s",rs.getString(i));
				}
				System.out.println();
			}
		} else { //select 구문 이외의 sql 문장인 경우
			System.out.println("변경된 레코드 건수 : "+pstmt.getUpdateCount());
		}
	}
}