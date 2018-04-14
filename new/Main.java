

	// Java program to demonstrate working of Comparator
	// interface
	import java.util.*;
	import java.lang.*;
	import java.io.*;

	// A class to represent a student.
	class Score_card
	{
		int rollno;
		String name, address;

		// Constructor
		public Score_card(int rollno, String name,
								String address)
		{
			this.rollno = rollno;
			this.name = name;
			this.address = address;
		}

		// Used to print student details in main()
		public String toString()
		{
			return this.rollno + " " + this.name +
							" " + this.address;
		}
	}

	class Sortbyroll implements Comparator<Score_card>
	{
		// Used for sorting in ascending order of
		// roll number
		public int compare(Score_card a, Score_card b)
		{
			return a.rollno - b.rollno;
		}
	}

	// Driver class
	class Main
	{
		public static void main (String[] args)
		{
			Score_card [] arr = {new Score_card(1, "Divyansh", "A+"),
							new Score_card(12, "Ahmad", "A++"),
							new Score_card(10, "Akash", "B"),
			   				new Score_card(13, "Shankar", "A")};
			System.out.println("Unsorted");
			for (int i=0; i<arr.length; i++)
				System.out.println(arr[i]);

			Arrays.sort(arr, new Sortbyroll());

			System.out.println("\nSorted by rollno");
			for (int i=0; i<arr.length; i++)
				System.out.println(arr[i]);
		}
	}


