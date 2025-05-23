package main.java.snake.snake_03.under_03;

import java.util.function.Consumer;

import demo_06.Interface;

public class Item20 implements Interface
{
  @Override
public void execute(){
    indi( "Lambda" );

  }

  private String id;
  private String name;
  private double price;
  private double tax;
  private Calc20 calc;


  public Item20 id( String id ){
    this.id = id;
    return this;
  }

  public Item20 name( String name ){
    this.name = name;
    return this;
  }

  public Item20 price( double price ){
    this.price = price;
    return this;
  }

  public Item20 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public Item20 calc( Calc20 calc ){
    this.calc = calc;
    return this;
  }

  public static void save( Consumer<Item20> con ){
    Item20 item = new Item20();
    con.accept( item );
    indi( "save :" + item );
  }

  public String getId(){
    return id;
  }

  public void display(){
    indi( "表示内容 :" + name );

    double clacIntax = clactax( price, tax );
      indi( "税込み価格は" + clacIntax + "円です" );

    calc.display();
  }

  public static double clactax( double price, double tax ){
    return( price * tax );
  }

  @Override
public String toString(){
    return( "Item20 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" +  tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}

