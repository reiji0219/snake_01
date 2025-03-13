package main.java.snake.snake_03.middle_03;

import demo_06.Interface;

public class Test_03_11_home
{
  public static void main( String[] args )
  {
    Calc11 calc = new Calc11( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc11.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}

