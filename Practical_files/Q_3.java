import java.util.Scanner;
class matmult
{
  public static void main(String [] args)
  {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int [][] m1=new int[3][3];
    int [][] m2=new int[3][3];
    int [][] m3=new int[3][3];
    System.out.println("Enter the elements of 1st martix row wise \n");
    for (int i = 0; i < n; i++)
      {
          for (int j = 0; j < n; j++)
          {
             m1[i][j] = scan.nextInt();
          }
      }
    System.out.println("Enter the elements of 2nd martix row wise \n");
    for (int i = 0; i < n; i++)
      {
        for (int j = 0; j < n; j++)
        {
               m2[i][j] = scan.nextInt();
        }
      }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
          for(int k=0;k<n;k++)
          {
            m3[i][j]+=m1[i][k]*m2[k][j];
          }
        }
    }
    System.out.println("Final answer \n");
    for (int i = 0; i < n; i++)
       {
           for (int j = 0; j < n; j++)
           {
               System.out.print(m3[i][j] + " ");
           }
           System.out.println();
       }


  }
}
