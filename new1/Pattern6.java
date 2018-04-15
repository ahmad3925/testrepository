class Pattern6
{
	
 /*
A
Ah
Ahm
Ahma
Ahmad
*/
  public static void main(String args[])
  {
   
     char arr[]={'A','h','m','a','d'};
     
	 for(int i=1;i<=arr.length;i++)
	 {
		 for(int j=0;j<i;j++)
		 {
			 System.out.print(arr[j]);
			
          }
 	 System.out.println();
			
      }
   }
}