package under_01;

import java.util.function.Consumer;
import demo_06.Interface;

public class Item23 implements Interface
{
  @Override
public void execute(){ 
    indi( "Lambda" );

  }

  private String id;
  private String name;
  private double price;
  private double tax;
  private Calc23 calc;


  public Item23 id( String id ){ 
    this.id = id;
    return this;
  }

  public Item23 name( String name ){ 
    this.name = name;
    return this;
  }

  public Item23 price( double price ){ 
    this.price = price;
    return this;
  }

  public Item23 tax( double tax ){ 
    this.tax = tax;
    return this;
  }

  public Item23 calc( Calc23 calc ){ 
    this.calc = calc;
    return this;
  }

  public static void save( Consumer<Item23> con ){ 
    Item23 item = new Item23();
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
    return( "Item23 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){ 
    System.out.println( s0 );
  }
}

