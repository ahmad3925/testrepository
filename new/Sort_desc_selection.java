
public class Sort_desc_selection {


	public static void main(String[] args)  {
			
			int arr[]={115,56,0,45,1,89,12};
			
			for(int i=0;i<arr.length;i++)
			{
				int max=arr[i];
				int p=i;
				
				for(int j=i+1;j<arr.length;j++)
				{
					if(max<arr[j])
					{
						max=arr[j];
				        p=j;
					}
			
				}	
				int temp=arr[i];
				arr[i]=max;
				arr[p]=temp;
				
				
				
			}
			System.out.println("Sorted array=");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+ " ");
			}
			
		}

	}