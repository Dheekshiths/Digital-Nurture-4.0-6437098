package FinancialForecasting;
public class FinancialForecast {

    
    public static double futureValue(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return (1 + rate) * futureValue(principal, rate, years - 1);
    }

    
    public static double futureValueMemo(double principal, double rate, int years, double[] memo) {
        if (years == 0) {
            return principal;
        }
        if (memo[years] != 0) {
            return memo[years];
        }
        memo[years] = (1 + rate) * futureValueMemo(principal, rate, years - 1, memo);
        return memo[years];
    }
}
