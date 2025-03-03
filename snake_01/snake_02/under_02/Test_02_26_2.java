package under_02;

import demo_06.Interface;

public class Test_02_26_2
{
  public static void main( String[] args )
  {
    Calc26_2 calc = new Calc26_2( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc26_2.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}

