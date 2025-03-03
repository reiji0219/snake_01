package upper_02;

import demo_06.Interface;

public class Test_02_04_home
{
  public static void main( String[] args )
  {
    Calc04 calc = new Calc04( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc04.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}
