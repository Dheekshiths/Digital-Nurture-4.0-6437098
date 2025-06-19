package FinancialForecasting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting value (Principal): ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual growth rate (as decimal, e.g. 0.05 for 5%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double futureValue = FinancialForecast.futureValue(principal, rate, years);
        System.out.println("\nRecursive Forecasted Value: " + futureValue);

        double[] memo = new double[years + 1];
        double futureValueMemo = FinancialForecast.futureValueMemo(principal, rate, years, memo);
        System.out.println("Optimized Recursive (Memoized) Forecasted Value: " + futureValueMemo);
    }
}
