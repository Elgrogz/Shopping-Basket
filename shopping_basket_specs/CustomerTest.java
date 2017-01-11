import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;


public class CustomerTest {

  Toothbrush toothbrush;
  TinOfBeans tinOfBeans;
  Basket basket;
  Customer customer;

  @Before
  public void before() {
    toothbrush = new Toothbrush();
    tinOfBeans = new TinOfBeans();
    customer = new Customer("El Grogz", true);
  }
  
  @Test
  public void canGetName() {
    assertEquals("El Grogz", customer.getName());
  } 

  @Test
  public void canSetName() {
    customer.setName("Jim");
    assertEquals("Jim", customer.getName());
  } 

  @Test
  public void canGetFunds() {
    assertEquals(100, customer.getFunds());
  } 

  @Test
  public void canSetFunds() {
    customer.setFunds(50);
    assertEquals(50, customer.getFunds());
  }

  @Test
  public void canGetLoyaltyCardStatus() {
    assertEquals(true, customer.getLoyaltyCardStatus());
  } 

  @Test
  public void canSetLoyaltyCardStatus() {
    customer.setLoyaltyCardStatus(false);
    assertEquals(false, customer.getLoyaltyCardStatus());
  }

  @Test
  public void canAddToBasket() {
    customer.addItemToBasket(toothbrush);
    customer.addItemToBasket(tinOfBeans);
    assertEquals(2, customer.getItemCountInBasket());
  }

  @Test
  public void canCheckout() {
    customer.addItemToBasket(toothbrush);
    customer.addItemToBasket(tinOfBeans);
    customer.checkout();
    assertEquals(95, customer.getFunds());
    assertEquals(0, customer.getItemCountInBasket());
  } 
}