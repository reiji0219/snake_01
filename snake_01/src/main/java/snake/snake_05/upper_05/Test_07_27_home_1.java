package main.java.snake.snake_05.upper_05;

import demo_06.Interface;

public class Test_07_27_home_1
{
  public static void main( String[] args )
  {
    Calc27_1 calc = new Calc27_1( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc27_1.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}
