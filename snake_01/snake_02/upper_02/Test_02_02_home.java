package upper_02;

import demo_06.Interface;

public class Test_02_02_home
{
  public static void main( String[] args )
  {
    Calc02 calc = new Calc02( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc02.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}

