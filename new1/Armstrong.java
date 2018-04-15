public class Armstrong{
/*
1=1^3=1
153=1^3+5^3+3^3=153
370
*/

	public static void main(String[] args) {

	  
     	int c=0;
		for(int i=1;i<=1000;i++)
		{
		int n=i,s=0,r=0;
		  int temp=n;
		  while(n>0)
		  {
			  r=n%10;
			  s=s+(r*r*r);
			  n=n/10;
		  }
          if(temp==s)
		 {
			System.out.println(s);
			c++;
		 }
		 
}
System.out.println("total="+c);
}
}
		