class Pattern8
{/*
    1
   121
  12321
 1234321
  12321
   121
    1   


*/
  public static void main(String args[])
 {
     int i,j,k;
	 for(i=1;i<=4;i++)
	 {
		 for(k=3;k>=i;k--)
		 {
	     System.out.print("  ");-
		 }
		 
	    for(j=1;j<=i;j++)
        {
	       System.out.print(j+" ");
		   
     	}
		for(int l=i-1;l>=1;l--)
		{
			 System.out.print(l+" ");
			 
		}
         System.out.println();
	 } 
 }
 
}	

