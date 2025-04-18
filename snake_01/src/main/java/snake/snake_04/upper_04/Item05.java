package main.java.snake.snake_04.upper_04;

/* private を付けないメンバー変数は コンストラクタで作成できるprivateを付けた場合はgetter/setter メソッドが必要 外部からアクセス出来なくなる為
*/
public class Item05
{
  private String id;
  private String name;
  private double price;
  private double tax;

/*コンストラクタの場合はこれでOK
  public Item05( String id, String name, double price, double tax ){
    this.id = id;
    this.name = name;
    this.price = price;
    this.tax = tax;

  }
  public Item05(){

  }
*/

  public void setId( String id ){
    this.id = id;/*private を付けた場合は上からコピペ*/
  }

  public void setName( String name ){
    this.name = name;
  }

  public void setPrice( double price ){
    this.price = price;
  }

  public void setTax( double tax ){
    this.tax = tax;
  }

  public static void save( ){
    indi( "save :" );
  }




  public String toString(){
    return( "Item05 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
