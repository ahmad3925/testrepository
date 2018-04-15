// Java program to demonstrate working of Comparator
// interface
import java.util.*;
import java.lang.*;
import java.io.*;
 
// A class to represent a student.
class Student
{
    int rollno;
    String name, grade;
 
    // Constructor
    public Student(int rollno, String name, String grade)
    {
        this.rollno = rollno;
        this.name = name;
        this.grade = grade;
    }
 
    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name +
                           " " + this.grade;
    }
}
 
class Sortbyroll implements Comparator<Student>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}

class Sortbyname implements Comparator<Student>
{
    // Used for sorting in ascending order of
    // name
    public int compare(Student a, Student b)
    {
        return a.name.compareTo(b.name);
    }
}
 
// Driver class
class dev
{
    public static void main (String[] args)
    {   Scanner sc=new Scanner(System.in);
        
		Student [] arr = {new Student(1 , "Devyansh", "A"  ),
                          new Student(13, "Ahmad"   , "A++"),
                          new Student(10, "Shnakar" , "A++"),
						  new Student(15, "Akash"   , "A"  )};
 
      
		System.out.println("Unsorted");
        for (int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
		 System.out.println();
		  System.out.println("How would you like to sort:");
		System.out.println("Press: \n1: Roll wise \n2: Name wise");
		int a=sc.nextInt();
		
		if(a==1)
        {
        Arrays.sort(arr, new Sortbyroll());
		
        System.out.println("\nSorted by rollno");
        for (int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
		}
		else if(a==2)
		{
		Arrays.sort(arr, new Sortbyname());
		
        System.out.println("\nSorted by name");
        for (int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
		}	
    }
}