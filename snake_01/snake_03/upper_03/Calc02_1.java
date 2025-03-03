package upper_03;

import demo_06.Interface;

public class Calc02_1 extends Item02_1
{
  private String name;

  public Calc02_1( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc02_1 calc = new Calc02_1( "Poly-morphism" );

      Item02_1.save( item -> {
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

