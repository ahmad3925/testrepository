package xyz.basicscoding.dayoftheweek;
import java.util.Scanner;
import java.lang.*;
public class DayOfTheWeek {

final static String[] DAYS={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
	public static void main(String[] args) {
    Scanner input= new Scanner(System.in);	
    System.out.println("Enter the date in DD/MM/YYY format ");
    
    String []dates= input.nextLine().split("/");
    int d=Integer.parseInt(dates[0]);	
    int m=Integer.parseInt(dates[1]);
    int y=Integer.parseInt(dates[2]);
	
	if(m<3){
		m+=	12;
    	y-=1;
}
  int k=y*100;
  int j=y/100;

  int day=((d+((m+1)*26)/10)+k+(k/4)+(j/4))+(5*j)%7;
   System.out.println("Day"+DAYS[day]);
 
}
}