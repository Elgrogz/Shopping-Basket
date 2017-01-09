package shopping_basket;

public class Item {

  String name;
  int cost;
  boolean hasBogofDiscount;
  

  public Item(String name, int cost, boolean hasBogofDiscount){
    this.name = name;
    this.cost = cost;
    this.hasBogofDiscount = hasBogofDiscount;
  } 
}