package upper_01;

import demo_06.Interface;

public class Test_01_08_home
{
  public static void main( String[] args )
  {
    Calc08 calc = new Calc08( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc08.create();
        save.execute();
    });
  }
}

