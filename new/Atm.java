import java.util.Scanner;

 class Atm {

	public static void main(String[] args) {

		int x;
		float y;

		Scanner sc = new Scanner(System.in);
		//amount to withdraw
		x = sc.nextInt();
		
		// initial balance
		y = sc.nextFloat();

		if (x <=(y-0.50))//amount should there to withdraw
		{
			if(x % 5==0)// amount multiple of 5
			{
				y = (float) ((y - x) -0.5);
				System.out.printf("%f",y);
			}
			else
			{
				System.out.printf("%f",y);
			}
		}
		else
		{
			System.out.printf("%f",y);
			
		}	
		System.exit(0);
		}

}
