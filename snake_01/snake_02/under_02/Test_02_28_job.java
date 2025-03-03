package under_02;

import demo_06.Interface;

public class Test_02_28_job
{ 
  public static void main( String[] args )
  { 
    Calc28 calc = new Calc28( "Poly-morphism" );
    calc.process( () -> {
      System.out.println( "関心事を記述" );

      Interface save = Calc28.create();
        save.execute();

      System.out.println( "Hello World_1" );
    });
  }
}
