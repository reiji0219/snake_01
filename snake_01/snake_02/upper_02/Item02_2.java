package upper_02;

import demo_06.Interface;
import java.util.function.Consumer;

public class Item02_2 implements Interface
{
  @Override
public void execute(){
    indi( "Lambda" );

  }

  private String id;
  private String name;
  private double price;
  private double tax;
  private Calc02_2 calc;


  public Item02_2 id( String id ){
    this.id = id;
    return this;
  }

  public Item02_2 name( String name ){
    this.name = name;
    return this;
  }

  public Item02_2 price( double price ){
    this.price = price;
    return this;
  }

  public Item02_2 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public Item02_2 calc( Calc02_2 calc ){
    this.calc = calc;
    return this;
  }

  public static void save( Consumer<Item02_2> con ){
    Item02_2 item = new Item02_2();
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

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
 }

