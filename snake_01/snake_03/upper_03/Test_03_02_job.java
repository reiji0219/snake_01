package upper_03;

import demo_06.Interface;

public class Test_03_02_job
{
  public static void main( String[] args )
  {
    Calc02_1 calc = new Calc02_1( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc02_1.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}

