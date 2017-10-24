import java.util.Scanner;

class copy_string
{
    String str;
    copy_string(String str)
    {
      this.str=str;
    }
    copy_string(copy_string s)
    {
      System.out.println("Copy constructor");
      this.str=s.str;
    }
    String get_string()
    {
      return str;
    }
    public static void main(String [] args)
    {
      Scanner scan=new Scanner(System.in);
      String s1=scan.next();
      copy_string cs=new copy_string(s1);
      copy_string cs1=new copy_string(cs);
      System.out.println("String after call to copy constructor "+cs1.get_string()+"\n");
      copy_string cs2=cs;
      System.out.println("String after call to reference assignment "+cs2.get_string());

    }
}
