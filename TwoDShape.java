
public abstract class TwoDShape
{
  // Attribtes
  protected String name;
  protected int numOfSides;
  protected double perimeter;
  protected double area;
  
  // Contructor
  public TwoDShape(String n, int sides)
  {
    name = n;
    numOfSides = sides;
  }
  
  // public methods
  public String getName()
  {
    return name;
  }
  
  public int getNumOfSides()
  {
    return numOfSides;
  }
  
  public double getPerimeter()
  {
    return perimeter;
  }
  
  public double getArea()
  {
    return area;
  }
  
  abstract void calculateArea();

  abstract void calculatePerimeter();
  
  
}


