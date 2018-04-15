package Inheritance;
class parent 
{
	void speak()
	{
		System.out.println("speak");
	}
	void walk()
	{
		System.out.println("Walk"); 
	}
}
class child extends parent
{
	
	void fun()
	{
		System.out.println("Function");		
		
	}	
}
public class Single_inher {

	
		public static void main(String[] args) {
			child ob= new child();
			ob.speak();
			ob.walk();
			ob.fun();
	}

}
