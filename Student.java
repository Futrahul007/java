import java.util.*;
public class Student
{
 public static void main(String arg[])
{
 Scanner x= new Scanner(System.in);
 System.out.print("Enter the marks of student");
 int a =x.nextInt();
 if(a>=85)
{
  System.out.print("Grade : A");
}
 else if(a>=75)
{
  System.out.print("Grade : B");
}
 else if(a>=65)
{
  System.out.print("Grade : c");
}
 else
{
  System.out.print("Grade : D");
}
}
}