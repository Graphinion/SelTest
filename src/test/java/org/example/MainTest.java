package org.example;

import static org.example.Main.executeRun;
import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class MainTest {
@Test
    void validTestdata(){
    assertEquals(10,executeRun(10));
}
}
