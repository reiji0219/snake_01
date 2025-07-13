package main.java.snake.snake_05.upper_05;

import demo_06.Interface;

public class Calc11 extends Item11
{
  private String name;

  public Calc11( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc11 calc = new Calc11( "Poly-morphism" );

      Item11.save( item -> {
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

