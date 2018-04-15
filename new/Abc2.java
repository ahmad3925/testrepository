
import java.util.Scanner;

class Abc {

	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);
       System.out.println("Enter of times you want to perform calciulation");
       int n= sc.nextInt();
     
        for(int i=0;i<=n;i++)    
        {
       Input ob1= new Input();
       ob1.setA(sc.nextInt());
       ob1.setB(sc.nextInt());
       
       Calc ob= new Calc();
       ob.add(ob1.getA(),ob1.getB());
       ob.sub(ob1.getA(),ob1.getB());
       ob.multy(ob1.getA(),ob1.getB());
       ob.division(ob1.getA(),ob1.getB());
	}
	}
}
