import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
	
	public class main1 {

		

		public static void main(String args[]) throws Exception {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Class.forName("org.h2.Driver");
			 Connection con= DriverManager.getConnection("jdbc:h2:tcp://localhost/~/students","sa","1234");
			 Statement stmt= con.createStatement();
			
			//print table
			ResultSet rs = stmt.executeQuery("Select * from new");
			rs.beforeFirst();
			while (rs.next()) {
				System.out.println(
						rs.getInt("roll") + "\t" + rs.getString("Name") + "\t" + rs.getString("Add"));
			}		
			//menu
			System.out.println("Enter your choice");
			System.out.println("1.Insert \n2. update \n3. Delete");
			int ch = Integer.parseInt(br.readLine());
			
			//creating object of DBstatement
		 DBstatement ob= new DBstatement();
		   switch (ch)
			{
			case 1:
				stmt.executeUpdate(ob.insert());
				 ResultSet rs1 = stmt.executeQuery("Select * from new");
					rs1.beforeFirst();
					while (rs1.next()) {
						System.out.println(
								rs1.getInt("roll") + "\t" + rs1.getString("Name") + "\t" + rs1.getString("Add"));
					}
					
				break;
			
			case 2:
				 stmt.executeUpdate(ob.update());
				 ResultSet rs2 = stmt.executeQuery("Select * from new");
					rs2.beforeFirst();
					while (rs2.next()) {
						System.out.println(
								rs2.getInt("roll") + "\t" + rs2.getString("Name") + "\t" + rs2.getString("Add"));
					}
				break;
			case 3:
				stmt.executeUpdate(ob.delete());
				ResultSet rs3 = stmt.executeQuery("Select * from new");
				rs3.beforeFirst();
				while (rs3.next()) {
					System.out.println(
							rs3.getInt("roll") + "\t" + rs3.getString("Name") + "\t" + rs3.getString("Add"));
				}
				break;
			}
		   con.close();
           stmt.close();
			}
		}	