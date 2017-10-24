class Shape
{
  int x,y;
  void getxyvalue(int x,int y)
  {
    this.x=x;
    this.y=y;
  }
  void showxyvalue()
  {
    System.out.println("The co-ordinate of Shape is "+ this.x +" "+ this.y);
  }
}

class Rectangle extends Shape
{
  void showxyvalue()
  {
    System.out.println("The co-ordinate of Rectangle is "+ this.x +" "+ this.y);
  }
}

class showxy
{
  public static void main(String[] args)
  {
      Shape s=new Rectangle();
      s.getxyvalue(2,3);
      s.showxyvalue();
  }

}
