package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

public class AtomJenkins {

    @Test
    void successTest1() {
        assertTrue(true);
    }

    @Test
    void successTest2() {
        assertTrue(true);
    }

    @Test
    void failedTest() {

        step("Hamcrest-ed false assertion");
        fail();
    }


    @Test
    @DisplayName("Not Hamcrest-ed false assertion")
    void failedTest1_5() {
        step("Not Hamcrest-ed false assertion");
        assertEquals(false, true);
    }


    @Test
    @DisplayName("Test from captain obviousness")
    void successTest3() {
        assertEquals(true == true, false == false);
    }


    @Test
    void successTest4() {
        assertThat("true condition", true, is(true));
    }

    @Test
    void successTest5() {
        assertThat(true, is(true));
    }

    @Test
    @DisplayName("Hamcrest-ed PASSED test")
    void successTest6() {
        step("Ham-assertion");
        assertThat(true, is(true));
    }

    @Test
    @DisplayName("NOT-Hamcrest-ed PASSED test")
    void successTestNotHamcrested() {
        step("NOT-Ham-assertion");
        assertTrue(true);
    }

    @Test
    @DisplayName("Hamcrest-ed Failed test")
    void failedTest2() {
        step("Hamcrest-ed false assertion");
        assertThat("false condition", true, is(false));
    }


}
