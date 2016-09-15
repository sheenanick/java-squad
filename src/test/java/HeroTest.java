import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  @After
  public void tearDown() {
    Hero.clear();
  }

  @Test
  public void Hero_instantiatesCorrectly_true() {
    Hero myHero = new Hero("Superman", 35, "Man of steel", "Kryptonite");
    assertEquals(true, myHero instanceof Hero);
  }

  @Test
  public void Hero_getName_superman() {
    Hero myHero = new Hero("Superman", 35, "Man of steel", "Kryptonite");
    assertEquals("Superman", myHero.getName());
  }

  @Test
  public void Hero_getAge_35() {
    Hero myHero = new Hero("Superman", 35, "Man of steel", "Kryptonite");
    assertEquals(35, myHero.getAge());
  }

  @Test
  public void Hero_getPower_Manofsteel() {
    Hero myHero = new Hero("Superman", 35, "Man of steel", "Kryptonite");
    assertEquals("Man of steel", myHero.getPower());
  }

  @Test
  public void Hero_getWeakness_Kryptonite() {
    Hero myHero = new Hero("Superman", 35, "Man of steel", "Kryptonite");
    assertEquals("Kryptonite", myHero.getWeakness());
  }

  @Test
  public void Hero_getId_0() {
    Hero myHero = new Hero("Superman", 35, "Man of steel", "Kryptonite");
    assertEquals(0, myHero.getId());
  }

}
