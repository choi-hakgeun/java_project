package semi;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {//���ȭ�� ���� ���� Ŭ����
	
	
	public static Connection getConn() {//�������� ������ �ʾҴٸ� Connection conn = new DBConn.getConn();���� BDConn�� ���Ӱ� �����ؼ� ����ص� ������ �������� ���� ���� DBConn�� ���Ӱ� �������ʰ� ���ڴ� 
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.27:1521:xe";
		String dbUser ="semi";
		String dbPwd ="1234";
		Connection conn = null;
		try {
		Class.forName(driver).newInstance();
		conn = DriverManager.getConnection(url,dbUser,dbPwd);
		}catch(Exception ex) {
			
		}
		return conn;
	}
}