import java.util.Scanner;

public class Implement implements Interface1 {

	private Scanner sc= new Scanner(System.in);
	private DataInput obj= new DataInput();
	@Override
	public void Hold_data() {
	obj.setA(sc.nextInt());
	obj.setB(sc.nextInt());
	obj.setS(sc.nextLine());
	}

	@Override
	public void print() {
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		System.out.println(obj.getS());

	}

}
