package stud.anna;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class NegativeTests {

    @Test
    @Tag("smoke")
    void test1 () {
        assertTrue(false);
    }

    @Test
    @Tag("smoke")
    void test2 () {
        assertTrue(false);
    }

    @Test
    void test3 () {
        assertTrue(false);
    }

    @Test
    void test4 () {
        assertTrue(false);
    }

    @Test
    void test5 () {
        assertTrue(false);
    }
}
