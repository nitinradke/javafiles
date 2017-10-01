class outer
{
  public void m1()
  {
    class inner
    {
      void sum(int a,int b)
      {
        System.out.println("The sum is"+(a+b));
      }
    }
      inner in=new inner();
      in.sum(10,10);
      in.sum(100,100);
      in.sum(1000,1000);

    }
  public static void main(String [] args)
  {
    outer o=new outer();
    o.m1();

  }
}
