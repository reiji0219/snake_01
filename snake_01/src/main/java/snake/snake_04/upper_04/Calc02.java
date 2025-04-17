package main.java.snake.snake_04.upper_04;

import demo_06.Interface;

public class Calc02 extends Item02
{
  private String name;

  public Calc02( String name ){
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc02 calc = new Calc02( "Poly-morphism" );

      Item02.save( item -> {
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

