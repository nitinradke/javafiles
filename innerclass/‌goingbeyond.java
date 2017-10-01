class outer
{
	class inner
	{
		class inner2
		{
		public void m1()
			{
				System.out.println("Innermost class")
			}
		}
  }
}

class outerextra
{
	public static void main(String [] args)
	{
		outer o=new outer();
		outer.inner in= o.new inner();
		outer.inner.inner2 in2=o.in.new inner2();
		in2.m1();
	}
}
