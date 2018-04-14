import java.util.Scanner;


public class TheLeadGame {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the no. of rounds");
		int n= sc.nextInt();
		int p1;
		int p2;
	int r1=0;
	int r2=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println("Score of player 1");
			p1=sc.nextInt();
			System.out.println("Score of player 2 ");
			p2=sc.nextInt();
			 r1= p1-p2;
			 r2= p2-p1;		
		}
		
		if(r1>r2)
		{
		System.out.println("Leader:Player 1");
		System.out.println(Math.abs(r1));
	}	
	else
		{
			System.out.println("Leader: player 2");
			System.out.println(Math.abs(r1));
		}
			

	}

}
