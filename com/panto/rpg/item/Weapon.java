package com.ibnu.rpg.item;

public class Weapon {
  private String name;
  private int baseDamage;

  public Weapon(String name, int baseDamage) {
    this.name = name;
    this.baseDamage = baseDamage;
  }

  public String getName() {
    return name;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

}
