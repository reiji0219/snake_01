package upper_03;

import demo_06.Interface;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class Item10 implements Interface
{


  private String id;
  private String name;
  private double price;
  private double tax;
  private Calc10 calc;


  public Item10 id( String id ){
    this.id = id;
    return this;
  }

  public Item10 name( String name ){
    this.name = name;
    return this;
  }

  public Item10 price( double price ){
    this.price = price;
    return this;
  }

  public Item10 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public Item10 calc( Calc10 calc ){
    this.calc = calc;
    return this;
  }

  public static void save( Consumer<Item10> con ){
    Item10 item = new Item10();
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
public void execute(){
    indi( "Lambda" );

    ArrayList<String> animals = new ArrayList<String>( Arrays.asList( "Dog" ) );

    ArrayList<String> animal = new ArrayList<String>();
      animal.add( "Cat" );
      animal.add( "Elephant" );
      animal.add( "Phoenix" );

      animals.addAll( animal );

    String getAnimal = animals.get( 3 );
      indi( getAnimal );

      animals.set( 3, "Penguin");

      animals.remove( 2 );
      animals.add( 2, "Lion" );


    Comparator<String> compa = new Comparator<String>(){
      @Override
	public int compare( String o1, String o2 ){
        return( o2.compareTo( o1 ) );
      }
    };

    Collections.sort( animals, compa );

    Iterator<String> itera = animals.iterator();
      while( itera.hasNext() ){
        String hoge = itera.next();
          System.out.print( hoge + " " );
    }

    indi( "" );


    ArrayList<Integer> seq = new ArrayList<Integer>();

    for( int i = 0; i < 5; i++ ){
      int number = new java.util.Random().nextInt( 4 ) + 1;
        seq.add( number );
    }

    for( int i : seq ){
      char[] base = { ' ', 'A', 'G', 'T', 'C' };
        System.out.print( base[ i ] );
    }

    indi( "" );

    int num = new java.util.Random().nextInt( 10 ) + 1;

    String str = ( ( num % 2 ) == 0 )? ( ( num % 3 ) == 0 )?
                      "true/true" : "true/false"
                :( ( num % 3 ) == 0 )?
                      "false/true" : "false/false";

      indi( num + " " + str );

  }

  @Override
public String toString(){
    return( "Item10 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}

