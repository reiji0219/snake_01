package main.java.snake.snake_05.upper_05;

import demo_06.Interface;

public class Test_06_10_home
{
  public static void main( String[] args )
  {
    Calc10 calc = new Calc10( "Poly-morohism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc10.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}

