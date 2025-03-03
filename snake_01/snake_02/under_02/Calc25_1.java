package under_02;

import demo_06.Interface;

public class Calc25_1 extends Item25_1
{
  private String name;

  public Calc25_1( String name ){
    super();
    this.name = name;
  }

  @Override
public void display(){
    indi( name );
  }

  public static Interface create(){
    return() -> {
      Calc25_1 calc = new Calc25_1( "Poly-morphism" );

      Item25_1.save( item -> {
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

  public void process( Interface inter ){
    indi( "start" );

    inter.execute();

    indi( "end" );

  }
}

