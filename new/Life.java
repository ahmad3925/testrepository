import java.util.Scanner;

class Life {
	public static void main(String[] args) 
	{
	int num;
    Scanner sc = new Scanner(System.in);
    num= sc.nextInt();
    
    while(num!=42)
    {
    System.out.println(num);
    num= sc.nextInt();
    }
    for(int i=0; i<=100;i++)
    num= sc.nextInt();
    
    System.exit(0);
	}
    
}
