/********************************************************************************
 *                                                                               *
 * Main class                                                                   *
 * Version 1   
 * Icludes implementation for Square class                                      *
 ********************************************************************************/


public class Main{
  public static void main(String arg[]){
    System.out.println("Choose a a shape to find the area and primeter for: ");
    System.out.println("Square, Equalateral Triangle, circle, ");
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
    if ((shapeName.equalsIgnoreCase("Equalateral Triangle")))
    {
       String lenStr;
       int    len;
       Triangle triangle;
       
       System.out.println("Please enter the base:");
       lenStr = System.console().readLine();
       
       try
       {
          len = Integer.parseInt(lenStr);
       } catch (Exception e)
       {
          System.out.println("Invalid value for integrer! Exiting...");
          return;
       }
       triangle= new Triangle(len);
       triangle.calculateArea();
       triangle.calculatePerimeter();
       
       System.out.println("Area of " + triangle.getName() + " is " +triangle.getArea());
       System.out.println("Perimeter of " + triangle.getName() + " is " +
               triangle.getPerimeter());
      
    }
    if (shapeName.equalsIgnoreCase("Circle"))
    {
       String lenStr;
       int    len;
       Circle circle;
       
       System.out.println("Please enter the radius:");
       lenStr = System.console().readLine();
       
       try
       {
          len = Integer.parseInt(lenStr);
       } catch (Exception e)
       {
          System.out.println("Invalid value for integrer! Exiting...");
          return;
       }
       circle = new Circle(len);
       circle.calculateArea();
       circle.calculatePerimeter();
       
       System.out.println("Area of " + circle.getName() + " is " +circle.getArea());
       System.out.println("Perimeter of " + circle.getName() + " is " +
               circle.getPerimeter());
    }

  }
} 
