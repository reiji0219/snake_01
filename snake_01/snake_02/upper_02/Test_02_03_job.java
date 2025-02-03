package upper_02;

import demo_06.Interface;

public class Test_02_03_job
{
  public static void main( String[] args )
  {
    Calc03 calc = new Calc03( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc03.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}

