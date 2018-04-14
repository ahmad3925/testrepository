import java.util.Scanner;	

public class Alter_string {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n;
		int i=0;
		String str= " ";
		String st="";
		System.out.println("How many string you want to enter:");
		n=sc.nextInt();
	for(int j=0;j<=n;j++)
	{
		str = sc.nextLine();

	   char ch[] = str.toCharArray();
		for (i = 0; i < str.length(); i++) {

			// If first character of a word is found
			if (i == 0 && ch[i] != ' ' || 	ch[i] != ' ' && ch[i - 1] == ' ') 
			{

				// If it is in lower-case
				if (ch[i] >= 'a' && ch[i] <= 'z') {

					// Convert into Upper-case
					ch[i] = (char)(ch[i] - 'a' + 'A');
												
				}
			}	


			// If apart from first character
			// Any one is in Upper-case
			else if (ch[i] >= 'A' && ch[i] <= 'Z') 

				// Convert into Lower-Case
				ch[i] = (char)(ch[i] + 'a' - 'A');		 
		}
		// Convert the char array to equivalent String
		st = new String(ch);	
			    String arr[] = st.split(" ");
			      // print all the initials
			      for (i = 0; i < arr.length - 1; i++) {
			          System.out.print(arr[i].charAt(0) + " "); 

		  }
			 	 // print the last string
			      System.out.println(arr[arr.length-1]);

	}	
	}

}
