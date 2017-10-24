import java.util.Scanner;
class Box
{
  double length,width,height;
  Box(double length,double width,double height)
  {
    this.length=length;
    this.width=width;
    this.height=height;
  }
  double volume()
  {
    return length*width*height;
  }
  double SurfaceArea()
  {
    return 2*(length*width+height*width+length*height);
  }
  public static void main(String [] args)
  {
    Scanner scan=new Scanner(System.in);
    double l,b,h;
    l=scan.nextDouble();
    b=scan.nextDouble();
    h=scan.nextDouble();
    Box b1=new Box(l,b,h);
    System.out.println("The Volume of Box is " +b1.volume());
    System.out.println("The Surface-Area of Box is " +b1.SurfaceArea());
  }

}
