/*  Demonstration of currency and percentage formatting
    using the NumberFormat class.
    Anderson, Franceschi
*/

// we need to import the NumberFormat class from java.text
import java.text.NumberFormat;

public class DemoNumberFormat
{
  public static void main( String [] args )
  {
     double winningPercentage = .675;
     double price = 78.9;

     // get a NumberFormat object for printing a percentage
     NumberFormat percentFormat = NumberFormat.getPercentInstance( );

     // call format method using the NumberFormat object
     System.out.print( "The winning percentage is " );
     System.out.println( percentFormat.format( winningPercentage ) );

     // get a NumberFormat object for printing currency
     NumberFormat priceFormat = NumberFormat.getCurrencyInstance( );

     // call format method using the NumberFormat object
     System.out.println( "\nThe price is: "
                         + priceFormat.format( price ) );
  }
}
