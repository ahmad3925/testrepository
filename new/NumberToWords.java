import java.util.Scanner;
import java.text.DecimalFormat;

public class NumberToWords {

  private static final String[] tensNames = {
    "",
    " ten",
    " twenty",
    " thirty",
    " forty",
    " fifty",
    " sixty",
    " seventy",
    " eighty",
    " ninety"
  };

  private static final String[] numNames = {
    "",
    " one",
    " two",
    " three",
    " four",
    " five",
    " six",
    " seven",
    " eight",
    " nine",
    " ten",
    " eleven",
    " twelve",
    " thirteen",
    " fourteen",
    " fifteen",
    " sixteen",
    " seventeen",
    " eighteen",
    " nineteen"
  };

  
 private static String convertLessThanOneThousand(int number) {
    String s;

    if (number % 100 < 20){
      s = numNames[number % 100];
      number /= 100;
    }
    else {
      s = numNames[number % 10];
      number /= 10;

      s = tensNames[number % 10] + s;
      number /= 10;
    }
    if (number == 0) return s;
    return numNames[number] + " hundred" + s;
  }


  public static String convert(long number) {
    // 0 to 999 999 999 999 999
    if (number == 0) { return "zero"; }

    String snumber = Long.toString(number);
   // pad with "0"
    String mask = "000000000000000L";
    DecimalFormat df = new DecimalFormat(mask);
    snumber = df.format(number);

    
 //XXXnnnnnnnnnnnn
  int trillions = Integer.parseInt(snumber.substring(0,3));
 //nnnXXXnnnnnnnnn  
  int billions = Integer.parseInt(snumber.substring(3,6));
    // nnnnnnXXXnnnnnn
    int millions  = Integer.parseInt(snumber.substring(6,9));
    // nnnnnnnnnXXXnnn
    int hundredThousands = Integer.parseInt(snumber.substring(9,12));
    // nnnnnnnnnnnnXXX
    int thousands = Integer.parseInt(snumber.substring(12,15));

    String tradTrillions;
    switch (trillions) {
    case 0:
      tradTrillions = "";
      break;
case 1 :
      tradTrillions = convertLessThanOneThousand(trillions)
      + " trillion ";
      break;
    default :
      tradTrillions = convertLessThanOneThousand(trillions)
      + " trillion ";
    }
    String result1 =  tradTrillions;

    String tradBillions;
    switch (billions) {
    case 0:
      tradBillions = "";
      break;
case 1 :
      tradBillions = convertLessThanOneThousand(billions)
      + " billion ";
      break;
    default :
      tradBillions = convertLessThanOneThousand(billions)
      + " billion ";
    }
    result1 =  result1+tradBillions;

    
    String tradMillions;
    switch (millions) {
    case 0:
      tradMillions = "";
      break;
    case 1 :
      tradMillions = convertLessThanOneThousand(millions)
         + " million ";
      break;
    default :
      tradMillions = convertLessThanOneThousand(millions)+ " million ";
    }
    result1 =  result1 + tradMillions;

    String tradHundredThousands;
    switch (hundredThousands) {
    case 0:
      tradHundredThousands = "";
      break;
    case 1 :
      tradHundredThousands = "one thousand ";
      break;
    default :
      tradHundredThousands = convertLessThanOneThousand(hundredThousands)
         + " thousand ";
    }
    result1 =  result1 + tradHundredThousands;

    String tradThousand;
    tradThousand = convertLessThanOneThousand(thousands);
    result1 =  result1 + tradThousand;
    // remove extra spaces!
   return result1.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " "); 
  }


  public static void main(String[] args) 
{

    Scanner sc=new Scanner(System.in);  
    System.out.println("Enter a number");
    int a= sc.nextInt();   

    System.out.println(NumberToWords.convert(a));
   

}
}