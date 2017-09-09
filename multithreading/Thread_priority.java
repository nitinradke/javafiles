class Mythread extends Thread
{

}
class Thread_priority{
  public static void main(String [] args)
  {
    //Thread.currentThread().setPriority(7);
    Mythread t1=new Mythread();
    System.out.println(t1.getPriority());
  }

}
