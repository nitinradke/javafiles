abstract class Dimension
{
  int l,w;
  Dimension(int l,int w)
  {
    this.l=l;
    this.w=w;
  }
  abstract void area();
}

class Rectangle extends Dimension
{
  Rectangle(int l,int w)
  {
    super(l,w);
  }
  void area()
  {
    System.out.println("The area of Ractangle is "+ (double)(this.l*this.w));
  }
}

class Triangle extends Dimension
{
  Triangle(int l,int w)
  {
    super(l,w);
  }
  void area()
  {
    System.out.println("The area of triangle is "+ 0.5*this.l*this.w);
  }
}

class demo
{
  public static void main(String[] args) {
    Rectangle r=new Rectangle(2,3);
    Triangle t=new Triangle(2,3);
    r.area();
    t.area();
  }
}
