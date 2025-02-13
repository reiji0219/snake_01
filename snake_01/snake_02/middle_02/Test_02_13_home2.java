package middle_02;

import demo_06.Interface;

public class Test_02_13_home2
{
	public static void main( String[] args )
	{
		Calc13_2 calc = new Calc13_2( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );

			Interface save = Calc13_2.create();
			save.execute();

			System.out.println( "Hello World_1" );
		} );
	}
}
