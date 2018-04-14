import java.util.Scanner;

public class Number1 
{	
		public String one(int n)
		{
			
			String str= "";
			
			while (n !=0)
			{
				
				if( n==1)
				{
			     str = str+ "One";
				 n=0;
				}
				else if(n==2)		
				{
					str = str+"Two";
					 n=0;
					}
				else if(n==3)
				{
					str = str+"Three";
					 n=0;
					}
				else if(n==4)
				{
					str = str+"Four";
					 n=0;
					}
				else if(n==5)
				{
					str = str+"Five";
					 n=0;
					}
				else if(n==6)
				{
					str = str+"Six";
					 n=0;
					}
				else if(n==7)
				{
					str = str+"seven";
					 n=0;
					}
				else if(n==8)
				{
					str = str+"Eight";
					 n=0;
					}
				else if(n==9)
				{
					str = str+"Nine";
					 n=0;
					}
				
			}	
			return str;
		}

 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
   String str;
   int n;
   Number1 t= new Number1();
   System.out.println("enter an number");
   n=sc.nextInt();
   str=((Object) t).convert(n);
   System.out.println(str);
}
}