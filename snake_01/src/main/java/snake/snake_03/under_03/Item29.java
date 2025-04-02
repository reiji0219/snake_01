package main.java.snake.snake_03.under_03;

import demo_06.Interface;
import java.util.function.Consumer;

public class Item29 implements Interface
{
  @Override
public void execute(){
    indi( "Lambda" );

  }
  private String id;
  private String name;
  private double price;
  private double tax;
  private Calc29 calc;


  public Item29 id( String id ){
    this.id = id;
    return this;
  }

  public Item29 name( String name ){
    this.name = name;
    return this;
  }

  public Item29 price( double price ){
    this.price = price;
    return this;
  }

  public Item29 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public Item29 calc( Calc29 calc ){
    this.calc = calc;
    return this;
  }

  public static void save( Consumer<Item29> con ){
    Item29 item = new Item29();
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
    return( "Item29 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
