import java.util.Scanner;

class Calc
{
	void add(int a,int b)
	{
		System.out.println("Sum="+(a+b));
	}
	void sub(int a,int b)
	{
		System.out.println("Subtract="+(a-b));
	}
	void multy(int a,int b)
	{
		System.out.println("Multilply="+(a*b));
	}
	void division(int a,int b)
	{
		System.out.println("Division="+(a/b));
	}
	
	
}

class Abc {

	public static void main(String[] args) {

		
       System.out.println("Enter two number");
       Scanner sc = new Scanner(System.in);
              
      Calc ob= new Calc();
       ob.add(sc.nextInt(),sc.nextInt());
       ob.sub(sc.nextInt(),sc.nextInt());
       ob.multy(sc.nextInt(),sc.nextInt());
       ob.division(sc.nextInt(),sc.nextInt());
	}

}
