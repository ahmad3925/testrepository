class Pattern4
{
	/*
54321
 4321
  321
   21
    1
*/
 public static void main(String args[])
 {
     int i,j,k;
	 for(i=1;i<=5;i++)
	 {
		  for(k=1;k<=i-1;k++)
		 {
	     System.out.print("*");
		 }
		 for(j=5;j>=i;j--)
		 {
	     System.out.print(j);
		 }
		 System.out.println();		 
		
		
	 } 

 }
 
}	