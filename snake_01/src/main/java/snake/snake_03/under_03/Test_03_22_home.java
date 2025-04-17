package main.java.snake.snake_03.under_03;

import demo_06.Interface;

public class Test_03_22_home
{
  public static void main( String[] args )
  {
    Calc22 calc = new Calc22( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc22.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}

