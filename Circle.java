public class Circle extends TwoDShape
{
  // Attributes
  private int radius;
  private double pi= 3.14;
  
  // Constructor
  public Circle(int len)
  {
    super("circle",1);
    radius = len;
  }
  
  public void calculateArea()
  {
    area = pi *radius * radius;
  }
  
  public void calculatePerimeter()
  {
    perimeter = 2 * pi * radius;
  }
}
