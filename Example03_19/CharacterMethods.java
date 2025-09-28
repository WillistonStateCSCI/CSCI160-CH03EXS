/* Character Methods
   Anderson, Franceschi
*/
import java.util.Scanner;

public class CharacterMethods
{
   public static void main( String [] args )
   {
      Scanner scan = new Scanner( System.in );
      
      System.out.print( "Enter a character > " );
      String input = scan.next( );
      char c = input.charAt( 0 );
      
      System.out.println( "The Unicode decimal value of " + c + " is: " 
                                    + ( int ) c );
  
      System.out.println(  "\n" + c + " is a digit: " 
                                   + Character.isDigit( c ) );
                                   
      System.out.println(  "\n" + c + " is a letter: " 
                                   + Character.isLetter( c ) );
      System.out.println(  c + " is uppercase: " 
                                   + Character.isUpperCase( c ) );
      System.out.println(  c + " is lowercase: " 
                                   + Character.isLowerCase( c ) );
      
      System.out.println(  "\n" + c + " in uppercase is: " 
                                   + Character.toUpperCase( c ) );
      System.out.println(  c + " in lowercase is: " 
                                   + Character.toLowerCase( c ) );                
   }
}
