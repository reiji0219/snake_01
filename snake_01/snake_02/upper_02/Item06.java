package upper_02;

import demo_06.Interface;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Item06 implements Interface
{

  private String id;
  private String name;
  private double price;
  private double tax;
  private Calc06 calc;


  public Item06 id( String id ){
    this.id = id;
    return this;
  }

  public Item06 name( String name ){
    this.name = name;
    return this;
  }

  public Item06 price( double price ){
    this.price = price;
    return this;
  }

  public Item06 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public Item06 calc( Calc06 calc ){
    this.calc = calc;
    return this;
  }

  public static void save( Consumer<Item06> con ){
    Item06 item = new Item06();
    con.accept( item );
    indi( "save" + item );
  }

  public String getId(){
    return id;
  }

  @Override
public void execute(){
    indi( "Lambda" );

    indi( "ArrayList" );

    ArrayList<String> animals = new ArrayList<String>( Arrays.asList( "Dog" ));

    ArrayList<String> animal = new ArrayList<String>();
      animal.add( "Cat" );
      animal.add( "Elephant" );
      animal.add( "Phoenix" );

    animals.addAll( animal );

    String getAnimals = animals.get( 3 );
      indi( getAnimals );

      animals.set( 3, "Penguin" );

      animals.remove( 2 );

      animals.add( 2, "Lion" );

    Comparator<String> compa = new Comparator<String>(){
      @Override
	public int compare( String o1, String o2 ){
        return( o2.compareTo( o1 ));
      }
    };

    Collections.sort( animals, compa );

    Iterator<String> itera = animals.iterator();
    while( itera.hasNext() ){
      String hoge = itera.next();
        indi( hoge );
    }

    ArrayList<Integer> seq = new ArrayList<Integer>();

    for( int i = 0; i < 5; i++ ){
      int number = new java.util.Random().nextInt( 4 ) + 1;
        seq.add( number );
    }

    for( int i : seq ){
      char[] base = {' ', 'A', 'G', 'T', 'C', };
        System.out.print( base[ i ] );
    }
    indi( " " );

    int num = new java.util.Random().nextInt( 10 ) + 1;

    String str = ( ( num % 2 ) == 0 )? ( ( num % 2 ) == 0 )?
                      "true/true" : "true/false"
                :( ( num % 2 ) == 0 )?
                      "false/true" : "false/false";

      indi( num + " " + str );
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
    return( "Item06 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}