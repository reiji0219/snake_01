package main.java.snake.snake_05.upper_05;

import demo_06.Interface;

public class Calc10 extends Item10
{
  private String name;

  public Calc10( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc10 calc = new Calc10( "Poly-morohism" );

      Item10.save( item -> {
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

