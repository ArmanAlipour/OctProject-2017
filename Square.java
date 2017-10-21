
/********************************************************
 *  Class: Square
 *         Extends parent object TwoDShape
 *         Provide methods for calculating the area and
 *         Perimeter of a square shape.
 *
 *********************************************************/ 

public class Square extends TwoDShape
{
  // Attributes
  private int sideLength;
  
  // Constructor
  public Square(int len)
  {
    super("Square", 4);
    sideLength = len;
  }
  
  public void calculateArea()
  {
    area = sideLength * sideLength;
  }
  
  public void calculatePerimeter()
  {
    perimeter = sideLength * 4;
  }
}

