package middle_02;

import demo_06.Interface;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Item13_3 implements Interface
{

  private String id;
  private String name;
  private double price;
  private double tax;
  private Calc13_3 calc;


  public Item13_3 id( String id ){
    this.id = id;
    return this;
  }

  public Item13_3 name( String name ){
    this.name = name;
    return this;
  }

  public Item13_3 price( double price ){
    this.price = price;
    return this;
  }

  public Item13_3 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public Item13_3 calc( Calc13_3 calc ){
    this.calc = calc;
    return this;
  }

  public static void save( Consumer<Item13_3> con ){
    Item13_3 item = new Item13_3();
    con.accept( item );
    indi( "save" + item );
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

  @Override
public void execute(){
    indi( "Lambda" );

    indi( "ArrayList" );

    ArrayList<String> animals = new ArrayList<String>( Arrays.asList( "Dog" ));

    ArrayList<String> animal = new ArrayList<String>();
      animal.add( "Cat" );
      animal.add( "Elephant" );
      animal.add( "phoenix" );

      animals.addAll( animal );

      String getAnimal = animals.get( 3 );
        indi( getAnimal );

      animals.set( 3, "Penguin" );

      animals.remove( 2 );
      animals.add( 2, "LIon" );




    Collections.sort( animals );

    Iterator<String> itera = animals.iterator();
    while( itera.hasNext()){
      String hoge = itera.next();
        indi( hoge );
    }

  }

  public static double calcTax( double price, double tax ){
    return( price * tax );
  }

  @Override
public String toString(){
    return( "Item13_3 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}

