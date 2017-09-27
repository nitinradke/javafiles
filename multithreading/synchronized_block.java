class synchronized_block
{
  public static void main(String args [])
  {
    Display d=new Display();
    Mythread t1=new Mythread(d,"nitin");
    Mythread t2=new Mythread(d,"radke");
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
    synchronized(this)
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
