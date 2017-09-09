class Mythread extends Thread
{

}

class Thread_priority{
  public static void main(String [] args)
  {
    Thread.currentThread().setPriority(7);  //only default priority of main thread is 5
					   //other thread just inherits priority freom parents
    Mythread t1=new Mythread();
    System.out.println(t1.getPriority());
  }

}
