class outer
{ int x=10;
	static int y=20;
	class inner
	{
		public void m1()
		{
			System.out.println(x);
			System.out.println(y); // can access static values but not declare
		}
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
