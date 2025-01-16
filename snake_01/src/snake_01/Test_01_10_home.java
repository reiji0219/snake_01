package snake_01;

import demo_06.Interface;

public class Test_01_10_home
{
  public static void main( String[] args )
  {
    Calc10 calc = new Calc10( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc10.create();
        save.execute();
    });
  }
}

