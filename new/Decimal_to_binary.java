import java.util.Scanner;
public class Decimal_to_binary {

	public static void main(String[] args) {
		
		//Decimal to binary
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any Decimal number:");
		int n= sc.nextInt();
		  int  bin[]=new int[100];
		    int i = 0;
		    while(n > 0)
		    {
		    bin[i++] = n%2;
		       n = n/2;
		    }
		    
		   System.out.print("Binary number is : ");
		    for(int j = i-1;j >= 0;j--)
		   {
		       System.out.print(bin[j]);
		   }
		    
		    
		    //binary to decimal
			System.out.println("\nEnter any Binary number:");
			int n1= sc.nextInt();
			int decimal=0,p=0;
	        
	        while(n1!=0)
	        {
	            decimal+=((n1%10)*Math.pow(2,p));
	            n1=n1/10;
	            p++;
	        }
     
	        System.out.println(decimal);
	}  		
}
		


