public class SIPCalculator {
    public static double calculate(int amount, int noOfSips, double rate, int time){
        double monthlyRate = rate / 100 / 12; // Monthly interest rate
        int totalMonths = time * 12; // Total number of months

        double totalAmount = 0;
        for (int i = 0; i < totalMonths; i++) {
            totalAmount += amount;
            totalAmount *= (1 + monthlyRate);
        }

        return totalAmount;
    }
}

