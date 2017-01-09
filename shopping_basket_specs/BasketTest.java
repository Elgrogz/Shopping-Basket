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
    assertEquals(0, basket.getTotalItemCount());
  }

  @Test
  public void canAddItems() {
    basket.addItemToBasket(toothbrush);
    basket.addItemToBasket(tinOfBeans);
    assertEquals(2, basket.getTotalItemCount());
  } 

  @Test
  public void canRemoveOneItem() {
    basket.addItemToBasket(toothbrush);
    basket.addItemToBasket(tinOfBeans);
    assertEquals(2, basket.getTotalItemCount());
    basket.removeOneItemFromBasket(toothbrush);
    assertEquals(1, basket.getTotalItemCount());
  }

  @Test
  public void canRemoveAllItems() {
    basket.addItemToBasket(toothbrush);
    basket.addItemToBasket(tinOfBeans);
    basket.removeAllItemsFromBasket();
    assertEquals(0, basket.getTotalItemCount());
  }

  // @Test
  // public void canApplyBogofDiscount() {
  //   basket.addItemToBasket(toothbrush);
  //   basket.addItemToBasket(tinOfBeans);
  //   basket.addItemToBasket(tinOfBeans);
  //   assertEquals(2, basket.getValueOfBogofDiscount());
  // }

  @Test
  public void canCalculateTotalCostOfBasket() {
    
  }

}