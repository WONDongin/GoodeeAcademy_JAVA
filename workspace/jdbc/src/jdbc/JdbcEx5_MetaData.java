package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


/*
 * ResultSetMetaData
 *  - 조회된 컬럼이름,컬럼갯수등의 정보 저장 객체
 */
public class JdbcEx5_MetaData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		String sql = "select * from student";
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//rs : db에서 전달해 준 데이터 정보
		ResultSet rs = pstmt.executeQuery();
		//rsmd : 결과 데이터의 정보를 저장 객체
		ResultSetMetaData rsmd = rs.getMetaData();
		int colCnt = rsmd.getColumnCount(); //조회된 컬럼의 갯수. db가 전달해준 컬럼의 갯수
		System.out.println("조회된 컬럼수:" + colCnt);
		//header 부분 출력
		System.out.printf("%-10s","컬럼명");
		System.out.printf("%-10s","컬럼타입");	  
		System.out.printf("%-10s\n","NULL 허용");
		//컬럼 정보 조회하기
		for(int i=1;i<=colCnt;i++) {
		//rsmd.getColumnName(1) : 1번째 조회된 컬럼의 이름 	
		  System.out.printf ("%-10s",rsmd.getColumnName(i));
		  //rsmd.getColumnTypeName(1) : 1번째 컬럼의 자료형의 이름
		  //rsmd.getPrecision(1) : 1번째 컬럼의 자료형의 크기 
		  System.out.printf	("%s(%d)\t",rsmd.getColumnTypeName(i),rsmd.getPrecision(i));
		  //isNullable(1) : 첫번째 컬럼이 Null값 허요? 0:허용안함, 1:허용
		  System.out.printf ("%-10s\n",(rsmd.isNullable(i)==0)?"NOT NULL":"NULL");
		}
	}
}