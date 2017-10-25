import java.util.Scanner;
class myException extends Exception
{}


class demo
{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter marks of subject");
    int marks=scan.nextInt();
    try
    {
      if(marks>100)
      {
        throw new myException();
      }
    }
    catch(myException e)
    {
      System.out.println("Marks entered are greater than 100");
    }
  }
}
