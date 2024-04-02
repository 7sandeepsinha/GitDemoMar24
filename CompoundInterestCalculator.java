public class CompoundInterestCalculator {
    public static double calculate(int amount, int noOfYears, double rate){
        double totalAmount = amount * Math.pow(1 + rate / 100, noOfYears);
        return totalAmount;
    }
}
