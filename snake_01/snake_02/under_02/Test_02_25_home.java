package under_02;

import demo_06.Interface;

public class Test_02_25_home
{ 
  public static void main( String[] args )
  { 
    Calc25 calc = new Calc25( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc25.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}

