class interthreadcomm
{
  public static void main(String args []) throws Exception
  {
    Mythread m1=new Mythread();
    m1.start();
    System.out.println("Main Thread going to wait");
    synchronized(m1)
    {
    m1.wait();
    }
    System.out.println("Child Thread notified");
    System.out.println(m1.total);
  }
}


class Mythread extends Thread
{
    int total=0;
    public void run()
    {
    synchronized(this)
    {
    for(int i =1;i<=100;i++)
      {
      total+=i;
      }
      System.out.println("Child Thread notifying");
      this.notify();
    }

  }

}
