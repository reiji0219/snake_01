package upper_02;

import demo_06.Interface;

public class Test_02_04_job 
{
	public static void main(String[] args) 
	{
		Calc04_2 calc = new Calc04_2("Poly-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc04_2.create();
			save.execute();

			System.out.println("Hello World_1");

		});
	}
}
