import p1.addition;
import p1.p2.operations;
import java.util.*;
class arithematic
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		char c=scan.next().charAt(0);
		addition ad=new addition();
		switch(c)
		{
			case '+':
				ad.add(a,b);
				break;
			case '-':
				new operations().subtract(a,b);
				break;
			case '*':
				new operations().multiply(a,b);
				break;
			case '/':
				new operations().divide(a,b);
				break;
		}
	}
}

