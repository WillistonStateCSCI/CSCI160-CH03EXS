/*  A demonstration of using Scanner's nextLine method
    Anderson, Franceschi
*/

import java.util.Scanner;

public class InputALine
{
  public static void main( String [] args )
  {
    Scanner scan = new Scanner( System.in );

    System.out.print( "Enter a sentence > " );
    String sentence  = scan.nextLine( );
    System.out.println( "You said: \"" + sentence + "\"" );
  }
}