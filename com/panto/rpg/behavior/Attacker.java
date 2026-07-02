package com.ibnu.rpg.behavior;

import com.ibnu.rpg.helper.*;

public interface Attacker {
  DamageResult attack(Damageable target, int damage);
  
}
