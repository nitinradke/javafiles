class sort_string
{
	public static void main(String [] args)
	{
		String [] str = {"nitin","chandan","nikhil","pratik","pc"};
		for(int n=0;n<str.length;n++)
		{
			for(int j=0;j<str.length;j++)
			{
				if(str[j].compareTo(str[n])>0)
				{
						String temp=str[n];
						str[n]=str[j];
						str[j]=temp;
				}
			}
		}
		for(String s:str)
		{
			System.out.println(s);
		}
	}
}
