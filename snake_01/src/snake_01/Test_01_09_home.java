package snake_01;

import demo_06.Interface;

public class Test_01_09_home
{
	public static void main(String[] args) 
	{
		Calc09 calc = new Calc09("Ploy-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc09.create();
			save.execute();

			System.out.println("Hello world_1");
		});
	}
}
