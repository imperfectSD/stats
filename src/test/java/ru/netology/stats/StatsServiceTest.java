package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {

        int expected = 180;
        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);

    }

    @Test
    void calculateAverage() {

        int expected = 15;
        int actual = service.calculateAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateMaxSalesMonth() {

        int expected = 8;
        int actual = service.calculateMaxSalesMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateMinSalesMonth() {

        int expected = 9;
        int actual = service.calculateMinSalesMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateLessAverageMonth() {

        int expected = 5;
        int actual = service.calculateLessAverageMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateMoreAverageMonth() {

        int expected = 5;
        int actual = service.calculateMoreAverageMonth(sales);

        assertEquals(expected, actual);
    }
}