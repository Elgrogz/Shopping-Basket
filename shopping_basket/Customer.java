package shopping_basket;

public class Customer {

  String name;
  int funds;
  boolean hasLoyaltyCard;
  Basket basket;

  public Customer(String name, int funds, boolean hasLoyaltyCard){
    this.name = name;
    this.funds = funds;
    this.hasLoyaltyCard = hasLoyaltyCard;
    this.basket = new Basket();
  } 
}