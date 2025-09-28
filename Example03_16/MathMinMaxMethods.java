/*  A demonstration of the min and max Math class methods
    Anderson, Franceschi
*/

public class MathMinMaxMethods
{
  public static void main( String [] args )
  {
    int smaller = Math.min( 8, 2 );
    System.out.println( "The smaller of 8 and 2 is " + smaller );

    int larger = Math.max( 8, 2 );
    System.out.println( "The larger of 8 and 2 is " + larger );

    int a = 8, b = 5, c = 12;
    int tempSmaller = Math.min( a, b );   // find smaller of a & b
    int smallest = Math.min( tempSmaller, c ); // compare result to c
    System.out.println( "The smallest of " + a + ", " + b + ", and "
                        + c + " is " + smallest );
  }
}
