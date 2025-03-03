package upper_02;

import demo_06.Interface;

public class Test_02_01_job 
{
	public static void main(String[] args) {
		Calc02_3 calc = new Calc02_3("Poly-morphism");
		calc.process(() -> {
			System.out.println("関心事を記述");

			Interface save = Calc02_3.create();
			save.execute();

			System.out.println("Hello World_1");
		});
	}
}
