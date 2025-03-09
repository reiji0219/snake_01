package upper_03;

import demo_06.Interface;

public class Test_03_05_home
{
  public static void main( String[] args )
  {
    Calc05 calc = new Calc05( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc05.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}
