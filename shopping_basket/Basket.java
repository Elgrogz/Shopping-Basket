package shopping_basket;
import java.util.*;

public class Basket {

  ArrayList<Item> items;
  int totalValue;
  

  public Basket(){
    this.items = new ArrayList<>();
    this.totalValue = 0;
  } 
}