import java.util.ArrayList;

import java.util.Scanner;

class JavaProgram
{
public static void main(String[] args) {
    
	Scanner input = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    ArrayList<Double> num = new ArrayList<Double>();
       
System.out.println("choose operation\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
int n= input.nextInt();
if(n==1)
{
	System.out.print("Please enter integer values (-1 to to display numbers & sum): ");

    int i = input.nextInt();
    int j = 0;

    while (i != -1) {
        numbers.add(i);
        j += i;
        i = input.nextInt();
    }
    
    System.out.println("Entered Numbers: ");
    for (int a = 0; a < numbers.size(); a++) {
        System.out.print(" " + numbers.get(a));
    }
    System.out.println("The Sum: " + j);
}
else if(n==2)
{
	System.out.print("Please enter integer values (-1 to to display numbers & total subtraction): ");

    int i = input.nextInt();
    int j = 2*i;

    while (i != -1) {
        numbers.add(i);
        j = j-i;
        i = input.nextInt();
    }
    System.out.println("Entered Numbers: ");
    for (int a = 0; a < numbers.size(); a++) {
        System.out.print(" " + numbers.get(a));
    }
    System.out.println("The total subtaction is: " + j);
}

else if(n==3)
{
	System.out.print("Please enter integer values (-1 to to display numbers & total multiplicaion): ");

    int i = input.nextInt();
    int j = 1;

    while (i != -1) {
        numbers.add(i);
        j *= i;
        i = input.nextInt();
    }
    System.out.println("Entered Numbers: ");
    for (int a = 0; a < numbers.size(); a++) {
        System.out.print(" " + numbers.get(a));
    }
    System.out.println("The total multipliction is: " + j);
}   
else 
{
	System.out.print("Please enter integer values (-1 to to display numbers & total diivision): ");

    double i = input.nextInt();
    double j = i*i;
    while (i != -1){
        num.add(i);
        j = j/i;
        i = input.nextInt();
    }
    System.out.println("Entered Numbers: ");
    for (int a = 0; a < numbers.size(); a++) {
        System.out.print(" " + numbers.get(a));
    }
    System.out.println("The total division is: " + j);
 }
input.close();
}
}