package main.java.snake.snake_04.upper_04;

import java.util.function.Consumer;

public class Item17
{
	private String id;
	private String name;
	private double price;
	private double tax;
	
	
	public Item17 id( String id ) {
		this.id = id;
		return this;
	}
	
	public Item17 name( String name ) {
		this.name = name;
		return this;
	}
	
	public Item17 price( double price ) {
		this.price = price;
		return this;
	}
	
	public Item17 tax( double tax ) {
		this.tax = tax;
		return this;
	}
	
	public static void save( Consumer<Item17> con ) {
		Item17 item = new Item17();
		con.accept( item );
		indi( "save :" + item );
	}
	
	
	
	
	@Override
	public String toString() {
		return "Item17 [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}
	
	public static void indi( String s0 ) {
		System.out.println( s0 );
	}
	
}
