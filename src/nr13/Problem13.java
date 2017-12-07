/*
Write a program to compute the value of an investment compounded over time. The program should ask for the
starting amount, the number of years to invest, the interest rate, and the number of periods per year to compound.
• A is the amount at the end of the investment.
Example Output
What is the principal amount? 1500
What is the rate? 4.3
What is the number of years? 6
What is the number of times the interest is compounded per year? 4 $1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.
Constraints
• Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
• Ensure that fractions of a cent are rounded up to the next penny.
• Ensure that the output is formatted as money
 */

package nr13;

public class Problem13 extends P13 {
    public static void main(String[] args) {
        double principal = input("Principal? ");
        double rate = input("Annual rate of interest introduced as a percentage? ");
        int years = (int) input("Number of years of investment? ");
        int periodsPerYear = (int) input("Number of times the interest is compounded per year? ");
        double finalAmount = new Problem13().calculateMoney(principal, rate, years, periodsPerYear);
        System.out.println("$" + principal + " invested at " +rate + "% for " + years + " years compounded " + periodsPerYear + " times per year is $" + finalAmount + ".");
    }

    @Override
    double calculateMoney (double money, double rate, int years, int periodsPerYear) {
        rate = rate/100;
        double finalAmount = money * Math.pow((1 + rate/periodsPerYear), years*periodsPerYear);
        finalAmount =  Math.round(finalAmount * 100.0) / 100.0;
        return finalAmount;
    }

}
