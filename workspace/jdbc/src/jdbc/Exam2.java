package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* 
 * 1. dept 테이블을 이용하여 서울지역의 레코드만 dept_seoul 테이블로 생성하기
 * 2. dept_seoul 테이블에
 *    deptno : 60, dname:특수영업부, loc : 서울 레코드 추가.
 * 3. dept_seoul 테이블에
 *    deptno : 60 레코드의  dname:특수영업1부 수정하기.
 * 4. dept_seoul 테이블의 모든 컬럼의 내용을 화면에 출력하기
 */
public class Exam2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException {
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement();
		String sql ="create table dept_seoul "
				+ "(select * from dept where loc='서울')";
		int result =stmt.executeUpdate(sql);
		System.out.println("1. 결과:"+result);
		sql="insert into dept_seoul values(60,'특수영업부','서울')";
		result=stmt.executeUpdate(sql);
		System.out.println("2. 결과:"+result);
		sql="update dept_seoul set dname='특수영업1부' where deptno=60";
		result=stmt.executeUpdate(sql);
		System.out.println("3. 결과:"+result);
		sql="select * from dept_seoul";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.print("부서번호:"+rs.getString("deptno"));
			System.out.print(",부서이름:"+rs.getString("dname"));
			System.out.print(",부서위치:"+rs.getString("loc"));
			System.out.println();
		}		

	}
}