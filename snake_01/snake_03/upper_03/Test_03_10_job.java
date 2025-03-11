package upper_03;

import demo_06.Interface;

public class Test_03_10_job
{
  public static void main( String[] args )
  {
    Calc10 calc = new Calc10( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc10.create();
        save.execute();

      System.out.println( "ArrayList.add" );
    });
  }
}

