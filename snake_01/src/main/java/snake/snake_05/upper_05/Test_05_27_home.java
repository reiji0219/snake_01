package main.java.snake.snake_05.upper_05;

public class Test_05_27_home
{
	public static void main( String[] args ) 
	{
// コンストラクタで生成
		Item27 item = new Item27( "掛け算", "税込み価格", 980, 1.1 );
		
// コンストラクタの内容を表示
		Item27.indi( "const :" + item.toString() );
		item.display();

		
		
// setter にて生成
		item.setId( "足し算" );
		item.setName( "合計" );
		item.setPrice( 12.980 );
// 小数点以下が何桁かと○乗は同じ( 5桁なので10 の5乗 )
		item.setTax( 481.13384 );// 4.8113384(E7)<-10^7 整数分2桁増える
		
// setter の内容を表示
		Item27.indi( "setter :" + item.toString() );
		item.sam();

		
/*
重複するコンストラクタを使用しチェーンメソッドで記述する場合には、
インスタンスを( )で囲んで引数無しのコンストラクタを記述すると
コンパイル出来る様になる 括弧は無くてもOKでした
*/
		

		new Item27()
				.id( "掛け算" )
				.name( "税込み価格" )
				.price( 980 )
				.tax( 1.1 );
		//       .save();

		Item27.indi( "tochu :" + item.toString() );

		
		
// Lambda式 で記述 何時もの記述
		Item27.save( itemChain -> {
			itemChain.id( "掛け算" )
					 .name( "税込み価格" )
					 .price( 980 )
					 .tax( 1.1 );

		});

		System.out.println("Hello World_1");
		System.out.println("Hello World_2");
		System.out.println("Hello World_3");
	}
}
