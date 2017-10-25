class mythread extends Thread
{
  public void run()
  {
    for(int i=1;i<=10;i++)
    {
      System.out.println("CSVTU "+Thread.currentThread().getName());
    }
  }
}

class demo{
  public static void main(String[] args)
  {
    mythread mt = new mythread();
    mythread mt1 = new mythread();
    mythread mt2 = new mythread();
    mt.setName("Thread_1");
    mt1.setName("Thread_2");
    mt2.setName("Thread_3");
    mt.start();
    mt1.start();
    mt2.start();
  }
}  
