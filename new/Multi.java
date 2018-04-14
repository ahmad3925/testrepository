
	import java.util.Scanner;
	class Multi
	{ 
		public static void main(String args[])
	   { Scanner sc=new Scanner (System.in); 
	     int sum=0,r,c,k,r1,c1,r2,c2;
		 
		 //Matrix A
	     System.out.print("Enter the number of rows for matrix A:");
	     r1=sc.nextInt();
		 System.out.print("Enter the number of columns for matrix A:");
	     c1=sc.nextInt();
		 
		 int arr1[][]=new int[r1][c1];
		 System.out.println("Enter the elements of Matrix A:");
		 
		 for(r=0;r<r1;r++)
		   { 
		     for(c=0;c<c1;c++)
		     { 
			    arr1[r][c]=sc.nextInt();
			 }
		   }
		 
		 //Matrix B
		 System.out.print("Enter the number of rows for matrix B:");
	     r2=sc.nextInt();
		 System.out.print("Enter the number of columns for matrix B:");
	     c2=sc.nextInt();
		 
		 int arr2[][]=new int[r2][c2];
		 System.out.println("Enter the elements of Matrix B:");
		 
		 for(r=0;r<r2;r++)
		   { 
		     for(c=0;c<c2;c++)
			 {
			    arr2[r][c]=sc.nextInt();
		     }
		   }
		 
		 if(c1!=r2)
		 { 
	       System.out.print("Matrix  can not be multiplied!!!");
		 }
		 else
		 { 
		   System.out.print("\t****MATRIX MULTIPLIACTION....****");
		   int mul[][]=new int[r1][c2];
		   
		   for(r=0;r<r1;r++)
		   {
			   for(c=0;c<c2;c++)
			   {
				   for(k=0;k<r2;k++)
				   {
					   sum=sum+arr1[r][k]*arr2[k][c];
				   }
				   mul[r][c]=sum;
				   sum=0;
			   }
		   }
		   System.out.println("Product of Matrix A and B is:");
		   
		   for(r=0;r<r1;r++)
		   {
			   System.out.print("|");
			   for(c=0;c<c2;c++)
			   {
				   System.out.print(mul[r][c]+"\t");
				   
					   
				   
			   }
			  
			   System.out.print("|\n");
		   }
	      }
	    }
	} 	 

