class outer
{ int x=10;
	class inner
	{
    int x=20;
		public void m1()
		{
      int x=1000;
			System.out.println(x);
			System.out.println(this.x); // a way to access all the instance var of inner class
      System.out.println(outer.this.x); // a way to access all the instance var of outer class
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
