package main.java.snake.snake_03.middle_03;

import demo_06.Interface;

public class Calc13 extends Item13
{
  private String name;

  public Calc13( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() ->{
      Calc13 calc = new Calc13( "Poly-morphsm" );

      Item13.save( item -> {
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

