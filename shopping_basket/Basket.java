package shopping_basket;
import java.util.*;

public class Basket {

  ArrayList<Item> items;
  int totalValue;
  

  public Basket(){
    this.items = new ArrayList<Item>();
    this.totalValue = 0;
  } 

  public ArrayList<Item> getItems() {
    return this.items;
  }

  public int getItemCount() {
    return items.size();
  }
}