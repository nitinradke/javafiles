import java.util.*;
class Armstrong
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int temp=n;
		int num=0;
		while(n>0)
		{
			int rmd=n%10;
			num=num+rmd*rmd*rmd;
			n=n/10;
		}
		if(num==temp)
		{
			System.out.println("Number is armstrong number");
		}
		else
		{
			System.out.println("number is not a armstrong number");
		}
	}
}
