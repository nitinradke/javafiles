class Synchronized
{
	public static void main(String [] args)
	{
	Display d=new Display();
	mythread m1=new mythread(d,"Dhoni");
	mythread m2=new mythread(d,"Yuvraj");
	m1.start();
	m2.start();
	}
}

class mythread extends Thread
{
	Display d;
	String name;
	mythread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}

class Display
{
	synchronized void wish(String s)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(s+"Batting");
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException ie)
			{}
		}
	}
}

