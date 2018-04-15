interface A
{
	void sum();
	void dispay();
 default void add()
{
	System.out.println("Add A");
}

}

interface B
{
	void print();
	void mul();
	default void add()
	{
		System.out.println("Add B");
	}
}


class abc implements A,B 
{
 
@Override
public void print() {
	System.out.println("Print");
}

@Override
public void mul() {
	System.out.println("multiply");
}

@Override
public void sum() {
	System.out.println("sum");
}

@Override
public void dispay() {
	System.out.println("Display");	
}
public void add()
{  
A.super.add();
B.super.add();
}
}

class cmain
{
  public static void main(String args[]) 
  { 
	  A ob =new abc();
	  B ob2 = new abc();	 
	 ob.sum();
	 ob.dispay();
	 ob2.print();
     ob2.mul();
      
    
 }	

}
