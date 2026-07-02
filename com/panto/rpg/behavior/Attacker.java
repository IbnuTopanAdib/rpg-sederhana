package com.panto.rpg.behavior;

import com.panto.rpg.helper.*;

public interface Attacker {
  DamageResult attack(Damageable target, int damage);
  
}
