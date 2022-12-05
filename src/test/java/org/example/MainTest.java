package org.example;

import static org.example.Main.executeRun;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MainTest {
@Test
    void validTestdata() {
    assertEquals(15, executeRun(15));
}
}
