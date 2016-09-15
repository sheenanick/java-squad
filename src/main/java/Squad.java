import java.util.ArrayList;
import java.util.List;

public class Squad {
  private String mSquadName;
  private String mCause;
  private static List<Squad> instances = new ArrayList<Squad>();
  private int mId;
  private List<Hero> mHeros;

  public Squad(String squadName, String cause) {
    mSquadName = squadName;
    mCause = cause;
    mId = instances.size();
    instances.add(this);
    mHeros = new ArrayList<Hero>();
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

}
