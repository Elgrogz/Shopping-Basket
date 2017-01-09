package shopping_basket;

public class Customer {

  String name;
  int funds;
  boolean hasLoyaltyCard;

  public Customer(String name, int funds, boolean hasLoyaltyCard){
    this.name = name;
    this.funds = funds;
    this.hasLoyaltyCard = hasLoyaltyCard;
  } 
}