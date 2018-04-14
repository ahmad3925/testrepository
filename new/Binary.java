import java.util.*;

public class Binary {

	public static void main(String[] args) 
	{
			  Scanner sc= new Scanner(System.in);
		     	int arr[]={10,25,11,56,452,111};
			    int n=sc.nextInt();
				int min=0, max=arr.length-1;
				int flag=0;
				
				Arrays.sort(arr);
				System.out.println("Sorted array\t\n"+Arrays.toString(arr));
				while(min<=max)
				{
				   int mid=(min+max)/2;
				   if(arr[mid]==n)
				   {
					   System.out.println("Number found at\t" +mid+ "position");
				      flag=1; 
				      break;
				   }
				   else if(arr[mid]<n)
				   {
					   min=mid+1;
				   }
				   else
				   {
					   max=mid-1;
				   }
				}
				if(flag==0)
				{
					System.out.println("Not Found");	
				}
				
		 }
				     				
}		

	

