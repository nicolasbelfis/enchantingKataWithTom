package com.codurance.traineeship.katas;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DuranceShould {

    @Test
    void describe_a_weapon_without_enchant() {

        Durance durance = new Durance();
        assertThat(durance.describeWeapon(),
                is(
                        "Dagger of the Nooblet\n" +
                                " 5 - 10 attack damage\n" +
                                " 1.2 attack speed"
                ));
    }

    @Test
    void describe_a_weapon_with_enchant() {
        Durance durance = new Durance();
        durance.enchantWeapon();

        assertThat(durance.describeWeapon(),
                is(
                        "Quick Dagger of the Nooblet\n" +
                                " 5 - 10 attack damage\n" +
                                " 1.2 attack speed\n" +
                                " +5 agility"
                ));
    }
}
