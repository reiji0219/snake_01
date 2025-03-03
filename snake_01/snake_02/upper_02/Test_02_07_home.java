package upper_02;

import demo_06.Interface;

public class Test_02_07_home
{
  public static void main( String[] args )
  {
    Calc07 calc = new Calc07( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc07.create();
        save.execute();

      System.out.println( "Hello World_1" );
   });
  }
}

