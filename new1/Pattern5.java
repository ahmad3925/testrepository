class Pattern5
{
	/*
a
ab
abc
abcd
abcde

*/
  public static void main(String args[])
  {
   
   for(int i=1;i<=5;i++)
   {
	    char ch=97;
      for(int j=1;j<=i;j++)
      {
             System.out.print(ch);
			  ch++;
    }
System.out.println();
   }
}
}