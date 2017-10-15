/********************************************************************************
 *                                                                               *
 * Main class                                                                   *
 * Version 1   
 * Icludes implementation for Square class                                      *
 ********************************************************************************/


public class Main{
  public static void main(String arg[]){
    System.out.println("Choose a a shape to find the area and primeter for: ");
    System.out.println("Square, Triangle, circle, ");
    String shapeName = new String("");  // help input
    shapeName = System.console().readLine(); 
    
    if (shapeName.equalsIgnoreCase("Square"))
    {
       String lenStr;
       int    len;
       Square square;
       
       System.out.println("Please enter side length:");
       lenStr = System.console().readLine();
       
       try
       {
          len = Integer.parseInt(lenStr);
       } catch (Exception e)
       {
          System.out.println("Invalid value for integrer! Exiting...");
          return;
       }
       square = new Square(len);
       square.calculateArea();
       square.calculatePerimeter();
       
       System.out.println("Area of " + square.getName() + " is " +square.getArea());
       System.out.println("Perimeter of " + square.getName() + " is " +
               square.getPerimeter());
    }

  }
} 

