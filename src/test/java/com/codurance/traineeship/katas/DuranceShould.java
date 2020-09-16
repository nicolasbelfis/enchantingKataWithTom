package com.codurance.traineeship.katas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DuranceShould {

    public static final String WEAPON_DESCRIPTION = "Dagger of the Nooblet\n" +
            " 5 - 10 attack damage\n" +
            " 1.2 attack speed";
    public static final String ENCHANTED_WEAPON_DESCRIPTION = "Quick Dagger of the Nooblet\n" +
            " 5 - 10 attack damage\n" +
            " 1.2 attack speed\n" +
            " +5 agility";
    public static final String ICY_WEAPON_DESCRIPTION = "Icy Dagger of the Nooblet\n" +
            " 5 - 10 attack damage\n" +
            " 1.2 attack speed\n" +
            " +5 ice damage";
    @Mock
    private Dice dice;

    @InjectMocks
    private Durance durance;
    @Mock
    private MagicBook magicBook;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void describe_a_weapon_without_enchant() {

        Durance durance = aDurance();
        assertThat(durance.describeWeapon(),
                is(
                        WEAPON_DESCRIPTION
                ));
    }

    @Test
    void describe_a_weapon_with_enchant() {
        Durance durance = aDurance();
        when(magicBook.selectEnchantment())
            .thenReturn(
                EnchantmentNew.AGILITY);

        String description = durance
                .enchantWeapon()
                .describeWeapon();
        assertThat(
                description,
                is(
                        ENCHANTED_WEAPON_DESCRIPTION
                ));
    }

    @Test
    void lose_his_current_enchantment_if_the_first_throw_is_1() {
        when(dice.throwDice(Dices.TEN)).thenReturn(1);

        String weaponDescription = aDurance()
                .enchantWeapon()
                .describeWeapon();
        assertThat(weaponDescription,
                is(
                        WEAPON_DESCRIPTION
                ));
    }

    @Test
    void enchant_successfully_if_the_first_throw_is_2() {
        when(dice.throwDice(Dices.TEN)).thenReturn(2);

        when(magicBook.selectEnchantment())
            .thenReturn(
                EnchantmentNew.AGILITY);
        String weaponDescription = aDurance()
                .enchantWeapon()
                .describeWeapon();
        assertThat(weaponDescription,
                is(
                        ENCHANTED_WEAPON_DESCRIPTION
                ));
    }

    @Test
    void have_ice_enchantment_if_the_magic_book_selects_ice_enchantment(){
        when(magicBook.selectEnchantment())
                .thenReturn(
                        EnchantmentNew.ICE);
        when(dice.throwDice(Dices.TEN)).thenReturn(2);
        String weaponDescription = aDurance()
                .enchantWeapon()
                .describeWeapon();
        assertThat(weaponDescription,
                is(
                        ICY_WEAPON_DESCRIPTION
                ));

    }

    private Durance aDurance() {
        return new Durance(dice, magicBook);
    }

}
