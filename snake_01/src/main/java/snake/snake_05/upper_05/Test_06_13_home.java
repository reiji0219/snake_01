package main.java.snake.snake_05.upper_05;

import demo_06.Interface;

public class Test_06_13_home
{
  public static void main( String[] args )
  {
    Calc13 calc = new Calc13( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc13.create();
        save.execute();

     System.out.println( "Hello World_1" );
    });
  }
}
