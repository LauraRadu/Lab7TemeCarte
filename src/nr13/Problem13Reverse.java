package nr13;

public class Problem13Reverse extends P13 {
    public static void main(String[] args) {
            double amountWanted = input("What is the wanted amount of money? ");
            double rate = input("Annual rate of interest introduced as a percentage? ");
            int years = (int) input("Number of years of investment? ");
            int periodsPerYear = (int) input("Number of times the interest is compounded per year? ");
            double moneyToInvest = new Problem13Reverse().calculateMoney(amountWanted, rate, years, periodsPerYear);
            System.out.println("To gain $" + amountWanted + " at " +rate + "% in " + years + " years compounded " + periodsPerYear + " times per year you need to invest $" + moneyToInvest + ".");
        }

    @Override
    double calculateMoney (double money, double rate, int years, int periodsPerYear) {
            rate = rate/100;
            double mon = (Math.pow((1 + rate/periodsPerYear), years*periodsPerYear));
            double moneyToInvest = money / mon ;
            moneyToInvest =  Math.round(moneyToInvest * 100.0) / 100.0;
            return moneyToInvest;
        }

}
