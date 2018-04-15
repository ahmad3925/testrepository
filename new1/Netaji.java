
import java.io.*;
public class Netaji
{
public static void main()throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
System.out.println("Enter your name please");
String a=input.readLine();
int count=a.length();
int i=1,adprint;
char pchar,hold;

for(i=1;i<=count;i++)
{
hold=a.charAt(i);
if(i==1)
{
pchar=a.charAt(0);
System.out.print(pchar+".");
}

else if(hold==' ')
{
adprint=i+1;
pchar=a.charAt(adprint);
System.out.print(pchar+".");
}
}

}

} 