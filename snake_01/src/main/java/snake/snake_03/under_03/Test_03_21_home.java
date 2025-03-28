package main.java.snake.snake_03.under_03;

import demo_06.Interface;

public class Test_03_21_home
{
  public static void main( String[] args )
  {
    Calc21 calc = new Calc21( "Poly-morphism" );
    calc.process( () -> { 
      System.out.println( "関心事を記述" );

      Interface save = Calc21.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}

