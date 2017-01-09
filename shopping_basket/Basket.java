package shopping_basket;
import java.util.*;

public class Basket {

  ArrayList<Item> items;
  int totalValue;
  

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

  public void getValueOfBogofDiscount() {
    HashMap<Item, Integer> bogofItems = new HashMap<>();
    for (Item item : items) {
      if (!bogofItems.containsKey(item) && item.hasDiscount()) {
        bogofItems.put(item, 1);
      }
      else {
        bogofItems.put(item, bogofItems.get(item) + 1);
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

    }


    
  }

  public void getBasketValue() {

  }

}