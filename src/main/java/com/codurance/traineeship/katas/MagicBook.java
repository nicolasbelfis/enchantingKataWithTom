package com.codurance.traineeship.katas;

import java.util.Map;

public class MagicBook {

    private final Dice dice;
    private final static Map<Integer, Enchantment> enhantmentDiceMap =
            Map.of(
                    1,Enchantment.ICE,
                    2,Enchantment.AGILITY,
                    3,Enchantment.LIFE_STEAL,
                    4,Enchantment.FIRE,
                    5,Enchantment.STRENGTH
            );

    public MagicBook(Dice dice) {
        this.dice = dice;
    }

    public Enchantment selectEnchantment() {
        Integer integer = dice.throwDice(Dices.FIVE);
        return enhantmentDiceMap.get(integer);
    }
}
