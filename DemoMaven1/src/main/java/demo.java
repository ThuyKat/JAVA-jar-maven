import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class demo {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/maven","root","root");
	connection.createStatement().execute("CREATE TABLE IF NOT EXISTS maven1 (name VARCHAR(20),id INT)");
	connection.close();
	
	
}
}
