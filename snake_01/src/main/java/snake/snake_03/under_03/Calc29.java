package main.java.snake.snake_03.under_03;

import demo_06.Interface;

public class Calc29 extends Item29
{
  private String name;

  public Calc29( String name ){
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc29 calc = new Calc29( "Poly-morphism" );

      Item29.save( item -> {
        item.id( "掛け算" )
            .name( "税込み価格" )
            .price( 980 )
            .tax( 1.1 )
            .calc( calc );

        System.out.println( "計算式 :" + item.getId() );

        item.display();

        item.execute();
      });
    };
  }

  @Override
public void display(){
    indi( name );
  }

  public void process( Interface inter ){
    indi( "start" );

    inter.execute();

    indi( "end" );
   }
}

