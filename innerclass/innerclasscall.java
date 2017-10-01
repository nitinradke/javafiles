class outer
{
	class inner
	{
		public void m1()
		{
			System.out.println("Nitin");
		}


	}
	void m2()
	{
		new inner().m1();
	}
	public static void main(String [] args)
	{
		 new outer().m2();
	}
}
