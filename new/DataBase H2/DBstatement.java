import java.io.*;

public class DBstatement implements Business_logic {
	private static int roll;
	private static String StudentName;
	private static String Address;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	public String insert() throws Exception{
		
		System.out.println("Insert details like roll, studentname and address");
		roll = Integer.parseInt(br.readLine());
		StudentName = br.readLine();
		Address = br.readLine();

		String i = ("Insert into new values(" + roll + ",'" + StudentName + "' ,'" + Address + "')");

		System.out.println("Record Inserted");
		return i;
	}

	public String update() throws Exception {
		
		System.out.println("Enter roll number you want to update");
		int ch = Integer.parseInt(br.readLine());
		System.out.println("select option you want to update\n1.Name\n2.Address");
		int ch1 = Integer.parseInt(br.readLine());
		 if (ch1==1)
		 {
		              StudentName=br.readLine();
		              String j = ("update new set name='"+StudentName+ "'where roll="+ch);
		              System.out.println("Record updated");	
		              return j;
		 }
		 else {
		             Address=br.readLine();
		             String j1 = ("update new set Add='"+Address+ "'where roll="+ch);
		             System.out.println("Record updated");	
		             return j1;
		 }      
		
}
	public String delete() throws Exception {
		System.out.println("Enter roll number you want to delete");
		int ch = Integer.parseInt(br.readLine());
		String j = ("delete new where roll="+ch);
		System.out.println("Record Deleted");
		return j;
	

	}
}
