package upper_02;

import demo_06.Interface;

public class Test_02_06_home
{
  public static void main( String[] args )
  {
    Calc06 calc = new Calc06( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc06.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}