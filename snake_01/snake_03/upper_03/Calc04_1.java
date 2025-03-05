package upper_03;

import demo_06.Interface;

public class Calc04_1 extends Item04_1
{
  private String name;

  public Calc04_1( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc04_1 calc = new Calc04_1( "Poly-morphism" );

      Item04_1.save( item -> {
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

