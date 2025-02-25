package under_02;

import demo_06.Interface;

public class Calc22 extends Item22
{
  private String name;

  public Calc22( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc22 calc = new Calc22( "Poly-morphism" );

      Item22.save( item -> {
        item.id( "掛け算" )
            .name( "税込み価格" )
            .price( 980 )
            .tax( 1.1 )
            .calc( calc );

        System.out.println( "計算式 :" + item.getId() );

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

