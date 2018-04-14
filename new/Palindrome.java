public class Palindrome {


	public static void main(String[] args) {

		
		for(int i=1;i<1000;i++)
		{
			
		int d=0,r;
		  int temp=n;
		  while(n>0)
		  {
			  r=n%10;
			  d=(d*10)+r;
			  n=n/10;
		  }
		  if(temp==d)
		   {
			 System.out.println(d);
		   }
		 
		}
	}

}
