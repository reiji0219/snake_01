package middle_02;

import demo_06.Interface;

public class Test_02_17_home
{
  public static void main( String[] args )
  {
    Calc17 calc = new Calc17( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc17.create();
        save.execute();

    System.out.println( "Hello World_1" );
    });
  }
}