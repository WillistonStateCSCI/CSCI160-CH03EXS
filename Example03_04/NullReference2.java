/* A Demonstration of Trying to Use a Null Object Reference
   Anderson, Franceschi
*/

public class NullReference2
{
  public static void main( String [] args )
  {
    String greeting = new String( "Hello" );
    int len = greeting.length( );
    System.out.println( greeting + " has " + len + " characters" );
    
    greeting = null; 
    // attempt to use null object reference
    len = greeting.length( );
  }
}
