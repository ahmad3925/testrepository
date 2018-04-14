import java.util.Arrays;


public class Second_high_low {

	public static void main(String[] args) {
		
		int arr[]={11,5,-5,565,45,78};
		int largest= arr[0];
		int smallest=arr[0];
		int secondLargest= arr[0];
		int secondSmallest=arr[0];
		
		System.out.println("Array is:"+Arrays.toString(arr));				
		
       for(int i=0;i< arr.length;i++)
       {
    	   if(arr[i]>largest)
    	   {
    		    secondLargest= largest;
    		    largest=arr[i];
    	   }
    	   else if(arr[i]>secondLargest)
    	   {
    		   secondLargest=arr[i];
    	   }
    	   if(arr[i]<smallest)
    	   {
    		    secondSmallest= smallest;
    		    smallest=arr[i];
    	   }
    	   else if(arr[i]<secondSmallest)
    	   {
    		   secondSmallest=arr[i];
    	   }
       }
      
       System.out.println("Second Largest number is:" +secondLargest );
       System.out.println("Second Snallest number is:" +smallest );
       System.out.println("Second Snallest number is:" +secondSmallest );
	}

}
