package Employee;

import java.sql.*;

public class conn {
	
	public Connection c;
	public Statement s;


public conn(){
	try {
		Class.forName("com.mysql.jdbc.Driver");
		c=DriverManager.getConnection("jdbc:mysql:///project12","root","");
		s=c.createStatement();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}