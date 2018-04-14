import java.util.Arrays;


public class Bubble {

	public static void main(String[] args) {

		int k=0;
		int arr[]={13,11,12,0,56,7,13};
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				k++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(k);
	
	}

}
