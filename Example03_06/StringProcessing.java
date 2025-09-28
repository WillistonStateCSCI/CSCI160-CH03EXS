/* Demonstrating String Processing
   Anderson, Franceschi
*/
public class StringProcessing
{
  public static void main( String [] args )
  {
    String invertedName = "lincoln, abraham";

    int comma = invertedName.indexOf( ',' ); // find the comma
    System.out.println( "\nThe index of ',' in \""
                        + invertedName + "\" is " + comma );

    // last name: extract all characters before the comma
    String lastName = invertedName.substring( 0, comma );
    System.out.println( "The last name is " + lastName );

    // first name: extract all characters after the space 
    String firstName = invertedName.substring( comma + 2 );
    System.out.println( "The first name is " + firstName );
    
    // convert the first letter of each name to uppercase
    String firstNameStart = firstName.substring( 0, 1 );
    firstNameStart = firstNameStart.toUpperCase( );
    String firstNameRemainder = firstName.substring( 1 );
    firstNameRemainder = firstNameRemainder.toLowerCase( );
    firstName = firstNameStart + firstNameRemainder;

    String lastNameStart = lastName.substring( 0, 1 );
    lastNameStart = lastNameStart.toUpperCase( );
    String lastNameRemainder = lastName.substring( 1 );
    lastNameRemainder = lastNameRemainder.toLowerCase( );
    lastName = lastNameStart + lastNameRemainder;
    
    String fullName = firstName + " " + lastName;
    System.out.println( "\nThe formatted full name is " 
                           + fullName  + "." );   
  }
}
