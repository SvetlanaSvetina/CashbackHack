package ru.netology.service;

import org.junit.Test;

import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void AmountZero() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldBuyFor1000Rubles() {
        assertEquals(service.remain(1000), 0);
    }
}
