	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	
public class DBConnect {
	
	Class.forName("org.h2.Driver");
	static Connection con= DriverManager.getConnection("jdbc:h2:tcp://localhost/~/students","sa","1234");
	static Statement stmt= con.createStatement();
	
	//print table
	ResultSet rs = stmt.executeQuery("Select * from new");
	rs.beforeFirst();
	while (rs.next()) {
		System.out.println(
				rs.getInt("roll") + "\t" + rs.getString("Name") + "\t" + rs.getString("Add"));
	}
}
