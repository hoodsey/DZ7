package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    @org.junit.jupiter.api.Test
    void calculateMinSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] arrSalesForMonth = new long[]{
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long expected = 9;

        // вызываем целевой метод:
        long actual = service.minSales(arrSalesForMonth);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
