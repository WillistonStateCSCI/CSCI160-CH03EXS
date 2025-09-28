/* A Demonstration of Calling Methods
   Anderson, Franceschi
*/

public class Methods
{
  public static void main( String [] args )
  {
    String greeting;
    greeting = new String( "Good Morning" );

    int len = greeting.length( );
    System.out.println( "There are " + len + " characters" ); 
    
    int indexOfM = greeting.indexOf( 'M' );
    System.out.println( "The index of M is " + indexOfM );
    char charAtIndex3 = greeting.charAt( 3 );
    System.out.println( "At index 3, we have a " + charAtIndex3 );

    String sub5 = greeting.substring( 5, greeting.length( ) );
    System.out.println( "sub5 is " + sub5 );
    
    System.out.println( "In caps: " + greeting.toUpperCase( ) );
    System.out.println( "greeting is still " + greeting );
  }
}
