public class Triangle extends TwoDShape
{
  // Attributes
  private int base;
  private double height;
  private double sin_60 = 0.86;
  
  // Constructor
  public Triangle(int len)
  {
    super("Triangle", 3);
    base = len;
    height= base * sin_60;
  }
  
  public void calculateArea()
  {
    area = (base * height)/2;
  }
  
  public void calculatePerimeter()
  {
    perimeter = base*3;
  }
}

