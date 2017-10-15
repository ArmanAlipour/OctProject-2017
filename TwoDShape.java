
/*******************************************************************************************
 * Class: TwoDShape
 * Desc: THis is the generic clss to represent a 2D shape.
 *       There are two abstract methods which should be implemented by the sub-classes.
 *
 ******************************************************************************************/

public abstract class TwoDShape
{
  // Attribtes
  protected String name;
  protected int numOfSides;
  protected int perimeter;
  protected int area;
  
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
  
  public int getPerimeter()
  {
    return perimeter;
  }
  
  public int getArea()
  {
    return area;
  }
  
  abstract void calculateArea();

  abstract void calculatePerimeter();
  
}


