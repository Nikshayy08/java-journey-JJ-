import java.util.Scanner;

public class CICalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double principal, rate, amount;
        int timesCompounded, years;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        // Compound Interest Formula: A = P * (1 + r/n)^(n*t)
        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is: \u20B9%.2f%n", years, amount);

        scanner.close();
    }
}