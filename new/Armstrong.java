public class Armstrong{

	public static void main(String[] args) {	  
		
		
	
		for(int n=1;n<=1000;n++)
		{
			int s=0,d;
		  int temp=n;
		  while(n>0)
		  {
			  d=n%10;
			  s=s+(d*d*d);
			  n=n/10;
		  }
          if(temp==s)
		 {
			System.out.println(s);
		 }
          
        }
  }
}
		