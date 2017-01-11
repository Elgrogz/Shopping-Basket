package shopping_basket;

public class Customer {

  String name;
  int funds;
  boolean hasLoyaltyCard;
  Basket basket;

  public Customer(String name, boolean hasLoyaltyCard){
    this.name = name;
    this.funds = 100;
    this.hasLoyaltyCard = hasLoyaltyCard;
    basket = new Basket();
  } 

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getFunds() {
    return this.funds;
  }

  public void setFunds(int funds) {
    this.funds = funds;
  }

  public boolean getLoyaltyCardStatus() {
    return this.hasLoyaltyCard;
  }

  public void setLoyaltyCardStatus(boolean hasLoyaltyCard) {
    this.hasLoyaltyCard = hasLoyaltyCard;
  }

  public void addItemToBasket(Item item) {
    basket.addItemToBasket(item);
  }

  public int getItemCountInBasket() {
    return basket.getTotalItemCount();
  }

  // public void checkout() {
  //   this.funds - 
  // }
}