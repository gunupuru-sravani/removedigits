import java.util.Scanner;
class deletenum
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String inp; 
    System.out.println("Enter your string:");
    inp = sc.nextLine();
    System.out.println("After deletion of any digits,the string is:");
    inp = inp.replaceAll("[0123456789]",""); 
    System.out.println(inp);
}
}
java -cp /tmp/ECCsFzVjTv deletenum
Enter your string:0609sri
After deletion of any digits,the string is:sri
