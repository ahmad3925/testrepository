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
		Score_card [] arr = {new Score_card(111, "bbbb", "london"),
						new Score_card(131, "aaaa", "nyc"),
						new Score_card(121, "cccc", "jaipur")};

		System.out.println("Unsorted");
		for (int i=0; i<arr.length; i++)
			System.out.println(arr[i]);

		Arrays.sort(arr, new Sortbyroll());

		System.out.println("\nSorted by rollno");
		for (int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
}
