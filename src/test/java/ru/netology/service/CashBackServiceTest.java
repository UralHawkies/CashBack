package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackServiceTest {

    @Test
    public void testRemain() {
        CashBackService service = new CashBackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void testWithoutRemain() {
        CashBackService service = new CashBackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void testWhenZero() {
        CashBackService service = new CashBackService();

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}