package main.java.snake.snake_03.under_03;

import demo_06.Interface;

public class Test_03_28_job
{
  public static void main( String[] args )
  {
    Calc28 calc = new Calc28( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc28.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}

