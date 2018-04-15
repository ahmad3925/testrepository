
class Shape
{
	int area(int d)
	{	 
		return d*d;
	}
	void area(int l, int b)
	{
		System.out.println("Area of rectangle="+(l*b));
	}
	void area(float b,float h)
	{
		System.out.println("Area of traigle="+(0.5*b*h));
	}
	void area(float b)
	{
		System.out.println("Area of circle="+(3.14*b*b));
	}
}
public class Fun {

	public static void main(String[] args) {
	
		Shape ob =new Shape();
        ob.area(7);
		System.out.println("Area of square="+ob.area(7));
        ob.area(7,8);
        ob.area(12.0f,7.1f);
        ob.area(7.2f);
       

	}

}
