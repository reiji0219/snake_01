package middle_02;

import demo_06.Interface;

public class Test_02_12_home 
{
	public static void main( String[] args ) 
	{
		Calc12 calc = new Calc12( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );

			Interface save = Calc12.create();
			save.execute();

			System.out.println( "Hello World_1" );
		});
	}
}
