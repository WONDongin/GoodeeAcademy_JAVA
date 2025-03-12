package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/*
 * 학생의 학번,이름,학년,학과코드, 학과명, 지도교수명을 출력하기
 * 출력시 Header에 컬럼도 출력하기
 */
public class Exam3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Connection conn = DBConnection.getConnection();
		String sql = "select s.studno,s.name,s.grade,s.major1,m.name mname, p.name pname" 
				+ "from student s, major m, professor p "
				+ "where s.major1 = m.code and s.profno = p.no";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		for(int i=1;i <= rsmd.getColumnCount();i++) {
//			System.out.printf("%10s",rsmd.getColumnName(i));
			System.out.printf("%10s",rsmd.getColumnLabel(i));
		}
		System.out.println();
		while(rs.next()) {
			for(int i=1;i <= rsmd.getColumnCount();i++) {
				System.out.printf("%10s",rs.getString(i));
			}
			System.out.println();
		}
	}
	
}