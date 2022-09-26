package ru.netology.service;
public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @org.testng.annotations.Test
    public void Amount999() {
        org.testng.Assert.assertEquals(service.remain(999), 1);
    }

    @org.testng.annotations.Test
    public void Amount1000() {
        org.testng.Assert.assertEquals(service.remain(1000), 0);
    }

    @org.testng.annotations.Test
    public void Amount1001() {
        org.testng.Assert.assertEquals(service.remain(1001), 999);
    }
}
