package com.codurance.traineeship.katas;

public class Durance {

    public String weaponDescription = "Dagger of the Nooblet\n 5 - 10 attack damage\n 1.2 attack speed";

    public String describeWeapon() {
        return weaponDescription;


    }

    public void enchantWeapon() {
        weaponDescription = "Quick Dagger of the Nooblet\n" +
                " 5 - 10 attack damage\n" +
                " 1.2 attack speed\n" +
                " +5 agility";
    }
}
