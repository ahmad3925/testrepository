import java.util.Scanner;


public class Test {


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		
		String temp="";
		int l=n.length();
		
		for(int i=0;i<l;i++)
		{
			char ch=n.charAt(i);
			switch(ch)
			{
			case '0':
				temp+="Zero\n";
				break;
			case '1':
				temp+="One\n";
				break;
			case '2':
				temp+="Two\n";
				break;
			case '3':
				temp+="Three\n";
				break;
			case '4':
				temp+="Four\n";
				break;
			case '5':
				temp+="Five\n";
				break;
			case '6':
				temp+="Six\n";
				break;
			case '7':
				temp+="Seven\n";
				break;
			case '8':
				temp+="Eight\n";
				break;
			case '9':
				temp+="Nine\n";
				
			}
		}
		System.out.println(temp);
		

	}

}
