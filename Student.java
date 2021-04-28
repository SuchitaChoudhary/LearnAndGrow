import java.util.*;

class A
{
  void readRollNo(int a)
  {
    System.out.println("Rollnumber"+a);
  }
  void readRollNo(String a)
  {
    System.out.println("name"+a);
  }
}
public class Student
{
public static void main(String args[])
{
Scannner sc=new Scanner(System.in);
int rollnumber=sc.nextInt();
A a=new A();
a.readRollNo(rollNumber);
}
}
