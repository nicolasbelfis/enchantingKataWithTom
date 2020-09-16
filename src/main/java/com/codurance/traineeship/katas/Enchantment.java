package com.codurance.traineeship.katas;

import java.util.Objects;

import static org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode;

class Enchantment {
    final String enchantPrefix;

    final String enchantAttribute;

    public Enchantment(String enchantPrefix, String enchantAttribute) {
        this.enchantPrefix = enchantPrefix;
        this.enchantAttribute = enchantAttribute;
    }

    @Override
    public boolean equals(Object other) {
        return reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return reflectionHashCode(this);
    }
}
