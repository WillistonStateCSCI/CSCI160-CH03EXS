/* Demonstrating String methods
   Anderson, Franceschi
*/
public class StringDemo
{
  public static void main( String [] args )
  {
    String s1 = new String( "OOP in Java " );
    System.out.println( "s1 is: " + s1 );
    String s2 = "is not that difficult. ";
    System.out.println( "s2 is: " + s2 );

    String s3 = s1 + s2; // new String is s1, followed by s2
    System.out.println( "s1 + s2 is: " + s3 );

    System.out.println( "s1 is still: " + s1 ); // s1 is unchanged
    System.out.println( "s2 is still: " + s2 ); // s2 is unchanged

    String empty = new String( );
    System.out.println( "\nThe length of the empty String is "
                        + empty.length( ) );

    String greeting = "Hello"; // instantiate greeting
    char firstChar = greeting.charAt( 0 );
    char lastChar = greeting.charAt( greeting.length( ) - 1 );
    System.out.println( "\nThe first and last characters of "
                        + greeting + " are " + firstChar 
                        + " and " + lastChar );
                        
    int indexOfE = greeting.indexOf( 'e' );
    System.out.println( "\nThe index of e is " + indexOfE );
    System.out.println( "The index of l is " 
                           + greeting.indexOf( 'l' ) );
    System.out.println( "The index of lo is "  
                           + greeting.indexOf( "lo" ) );
    System.out.println( "The index of h is " 
                           + greeting.indexOf( 'h' ) );
                           
    System.out.println( "\nThe middle three characters of Hello are " 
                           + greeting.substring( 1, 4 ) );
    System.out.println( "All characters of Hello except the first are " 
                           + greeting.substring( 1 ) ); 
                           
    String s4 = "\n\t   \t    \n \t  ";
    System.out.println( "\nIs s4 blank? " + s4.isBlank( ) );
    s4 = s4.strip( );
    System.out.println( "Is s4 now empty? " + s4.isEmpty( ) );
  }
}
