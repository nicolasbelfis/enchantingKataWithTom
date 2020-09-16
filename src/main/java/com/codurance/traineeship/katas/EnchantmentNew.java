package com.codurance.traineeship.katas;

public enum EnchantmentNew {
  AGILITY("Quick", "+5 agility"),
  STRENGTH("Angry", "+5 strength"),
  ICE("Icy", "+5 ice damage"),
  FIRE("Inferno", "+5 fire damage"),
  LIFE_STEAL("Vampire", "+5 life steal");

  String prefix;
  String attributes;

  EnchantmentNew(String prefix, String attributes) {
    this.prefix = prefix;
    this.attributes = attributes;
  }
}
