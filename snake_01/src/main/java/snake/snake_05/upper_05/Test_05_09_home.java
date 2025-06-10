package main.java.snake.snake_05.upper_05;

import demo_06.Interface;
import leapYear.LeapYear;
import stream_API.Stream_API;

public class Test_05_09_home
{
  public static void main( String[] args )
  {
    Calc09 calc = new Calc09( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc09.create();
        save.execute();
        
        
      LeapYear leap = new LeapYear();
      	System.out.println( leap.isLeapYear( 1904 ) );
      	
      	
      new Stream_API();
      	

      System.out.println( "Hello World_1" );
    });
  }
}
