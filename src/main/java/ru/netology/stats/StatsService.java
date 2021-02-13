package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
        int calculateSum = calculateSum(sales);
        return calculateSum / sales.length;

    }

    public int calculateMaxSalesMonth(int[] sales) {
        int max = sales[0];
        for (int sale : sales) {
            if (max < sale) {
                max = sale;
            }
        }

        int monthNumber = 0;
        int maxSalesMonth = 0;
        for (int sale : sales) {
            monthNumber++;
            if (sale == max) {
                maxSalesMonth = monthNumber;
            }
        }
        return maxSalesMonth;
    }

    public int calculateMinSalesMonth(int[] sales) {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }

        int monthNumber = 0;
        int minSalesMonth = 0;
        for (int sale : sales) {
            monthNumber++;
            if (sale == min) {
                minSalesMonth = monthNumber;
            }
        }
        return minSalesMonth;

    }

    public int calculateLessAverageMonth(int[] sales) {
        int average = calculateAverage(sales);

        int monthCount = 0;
        for (int sale : sales) {
            if (sale < average) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int calculateMoreAverageMonth(int[] sales) {
        int average = calculateAverage(sales);

        int monthCount = 0;
        for (int sale : sales) {
            if (sale > average) {
                monthCount++;
            }
        }
        return monthCount;
    }
}
