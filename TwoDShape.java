
/**********************************************************************
 *  Parent class TwoDShape
 *  Implements the common methods of any 2D shape.
 *  The abstract methods need info about the specific 2DShape which is 
 *  left for the subclass to implement.
 *  Note: Main cannot instantiate (call the constructor method) this class
 *        due to abstract method.
 *        Subclasses can call the constructor method.
 *
 *
 ***********************************************************************/

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


