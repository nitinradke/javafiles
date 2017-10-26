import pack.Arithematic;
class demo
{
  public static void main(String[] args)
  {
      Arithematic a=new Arithematic();
      try
      {
        a.m1();
      }
      catch(ArithmeticException e)
      {
        System.out.println("Arithmetic Exception Caught");
      }
  }
}
