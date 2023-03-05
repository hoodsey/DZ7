package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {// 1. Сумма всех продаж
        long sumSale = 0;// переменная для суммы
        for (long sale : sales) {
            sumSale =sumSale + sale;
        }
        return sumSale;
    }

    public long avrSales(long[] sales) {// 2. Средняя сумму продаж в месяц
        long sumSale = 0;// переменная для суммы
        for (long sale : sales) {
            sumSale =sumSale + sale;
        }
        return sumSale/12;
    }
    public int maxSales(long[] sales) {//3. номер месяца пик продаж
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }
    public int minSales(long[] sales) {//4. номер месяца минимальных продаж
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
    public int numbMonthWhichSalesBelowAvr(long[] sales) {//5. Количество месяцев, в которых продажи были ниже среднего.
        long avg  = avrSales(sales);
        int numbMonth = 0;
        for (long sale : sales) {
            if (sale < avg) {
                numbMonth = numbMonth+1;
            }
        }
        return numbMonth;
    }
    public int numbMonthWhichSalesAboveAvr(long[] sales) {//6. Количество месяцев, в которых продажи были выше среднего
        long avg  = avrSales(sales);
        int numbMonth = 0;
        for (long sale : sales) {
            if (sale > avg) {
                numbMonth = numbMonth+1;
            }
        }
        return numbMonth;
    }
}
