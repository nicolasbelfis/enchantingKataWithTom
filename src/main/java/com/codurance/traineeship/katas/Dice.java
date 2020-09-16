package com.codurance.traineeship.katas;

import java.util.Random;

class Dice {

    public Integer throwDice(Dices dice) {
        return new Random().nextInt(dice.diceFaces);
    }

}
