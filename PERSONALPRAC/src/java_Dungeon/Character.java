package java_Dungeon;

public abstract class Character {
  private String name;
  private int hp;
  private int level;
  abstract void attack();
  abstract void takeDamage();
}
