package main.java.snake.snake_05.upper_05;

import demo_06.Interface;

public class Test_06_11_home 
{
	public static void main( String[] args )
	{
		Calc11 calc = new Calc11( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );
			
			Interface save = Calc11.create();
			save.execute();
			
			System.out.println( "Hello World_1" );
		});
	}
}


