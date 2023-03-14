package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackServiceTest {

    @Test
    public void testRemain() {
        CashBackHackService service = new CashBackHackService();
        assertEquals(service.remain(999), 1);
    }

    @Test
    public void testEqual() {
        CashBackHackService service = new CashBackHackService();
        assertEquals(service.remain(1000), 0);
    }
}