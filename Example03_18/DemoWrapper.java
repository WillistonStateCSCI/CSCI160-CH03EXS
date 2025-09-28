/*  A demonstration of the Wrapper classes and methods
    Anderson, Franceschi
*/

public class DemoWrapper
{
  public static void main( String [] args )
  {
    int intPrimitive = 42;
    Integer integerObject = intPrimitive;

    System.out.println( "The int is " + intPrimitive );
    System.out.println( "The Integer object is " + integerObject );

    int sum = intPrimitive + integerObject;
    System.out.println( "Their sum is " + sum );

    int i1 = Integer.parseInt( "76" );    // convert "76" to an int
    Integer i2 = Integer.valueOf( "76" ); // convert "76" to Integer
    System.out.println( "\nThe value of i1 is " + i1 );
    System.out.println( "The value of i2 is " + i2 );

    double d1 = Double.parseDouble( "58.32" );
    Double d2 = Double.valueOf( "58.32" );
    System.out.println( "\nThe value of d1 is " + d1 );
    System.out.println( "The value of d2 is " + d2 );
  }
}
