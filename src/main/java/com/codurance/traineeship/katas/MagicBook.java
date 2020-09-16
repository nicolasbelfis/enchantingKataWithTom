package com.codurance.traineeship.katas;

public class MagicBook {

    private final Dice dice;

    public MagicBook(Dice dice) {
        this.dice = dice;
    }

    public Enchantment selectEnchantment() {
        return Enchantment.ICE;
    }
}
