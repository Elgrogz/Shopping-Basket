import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;


public class BasketTest {

  Item toothbrush;
  Item tinOfBeans;
  Basket basket;

  @Before
  public void before() {
    toothbrush = new Item("toothbrush", 2, false);
    tinOfBeans = new Item("tin of beans", 3, true);
    basket = new Basket();
  }

  @Test
  public void canGetItemCount() {
    assertEquals(0, basket.getItemCount());
  }

  @Test
  public void canAddItems() {
    
  } 

  @Test
  public void canRemoveOneItem() {
    
  }

  @Test
  public void canRemoveAllItems() {
    
  }

  @Test
  public void canApplyBogofDiscount() {
    
  }

  @Test
  public void canCalculateTotalCostOfBasket() {
    
  }

}