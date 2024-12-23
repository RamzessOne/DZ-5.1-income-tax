package app;

    public class Main {
        static double income;
        static double taxRate;
        static double incomeTaxed;
        private static final String CURRENCY = "EUR";


        public static void main(String[] args) {
            income = (double)26000.0F;
            if (income < (double)0.0F) {
                System.out.println("Wrong data");
            } else if (income <= (double)10000.0F) {
                taxRate = (double)2.5F;
                incomeTaxed = income * taxRate / (double)100.0F;
                System.out.printf("Income afte tax is %s %.2f", "EUR", incomeTaxed);
            } else if (income <= (double)25000.0F) {
                taxRate = 4.3;
                incomeTaxed = income * taxRate / (double)100.0F;
                System.out.printf("Income afte tax is %s %.2f", "EUR", incomeTaxed);
            } else {
                taxRate = 6.7;
                incomeTaxed = income * taxRate / (double)100.0F;
                System.out.printf("Income afte tax is %s %.2f", "EUR", incomeTaxed);
            }

        }
    }


