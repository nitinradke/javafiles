class outer
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
	}


}

class outerextra
{
	public static void main(String [] args)
	{
		outer o=new outer();
		outer.inner in= o.new inner();
		in.m1();
	}
}
