package StaticClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionMysql {

	public Connection cn = null;
	public static Connection cconnexionBD() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcaresoft","root","");
		return cn;
	}
	
}
