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
    basket = new Basket();
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

  // @Test
  // public void canSetLoyaltyCardStatus() {
  //   customer.setFunds(50);
  //   assertEquals(50, customer.getFunds());
  // }

  @Test
  public void canDeductFunds() {
    
  } 

  @Test
  public void canHaveDiscountCard() {
    
  } 

  @Test
  public void canCalculateLoyaltyCardDiscount() {
    
  } 

}