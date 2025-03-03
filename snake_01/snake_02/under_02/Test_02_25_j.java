package under_02;

import demo_06.Interface;

public class Test_02_25_j
{
  public static void main( String[] args )
  {
    Calc25_2 calc = new Calc25_2( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc25_2.create();
        save.execute();

      System.out.println( "ArrayList" );
    });
  }
}

