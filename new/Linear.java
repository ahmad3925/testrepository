import java.util.Scanner;

public class Linear{

	public static void main(String[] args[])
	{
	    Scanner sc= new Scanner(System.in);
	    int arr[]={10,25,11,56,85};
	    int n,flag=0;
	    System.out.println("Enter the number to search");
	    n=sc.nextInt();
	    for(int i=0;i<arr.length;i++)
	    {     
	    	if(arr[i]==n)
	    	{
	    		System.out.println("number found");
	    		flag=1;
	    		break;
	    	}
	    	
	     }
	  	if(flag==0)
    	{
    		System.out.println("Not found");
    	}
 
	}

}
