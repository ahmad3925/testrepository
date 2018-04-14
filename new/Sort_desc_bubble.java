import java.util.Arrays;


public class Sort_desc_bubble {


	public static void main(String[] args) {
	
		int arr[]={113,11,12,-1,56,7,13};
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}


