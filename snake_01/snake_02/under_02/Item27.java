package under_02;

import demo_06.Interface;
import java.util.function.Consumer;

public class Item27 implements Interface
{
  public void execute(){
    indi( "Lambda" );

  }

  private String id;
  private String name;
  private double price;
  private double tax;
  private Calc27 calc;


  public Item27 id( String id ){ 
    this.id = id;
    return this;
  }

  public Item27 name( String name ){ 
    this.name = name;
    return this;
  }

  public Item27 price( double price ){ 
    this.price = price;
    return this;
  }

  public Item27 tax( double tax ){ 
    this.tax = tax;
    return this;
  }

  public Item27 calc( Calc27 calc ){ 
    this.calc = calc;
    return this;
  }

  public static void save( Consumer<Item27> con ){ 
    Item27 item = new Item27();
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

    
  }

  public static double calcTax( double price, double tax ){
    return( price * tax );
  }

  public String toString(){ 
    return( "Item27 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){ 
    System.out.println( s0 );
  }
}

