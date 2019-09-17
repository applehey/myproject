package com.liao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void bmiTest() {
        Person person = new Person(68.5f, 1.77f);
        Assertions.assertEquals((68.5f/(1.77f*1.77f)), person.bmi());
    }
}
