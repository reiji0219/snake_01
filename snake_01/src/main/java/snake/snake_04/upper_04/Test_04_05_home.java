package main.java.snake.snake_04.upper_04;

//import snake_01.src.main.java.snake.snake_03.under_03.test04_05.Item05;

public class Test_04_05_home
{
  public static void main( String[] args )
  {
/* コンストラクタの場合はインスタンスを生成して引数を記述

    Item05 item = new Item05("掛け算", "税込み価格", 980, 1.1); */

/* メンバー変数にprivate が付いた場合は setter/getter が必要
   setterメソッドを呼び出すが item.set○○() が面倒くさいので
   チェーンメソッドに変更する*/
    Item05 item = new Item05();
      item.setId( "掛け算" );
      item.setName( "税込み価格" );
      item.setPrice( 980 );
      item.setTax( 1.1 );    


    String str = item.toString();
      System.out.println( str );



    System.out.println( "Hello World_1" );
    System.out.println( "Hello World_2" );
   }
 }
