import java.util.ArrayList;
import java.util.List;

public class Squad {
  private String mSquadName;
  private String mCause;
  private int mMax;
  private static List<Squad> instances = new ArrayList<Squad>();
  private int mId;
  private List<Hero> mHeroes;

  public Squad(String squadName, String cause) {
    mSquadName = squadName;
    mCause = cause;
    mMax = 2;
    mId = instances.size();
    instances.add(this);
    mHeroes = new ArrayList<Hero>();
  }

  public String getSquadName() {
    return mSquadName;
  }

  public String getCause() {
    return mCause;
  }

  public int getId() {
    return mId;
  }

  public int getMax() {
    return mMax;
  }

  public boolean maxCheck() {
    return mMax == mHeroes.size();
  }

  public List<Hero> getHeroes() {
    return mHeroes;
  }

  public static void clear() {
    instances.clear();
  }

  public static List<Squad> all() {
    return instances;
  }

  public static Squad find(int id) {
    try {
      return instances.get(id);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }

  public void addHero(Hero hero) {
    mHeroes.add(hero);
  }

}
