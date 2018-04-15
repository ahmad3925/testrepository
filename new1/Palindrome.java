public class Palindrome {


	public static void main(String[] args) {
        int c=0;
		for(int i=1;i<=1000;i++)
		{
		 int n=i,s=0,r=0;
		 
		  while(n>0)
		  {
			  r=n%10;
			  s=(s*10)+r;
			  n=n/10;
			  
		  }
          if(i==s)
		 {
			 
			System.out.println(s);
			c++;
		 }
		
		} 
		 System.out.println("total="+c);
		
	}

}
