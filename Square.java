import java.util.Scanner;
class Square
{ 
 public static void main(String arg[])
{
  Scanner x = new Scanner(System.in);
  System.out.print("Enter the Number");
  int a =x.nextInt();
   double squareroot = Math.sqrt(a);
  System.out.print("Value of given number is "+squareroot);
}
} 