package under_02;

import demo_06.Interface;

public class Test_02_23_home
{ 
  public static void main( String[] args )
  { 
    Calc23 calc = new Calc23( "Poly-morphism" );
    calc.process( () -> { 
      System.out.println( "関心事を記述" );

    Interface save = Calc23.create();
      save.execute();

    System.out.println( "Hello World_1" );
    });
  }
}

