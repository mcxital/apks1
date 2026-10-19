package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {
    @Test
    void BasicAddition() {
        assertEquals(4, Hello.add(2, 2));
    }
}
