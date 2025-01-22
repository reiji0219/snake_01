package middle_01;

import demo_06.Interface;

public class Test_01_11_home
{
  public static void main( String[] args )
  {
    Calc11 calc = new Calc11( "Poly-morphism" );
    calc.process( () -> {

    Interface save = Calc11.create();
      save.execute();
    });
  }
}

