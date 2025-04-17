package main.java.snake.snake_03.under_03;

import demo_06.Interface;

public class Calc21 extends Item21
{
  private String name;

  public Calc21( String name ){
    this.name = name;
  }

  @Override
public void display(){
    indi( name );
  }

  public static Interface create(){
    return() -> {
      Calc21 calc = new Calc21( "Poly-morphism" );

      Item21.save( item -> {
        item.id( "掛け算" )
            .name( "税込み価格" )
            .price( 980 )
            .tax( 1.1 )
            .calc( calc );

        System.out.println( "計算式 :" + item.getId() );

        item.display();
      });
    };
  }

  public void process( Interface inter ){
    indi( "start" );

    inter.execute();

    indi( "end" );
  }
}

