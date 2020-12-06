package ua.lviv.iot.sales1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ua.lviv.iot.sales1.Sales;

public class Sales1Test {
    int[] firstNumbers = {10, 6, 7, 3, 5, 8, 1, 4, 2};
    int[] secondNumbers = {5, 9, 2, 6, 3};
    int[] thirdNumbers = {10, 6, 3, 5, 1, 10, 4, 2};
    int[] forthNumbers = {9, 5, 12, 5, 7, 2, 1, 8};

    @Test
    public void testFirstSales1() {
        int expectedIncome = 5;
        assertEquals(expectedIncome, Sales.findMaxIncome1(firstNumbers));
    }
    
    @Test
    public void testSecondSales1() {
        int expectedIncome = 4;
        assertEquals(expectedIncome, Sales.findMaxIncome1(secondNumbers));
    }
    
    @Test
    public void testThirdSales1() {
        int expectedIncome = 9;
        assertEquals(expectedIncome, Sales.findMaxIncome1(thirdNumbers));
    }
    
    @Test
    public void testForthSales1() {
        int expectedIncome = 7;
        assertEquals(expectedIncome, Sales.findMaxIncome1(forthNumbers));
    }
    
    @Test
    public void testFirstSalesUlimited() {
        int expectedIncome = 9;
        assertEquals(expectedIncome, Sales.findMaxIncomeUnlimited(firstNumbers));
    }
    
    @Test
    public void testSecondSalesUlimited() {
        int expectedIncome = 8;
        assertEquals(expectedIncome, Sales.findMaxIncomeUnlimited(secondNumbers));
    }
    
    @Test
    public void testThirdSalesUlimited() {
        int expectedIncome = 11;
        assertEquals(expectedIncome, Sales.findMaxIncomeUnlimited(thirdNumbers));
    }
    
    @Test
    public void testForthSalesUlimited() {
        int expectedIncome = 16;
        assertEquals(expectedIncome, Sales.findMaxIncomeUnlimited(forthNumbers));
    }
}
