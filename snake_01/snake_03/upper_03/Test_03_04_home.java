package upper_03;

import demo_06.Interface;

public class Test_03_04_home
{
  public static void main( String[] args )
  {
    Calc04 calc = new Calc04( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc04.create();
        save.execute();

      System.out.println( "Test_03_04_home" );
    });
  }
}

