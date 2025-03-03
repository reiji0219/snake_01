package upper_03;

import  demo_06.Interface;

public class Test_03_03_home
{
  public static void main( String[] args )
  {
    Calc03_1 calc = new Calc03_1( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc03_1.create();
        save.execute();

      System.out.println( "Test_03_03_home" );
    });
  }
}

