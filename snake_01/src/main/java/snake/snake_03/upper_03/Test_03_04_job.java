package main.java.snake.snake_03.upper_03;

import demo_06.Interface;

public class Test_03_04_job
{
  public static void main( String[] args )
  {
    Calc04_1 calc = new Calc04_1( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc04_1.create();
        save.execute();

      System.out.println( "Test_03_04_job" );
    });
  }
}


