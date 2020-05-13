import java.util.Scanner;
class Add
{
  public static void main(String arg[])
{
  Scanner x = new Scanner(System.in);
  float a,b;
 System.out.println("Enter two Number: ");
 a=x.nextFloat();
 b=x.nextFloat();
 System.out.println("Sum = "+(a+b));
}
}