package ua.lviv.iot.sales1;

public class Sales {
    
    public static int findMaxIncome1(int[] numbers){
        int min = numbers[0];
        int max = numbers[0];
        int income = 0;
        for (int i = 0; i < numbers.length; ++i) {
            
            if(numbers[i] < min) {
                
                min = numbers[i];
                max = numbers[i];
                
            } else if (numbers[i] > max) {
                
                max = numbers[i];
                int temp = max-min;
                income = Math.max(temp, income);
                
            }
        }
        return income;
    }
    
    public static int findMaxIncomeUnlimited(int[] numbers){
        int min = numbers[0];
        int max = numbers[0];
        int income = 0;
        for (int i = 0; i < numbers.length; ++i) {
            
            if(numbers[i] < min) {
                
                min = numbers[i];
                max = numbers[i];
                
            } else if (numbers[i] > max) {
                
                max = numbers[i];
                int temp = max-min;
                income += temp;
                min = numbers[i];
            }
        }
        return income;
    }

}
