package snake_01;

import demo_06.Interface;

public class Test_01_14_job
{
  public static void main( String[] args )
  {
    Calc14 calc = new Calc14( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "Poly-morphism" );

      Interface save = Calc14.create();
        save.execute();
    });
  } 
}
