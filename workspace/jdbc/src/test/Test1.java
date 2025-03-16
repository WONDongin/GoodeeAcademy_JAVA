package test;

import java.sql.*;
import java.util.Scanner;
import jdbc.DBConnection;
/* 모든 sql구문을 처리하기
 * [결과]
sql 구문을 입력하세요(종료:exit)
select * from student where grade = 1
조회된 레코드 수 : 5

studno	name	id	grade	jumin	birthday	tel	height	weight	major1	major2	profno	
240111	강진	kangjin2702	1	0502233234567	1998-02-23	055)333-1234	183	71	101	null	null	
240212	곽종인	kwakjong	1	0508023234567	1998-08-02	051)426-2345	178	65	102	null	null	
240313	박동인	kimdongin	1	0510023234567	1998-10-02	053)566-3456	173	75	103	null	null	
241113	최정현	kimjunghyun	1	0602084234567	1998-02-08	02)6122-4567	170	80	201	null	null	
241213	장영	kimyoung	1	0512083234567	1998-12-08	031)122-5678	183	95	202	null	null	
sql 구문을 입력하세요(종료:exit)
*/
public class Test1 {
    static Connection conn;

    // 🔹 static 블록을 이용해 DB 연결을 한 번만 설정
    static {
        try {
            conn = DBConnection.getConnection();
        } catch (Exception e) {
            System.err.println("DB 연결 오류");
            e.printStackTrace();
            System.exit(1); // 프로그램 강제 종료 (DB 연결 실패 시)
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("SQL 구문을 입력하세요 (종료: exit)");
            String sql = scan.nextLine().trim();

            if (sql.equalsIgnoreCase("exit")) break;

            try (PreparedStatement pstmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {

                boolean isResultSet = pstmt.execute();

                if (isResultSet) {
                    selectRtn(pstmt, sql);
                } else {
                    updateRtn(pstmt);
                }

            } catch (SQLException e) {
                System.err.println("SQL 실행 중 오류 발생: " + e.getMessage());
            }
        }

        scan.close();
        closeConnection();
        System.out.println("프로그램 종료");
    }

    // 🔹 SELECT 문 처리 (레코드 수 정확히 계산)
    static void selectRtn(PreparedStatement pstmt, String sql) throws SQLException {
        // 레코드 수 계산 (COUNT(*) + rs.last() 방식 혼합)
        int rowCount = getRowCount(sql);

        System.out.println("조회된 레코드 수: " + rowCount);

        try (ResultSet rs = pstmt.getResultSet()) {
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            // 컬럼명 출력
            for (int i = 1; i <= columnCount; i++) {
                System.out.printf("%15s", rsmd.getColumnName(i));
            }
            System.out.println("\n------------------------------------------------------------");

            // 데이터 출력
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.printf("%15s", rs.getString(i));
                }
                System.out.println();
            }
        }
    }

    // 🔹 UPDATE, INSERT, DELETE 문 처리
    static void updateRtn(PreparedStatement pstmt) throws SQLException {
        System.out.println("변경된 레코드 수: " + pstmt.getUpdateCount());
    }

    // 🔹 조회된 레코드 수 계산 (COUNT(*) + rs.last() 방식 혼합)
    static int getRowCount(String sql) {
        String countQuery = "SELECT COUNT(*) FROM (" + sql + ") AS a";
        try (PreparedStatement pstmt = conn.prepareStatement(countQuery);
             ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            System.err.println("레코드 수 조회 중 오류 발생: " + e.getMessage());
        }
        return 0;
    }

    // 🔹 Connection 종료 메서드
    static void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("DB 연결 종료");
            }
        } catch (SQLException e) {
            System.err.println("DB 연결 종료 중 오류 발생: " + e.getMessage());
        }
    }
}
