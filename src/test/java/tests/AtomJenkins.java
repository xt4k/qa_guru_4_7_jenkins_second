package tests;

import org.junit.jupiter.api.Test;

import static java.lang.Boolean.parseBoolean;
import static java.lang.System.*;
import static java.lang.System.getProperty;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class AtomJenkins {

    @Test
    void successTest() {
        assertTrue(true);
    }

    @Test
    void successTest2() {
        assertTrue(true);
    }

    @Test
    void failedTest() {
        fail();
    }



}
