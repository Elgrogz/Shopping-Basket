package shopping_basket;

public abstract class Item {

  String name;
  double cost;
  boolean hasBogofDiscount;
  

  public Item() {
    this.name = name;
    this.cost = cost;
    this.hasBogofDiscount = hasBogofDiscount;
  } 

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCost() {
    return this.cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public boolean hasDiscount() {
    return this.hasBogofDiscount;
  }

  public void setDiscountStatus(boolean discount) {
    this.hasBogofDiscount = discount;
  }
}