import java.util.Scanner;


public class Puzzle_Game {


	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		int r=0;
		int c=0;
		int arr[][]= new int[3][3];
		System.out.println("Enter the elementts in array");
		 for(r=0;r<=2;r++)
		   { 
		     for(c=0;c<=2;c++)
		     { 
			    arr[r][c]=s.nextInt();
			 }
		   }
		 System.out.println("Matrix is:");
		 for(r=0;r<=2;r++)
		   {
			 
			   for(c=0;c<=2;c++)
			   {
				   System.out.print(arr[r][c]+"\t");
				  	   
			   }
			  
			 System.out.println();
		   }

	}

}
