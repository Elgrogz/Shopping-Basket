import static org.junit.Assert.*;
import org.junit.*;
import shopping_basket.*;


public class ItemTest {

  Toothbrush toothbrush;
  TinOfBeans tinOfBeans;

  @Before
  public void before() {
    toothbrush = new Toothbrush();
    tinOfBeans = new TinOfBeans();
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
    assertEquals(false, toothbrush.hasDiscount());
  }

  @Test
  public void canChangeDiscountStatus() {
    tinOfBeans.setDiscountStatus(false);
    toothbrush.setDiscountStatus(true);
    assertEquals(false, tinOfBeans.hasDiscount());
    assertEquals(true, toothbrush.hasDiscount());
  }

}