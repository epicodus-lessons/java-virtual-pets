import java.util.Timer;

public class FireMonster extends Monster {
  private int fireLevel;
  public static final int MAX_FIRE_LEVEL = 10;

  public Monster(String name, int personId) {
    this.name = name;
    this.personId = personId;
    playLevel = MAX_PLAY_LEVEL / 2;
    sleepLevel = MAX_SLEEP_LEVEL / 2;
    foodLevel = MAX_FOOD_LEVEL / 2;
    timer = new Timer();
  }

}
