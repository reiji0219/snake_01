package snake_01;

import demo_06.Interface;

public class Test_01_01_home
{ 
  public static void main( String[] args )
  { 
    Calc01 calc = new Calc01( "Poly-morphism" );
    calc.process( () -> { 
      System.out.println( "関心事を記述" );

      Interface save = Calc01.create();
        save.execute();
    });
  }
}

