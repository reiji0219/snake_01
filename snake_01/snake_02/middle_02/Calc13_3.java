package middle_02;

import demo_06.Interface;

public class Calc13_3 extends Item13_3
{
  private String name;

  public Calc13_3( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc13_3 calc = new Calc13_3( "Poly-morphism" );

      Item13_3.save( item -> {
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

