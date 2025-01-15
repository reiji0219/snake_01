package snake_01;

import demo_06.Interface;

public class Calc07 extends Item07
{
  private String name;

  public Calc07( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
     Calc07 calc = new Calc07( "Poly-morphism" );

     Item07.save( item -> {
       item.id( "掛け算" )
           .name( "税込み価格" )
           .price( 980 )
           .tax( 1.1 )
           .calc( calc ); 

       System.out.println( "計算式 :" + item.getId());

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

