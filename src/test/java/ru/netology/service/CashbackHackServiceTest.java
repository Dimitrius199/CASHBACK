package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(1, service.remain(999));
    }

    @Test
    public void testEqual() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(0, service.remain(1000));
    }

    @org.junit.jupiter.api.Test
    void testRemain() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(1, service.remain(999));
    }

    @org.junit.jupiter.api.Test
    void Equal() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(0, service.remain(1000));
    }
}