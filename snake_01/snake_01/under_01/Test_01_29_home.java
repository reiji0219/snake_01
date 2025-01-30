package under_01;

import demo_06.Interface;

public class Test_01_29_home
{
  public static void main( String[] args )
  {
    Calc29 calc = new Calc29( "Poly-morphism" );
    calc.process( () -> { 
      System.out.println( "関心事を記述" );

      Interface save = Calc29.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}

