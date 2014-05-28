package iss.bank.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * ���ݿ����ӳ���
 */
public class DBConnection {

	// �����ļ���,Ӧ����classesĿ¼��
	private static String CONFIG_FILENAME = "config.properties";

	// �����ļ�
	private Properties prop = null;

	// �������ݿ����������
	private String driverName = "";
	// �������ݿ��URL
	private String url = "";

	// �������ݿ���û������
	private String user = "";
	private String password = "";

	/**
	 * ���캯�����������ļ��л�ȡ�������ݿ���Ϣ
	 * 
	 * @throws Exception
	 */
	public DBConnection() throws Exception {
		prop = new Properties();
		// ��ȡ�����ļ���Ϣ
		InputStream in = DBConnection.class.getResourceAsStream("/"
				+ CONFIG_FILENAME);
		prop.load(in);
		// ������������
		driverName = prop.getProperty("DataBaseDrivers").trim();
		user = prop.getProperty("DataBaseUser");// �û�,����
		password = prop.getProperty("DataBaseUserPassword");
		url = getDBURL();// url
		// װ����������
		Class.forName(driverName).newInstance();

	}

	/**
	 * �������ļ��л�ȡ��Ϣ����װ���ݿ����ӵ�url
	 * 
	 * @return String
	 */
	private String getDBURL() {
		if (prop.getProperty("DataBaseType").equals("MySQL")) {
			return "jdbc:mysql://" + prop.getProperty("DataBaseServerName")
					+ ":" + prop.getProperty("DataBaseServerPort") + "/"
					+ prop.getProperty("DataBaseName");
		}
		return url;
	}

	/**
	 * �������ݿ�����
	 * 
	 * @return Connection
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}

	/**
	 * �ر����ݿ�����
	 * @param conn
	 */
	public void closeConnection(Connection conn) {

		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		// �������ݿ�����
		DBConnection dbconnection = new DBConnection();
		System.out.println("Connection URL =" + dbconnection.getDBURL());
		dbconnection.getConnection();
		System.out.println("Connection OK!");

	}
}
