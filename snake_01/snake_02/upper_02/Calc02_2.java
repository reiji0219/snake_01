package upper_02;

import demo_06.Interface;

public class Calc02_2 extends Item02_2
{
  private String name;

  public Calc02_2( String name ){
    super();
    this.name = name;
  }

  public static Interface cteate(){
    return() -> {
     Calc02_2 calc = new Calc02_2( "Poly-morphism" );

     Item02_2.save( item -> {
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

