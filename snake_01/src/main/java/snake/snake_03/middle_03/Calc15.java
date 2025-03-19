package main.java.snake.snake_03.middle_03;

import demo_06.Interface;

public class Calc15 extends Item15
{
  private String name;

  public Calc15( String name ){
    super();
    this.name = name;
  }

  @Override
public void display(){
    indi( name );
  }

  public static Interface create(){
    return() -> {
      Calc15 calc = new Calc15( "Poly-morphism" );

      Item15.save( item -> {
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

