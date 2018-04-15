class Rearrange 
{

	void rearrange(int arr[], int n) 
	{
		// First step: Increase all values by (arr[arr[i]]%n)*n
		for (int i = 0; i < n; i++)
			arr[i] += (arr[arr[i]] % n) * n;

		// Second Step: Divide all values by n
		for (int i = 0; i < n; i++)
			arr[i] /= n;
	}

	// A utility function to print an array of size n
	void printArr(int arr[], int n) 
	{
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}


public static void main(String[] args) 
	{
		Rearrange ob = new Rearrange();
		
		int arr[] = {7, 6, 5, 4,0,1,2,3};
		int n = arr.length;

		System.out.println("Given Array is :");
	    ob.printArr(arr, n);

		ob.rearrange(arr, n);

		System.out.println("Modified Array is :");
		ob.printArr(arr, n);
	}
}