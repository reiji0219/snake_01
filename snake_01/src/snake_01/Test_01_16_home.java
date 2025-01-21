package snake_01;

import demo_06.Interface;

public class Test_01_16_home
{
  public static void main( String[] args )
  {
    Calc16 calc = new Calc16( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc16.create();
        save.execute();

      System.out.println( "Hello World_1" );
     });
   }
 }

