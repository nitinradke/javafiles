class  A
{
  int x=10;
  static int y=20;
  public static void m1()
  {
    int w=10;
    final int z=30;
    class B
    {
      void m2()
      {
        //System.out.println("The value is "+ x);
        System.out.println("The value is "+ y);
        //System.out.println("The value is "+ w);
        System.out.println("The value is "+ z);

      }
    }
    B b=new B();
    b.m2();
  }
  public static void main(String [] args)
  {
    A.m1();
  }
}
