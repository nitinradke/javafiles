class Deadlock2
{
	public static void main(String [] args) throws InterruptedException
	{
		Thread.currentThread().join();
	}
}
