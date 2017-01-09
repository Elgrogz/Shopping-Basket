import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;


public class ItemTest {

  Item toothbrush;
  Item tinOfBeans;

  @Before
  public void before() {
    toothbrush = new Item("toothbrush", 2, false);
    tinOfBeans = new Item("tin of beans", 3, true);
  }

  @Test
  public void canGetName() {
    assertEquals("toothbrush", toothbrush.getName());
  }

  @Test
  public void canSetName() {
    tinOfBeans.setName("tin of peas");
    assertEquals("tin of peas", tinOfBeans.getName());
  }
  
  @Test
  public void canGetCost() {
    assertEquals(2, toothbrush.getCost());
  } 

  @Test
  public void canSetCost() {
    toothbrush.setCost(4);
    assertEquals(4, toothbrush.getCost());
  }

  @Test
  public void canHaveDiscount() {
    assertEquals(true, tinOfBeans.hasDiscount());
  }

  @Test
  public void canChangeDiscountStatus() {
    tinOfBeans.setDiscountStatus(false);
    toothbrush.setDiscountStatus(true);
    assertEquals(false, tinOfBeans.hasDiscount());
    assertEquals(true, toothbrush.hasDiscount());
  }

}