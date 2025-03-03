package under_01;

import demo_06.Interface;

public class Calc24 extends Item24
{
  private String name;

  public Calc24( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc24 calc = new Calc24( "Poly-morphism" );

      Item24.save( item -> {
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

