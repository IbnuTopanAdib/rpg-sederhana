package com.panto.rpg.helper;

public class DamageResult {
  private int damage;
  private boolean isCritical;
  private boolean isMissed; 
  private boolean isDodge;
  private boolean isBlocked;
  private boolean isParried;

  public DamageResult(int damage, boolean isCritical, boolean isMissed, boolean isDodge, boolean isBlocked, boolean isParried) {
    this.damage = damage;
    this.isCritical = isCritical;
    this.isMissed = isMissed;
    this.isDodge = isDodge;
    this.isBlocked = isBlocked;
    this.isParried = isParried;
  }
}
