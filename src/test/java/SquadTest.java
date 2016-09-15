import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

  @After
  public void tearDown() {
    Squad.clear();
  }

  @Test
  public void Squad_instantiatesCorrectly_true() {
    Squad mySquad = new Squad("Blue", "Fight Cancer");
    assertEquals(true, mySquad instanceof Squad);
  }

  @Test
  public void Squad_getName_superman() {
    Squad mySquad = new Squad("Blue", "Fight Cancer");
    assertEquals("Blue", mySquad.getSquadName());
  }

  @Test
  public void Squad_getAge_35() {
    Squad mySquad = new Squad("Blue", "Fight Cancer");
    assertEquals("Fight Cancer", mySquad.getCause());
  }

  @Test
  public void Squad_getId_0() {
    Squad mySquad = new Squad("Blue", "Fight Cancer");
    assertEquals(0, mySquad.getId());
  }

}
