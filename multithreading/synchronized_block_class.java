class synchronized_block
{
  public static void main(String args [])
  {
    Display d1=new Display();
    Display d2=new Display();
    Mythread t1=new Mythread(d1,"nitin");
    Mythread t2=new Mythread(d2,"radke");
    t1.start();
    t2.start();
  }
}



class Mythread extends Thread
{
  Display d;
  String s;
  Mythread(Display d,String s)
  {
    this.d=d;
    this.s=s;
  }
  public void run()
  {
    d.wish(s);
  }
}

class Display
{
  public void wish(String s)
  {
    ;;;;;;;;;//many lines
    synchronized(Display.class)
    {
    for(int i=0;i<10;i++)
    {
      try
      {
      System.out.println("Good Morning"+s);
      Thread.sleep(1000);
      }
      catch(InterruptedException e)
      {}

    }
  }
    ;;;;;;;;//many lines
  }
}
