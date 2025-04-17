package main.java.snake.snake_03.upper_03;

import  demo_06.Interface;

public class Calc03_1 extends Item03_1
{
  private String name;

  public Calc03_1( String name ){
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc03_1 calc = new Calc03_1( "Poly-morphism" );

      Item03_1.save( item -> {
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

