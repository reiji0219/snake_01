package middle_01;

import demo_06.Interface;

public class Calc12 extends Item12
{
  private String name;

  public Calc12( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc12 calc = new Calc12( "Poly-morphism" );

      Item12.save( item -> { 
        item.id( "掛け算" )
            .name( "税込み価格" )
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

