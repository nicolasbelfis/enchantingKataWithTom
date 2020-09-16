package com.codurance.traineeship.katas;

import java.util.Optional;

public class Durance {

    public static final String weaponDescription =
            "Dagger of the Nooblet\n" +
                    " 5 - 10 attack damage\n" +
                    " 1.2 attack speed";
    private final Optional<Enchantment> enchantment;
    private final Dice dice;
    private final MagicBook magicBook;

    public Durance(Enchantment enchantment, Dice dice, MagicBook
        magicBook) {

        this.enchantment = Optional.ofNullable(enchantment);
        this.dice = dice;
        this.magicBook = magicBook;
    }

    public Durance(Dice dice, MagicBook magicBook) {
        this.dice = dice;
        this.magicBook = magicBook;
        this.enchantment = Optional.empty();
    }

    public String describeWeapon() {
        return enchantment
                .map(this::describe)
                .orElse(weaponDescription);
    }

    private String describe(Enchantment enchantment) {
        return enchantment.prefix + " " +
                weaponDescription + "\n " +
                enchantment.attributes;
    }

    public Durance enchantWeapon() {
        if (dice.throwDice(Dices.TEN) == 1)
            return new Durance(dice, magicBook);
        return new Durance(
                magicBook.selectEnchantment(),
                dice, magicBook);
    }

}
