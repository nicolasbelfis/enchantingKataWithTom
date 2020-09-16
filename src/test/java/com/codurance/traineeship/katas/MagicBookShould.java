package com.codurance.traineeship.katas;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

class MagicBookShould {

    @Mock
    private Dice dice;
    @InjectMocks
    MagicBook magicBook;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void select_icy_enchantment(){
        when(dice.throwDice(Dices.FIVE))
                .thenReturn(1);
        Enchantment anIcyEnchantment = new Enchantment("Icy", "+5 ice damage");
        assertThat(magicBook.selectEnchantment(),is(anIcyEnchantment));
    }

}