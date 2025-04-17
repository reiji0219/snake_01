package main.java.snake.snake_04.upper_04;

public class Test_04_17_home
{
	public static void main( String[] args )
	{
		Item17.save( item -> {
			item.id( "掛け算" )
				   .name( "税込み価格" )
				   .price( 980 )
				   .tax( 1.1 );
			
		});
		
		System.out.println( "Hello World" );
	}
}
                                                                              