import java.util.ArrayList;
import java.util.List;

public class Hero {
  private String mName;
  private int mAge;
  private String mPower;
  private String mWeakness;
  private int mAttack;
  private int mDefense;
  private int mHealth;
  private static List<Hero> instances = new ArrayList<Hero>();
  private int mId;

  public Hero(String name, int age, String power, String weakness) {
    mName = name;
    mAge = age;
    mPower = power;
    mWeakness = weakness;
    mAttack = 0;
    mDefense = 0;
    mHealth = 25;
    mId = instances.size();
    instances.add(this);
  }

  public void fightStats () {
    if (mPower.equals("flying")) {
      mAttack += 2;
      mDefense += 3;
    } else if (mPower.equals("psychic")) {
      mAttack += 4;
      mDefense += 1;
    } else if (mPower.equals("healing")) {
      mDefense += 5;
    } else if (mPower.equals("laser")) {
      mAttack += 5;
    }
  }

  public String getPic () {

    if (mWeakness.equals("kryptonite") && mPower.equals("flying")) {
      return "../images/superman.jpg";
    } else if (mPower.equals("flying")) {
      return "../images/1.jpg";
    } else if (mPower.equals("healing")){
      return "../images/2.jpg";
    } else if (mPower.equals("laser")) {
      return "../images/cyclops.jpg";
    } else if (mWeakness.equals("hisSon")) {
      return "../images/darth.jpg";
    } else if (mWeakness.equals("dehydration")) {
      return "../images/aquaman.jpg";
    } else {
      return "../images/greenlantern.jpg";
    }
  }

  public String getName() {
    return mName;
  }

  public int getAge() {
    return mAge;
  }

  public String getPower() {
    return mPower;
  }

  public String getWeakness() {
    return mWeakness;
  }

  public int getId() {
    return mId;
  }

  public int getAttack() {
    return mAttack;
  }

  public int getDefense() {
    return mDefense;
  }

  public int getHealth() {
    return mHealth;
  }

  public static void clear() {
    instances.clear();
  }

  public static List<Hero> all() {
    return instances;
  }

  public static Hero find(int id) {
    try {
      return instances.get(id);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }
}
