package shopping_basket;
import java.util.*;

public class Basket {

  ArrayList<Item> items;
  double totalValue;
  

  public Basket(){
    this.items = new ArrayList<>();
    this.totalValue = 0;
  } 

  public ArrayList<Item> getItems() {
    return this.items;
  }

  public int getTotalItemCount() {
    return items.size();
  }

  public int getSpecificItemCount(Item itemToFind) {
    int count = 0;
    for (Item item : items) {
      if (item.equals(itemToFind)) {
        count += 1;
      }
    }
    return count;
  }

  public void addItemToBasket(Item item) {
    items.add(item);
  }

//removes first occurence of object in array (if any present)
  public void removeOneItemFromBasket(Item item) {
    items.remove(item);
  }

  public void removeAllItemsFromBasket() {
    items.clear();
  }

  public double getValueOfBogofDiscount() {
    double amountDeducted = 0;

    HashMap<Item, Integer> bogofItems = new HashMap<Item, Integer>();
    for (Item item : items) {
      if (item.hasDiscount()) {
        if (!bogofItems.containsKey(item)){
          bogofItems.put(item, 1);
        } else {
          Integer newNumber = (Integer)bogofItems.get(item);
          bogofItems.put(item, newNumber + 1);
        }
      }
    }

    for (Item key : bogofItems.keySet()) {
      if (bogofItems.get(key) < 2) {
        bogofItems.remove(key);
      }
    }

    for (Item key : bogofItems.keySet()) {
      if (bogofItems.get(key) % 2 == 1) {
        bogofItems.put(key, bogofItems.get(key) - 1);
      }
    }
    
    for (Item key : bogofItems.keySet()) {
      amountDeducted += ((key.getCost() / 2) * bogofItems.get(key)); 
    }
    return amountDeducted;
  }

  public double getBasketTotalValue() {
    double totalValue = 0;
    for (Item item : items) {
      totalValue += item.getCost();
    }

    totalValue -= getValueOfBogofDiscount();
    return totalValue;
  }

}