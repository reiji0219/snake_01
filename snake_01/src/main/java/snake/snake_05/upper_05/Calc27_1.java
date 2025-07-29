package main.java.snake.snake_05.upper_05;

import demo_06.Interface;

public class Calc27_1 extends Item27_1
{
  private String name;

  public Calc27_1( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc27_1 calc = new Calc27_1( "Poly-morphism" );

      Item27_1.save( item -> {
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
