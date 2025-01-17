package snake_01;

import demo_06.Interface;

public class Calc17 extends Item17
{ 
  private String name;

  public Calc17( String name ){ 
    super();
    this.name = name;
  }

  public static Interface create(){ 
    return() -> { 
      Calc17 calc = new Calc17( "Poly-morphism" );

      Item17.save( item -> { 
        item.id( "掛け算" )
            .name( "税込み価格は" )
            .price( 980 )
            .tax( 1.1 )
            .calc( calc );

        System.out.println( "Hello World_3" );

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

