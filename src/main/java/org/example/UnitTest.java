package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTest {

    @Test
    public void canGoToHomePage() {
        Pages.homePage().goTo();
        Assertions.assertTrue(Pages.homePage().isAt());
    }

    @AfterAll
    public static void cleanUp(){
        Browser.close();
    }
}