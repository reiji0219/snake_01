package under_01;

import demo_06.Interface;

public class Test_01_21_home
{
	public static void main( String[] args ) 
	{
		Calc21 calc = new Calc21( "Poly-morphism" );
		calc.process(() -> {
			System.out.println( "関心事を記述" );

			Interface save = Calc21.create();
			save.execute();

			System.out.println( "Test_01_21_home" );
		});
	}
}
