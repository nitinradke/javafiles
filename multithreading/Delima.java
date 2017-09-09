class Delima
{
	public static void main(String [] args)
	{
		Mythread t=new Mythread();
		t.setPriority(10);
		t.start();
		for(int k=0;k<10;k++)
		{
			System.out.println("Main Thread");
		}
	}
}

class Mythread extends Thread
{
	public void run()
	{
		for(int l=0;l<10;l++)
		{
			System.out.println("Child Thread");
		}
	}
}	
