
public class Selection
{
	
	public static void main(String[] args) {
		
		int arr[]={15,56,0,45,89,1};
		
		for(int i=0;i<arr.length;i++)
		{
			int min=arr[i];
			int p=i;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(min>arr[j])
				{
					min=arr[j];
			        p=j;
				}
		
			}	
			int temp=arr[i];
			arr[i]=min;
			arr[p]=temp;
			
			
			
		}
		System.out.println("Sorted array=");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
	}

}
