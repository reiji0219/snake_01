package snake_01;

import demo_06.Interface;

public class Test_01_19_home
{
  public static void main( String[] args )
  {
    Calc19 calc = new Calc19( "poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc19.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}

