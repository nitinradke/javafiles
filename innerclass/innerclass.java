{
	class inner
	{
		public void m1()
		{
			System.out.println("Nitin");
		}

	}
	public static void main(String [] args)
	{
		 new outer().new inner().m1();
	}
}
