package com.codurance.traineeship.katas;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FakeLibraryShould {

    @Test
    void returnAlwaysTrue() {
        FakeLibrary fakeLibrary = new FakeLibrary();
        assertThat(fakeLibrary.fakeMethod(), is(true));
    }
}