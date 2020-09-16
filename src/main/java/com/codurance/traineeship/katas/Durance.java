package com.codurance.traineeship.katas;

import java.util.Optional;

public class Durance {

    public static final String weaponDescription =
            "Dagger of the Nooblet\n" +
                    " 5 - 10 attack damage\n" +
                    " 1.2 attack speed";
    private final Optional<Enchantment> enchantment;
    private final Dice dice;

    public Durance(Enchantment enchantment, Dice dice) {

        this.enchantment = Optional.ofNullable(enchantment);
        this.dice = dice;
    }

    public Durance(Dice dice) {
        this.dice = dice;
        this.enchantment = Optional.empty();
    }

    public String describeWeapon() {
        return enchantment
                .map(this::describe)
                .orElse(weaponDescription);
    }

    private String describe(Enchantment enchant) {
        return enchant.enchantPrefix + " " +
                weaponDescription + "\n " +
                enchant.enchantAttribute;
    }

    public Durance enchantWeapon() {
        if (dice.throwDice(Dices.TEN) == 1)
            return new Durance(dice);
        return new Durance(
                new Enchantment(
                        "Quick",
                        "+5 agility"),
                dice);
    }

}
