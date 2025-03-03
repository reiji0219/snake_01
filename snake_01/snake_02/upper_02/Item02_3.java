package upper_02;

import demo_06.Interface;
import java.util.function.Consumer;

public class Item02_3 implements Interface
{
  @Override
public void execute(){ 
    indi( "Lambda" );

  }

  private String id;
  private String name;
  private double price;
  private double tax;
  private Calc02_3 calc;


  public Item02_3 id( String id ){
    this.id = id;
    return this;
  }

  public Item02_3 name( String name ){
    this.name = name;
    return this;
  }

  public Item02_3 price( double price ){
    this.price = price;
    return this;
  }

  public Item02_3 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public Item02_3 calc( Calc02_3 calc ){
    this.calc = calc;
    return this;
  }

  public static void save( Consumer<Item02_3> con ){
    Item02_3 item = new Item02_3();
    con.accept( item );
    indi( "save :" + item );
  }

  public String getId(){ 
    return id;
  }

  public void display(){ 
    indi( "表示内容 :" + name );

    double calcInTax = calcTax( price, tax );
      indi( "税込み価格は" + calcInTax + "円です" );

    calc.display();
  }

  public static double calcTax( double price, double tax ){ 
    return( price * tax );
  }

  @Override
public String toString(){ 
    return( "Item02_3 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){ 
    System.out.println( s0 );
  }
}

