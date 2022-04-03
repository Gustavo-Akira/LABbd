package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDao {
	private Connection c;

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		String hostName = "192.168.15.5";
		String dbName = "paulista";
		String user = "sa";
		String password = "246875";
		
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		String connect = 
				String.format("jdbc:jtds:sqlserver://%s:1433;databaseName=%s;user=%s;password=%s",
						hostName, dbName, user, password);
		c = DriverManager.getConnection(connect);
		
		return c;
	}
}
