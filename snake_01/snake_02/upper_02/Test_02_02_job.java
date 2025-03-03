package upper_02;

import demo_06.Interface;

public class Test_02_02_job
{
  public static void main( String[] args )
  {
    Calc02_2 calc = new Calc02_2( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc02_2.cteate();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}
