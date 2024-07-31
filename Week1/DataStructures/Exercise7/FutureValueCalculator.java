package Exercise7;

public class FutureValueCalculator {


	    // Recursive method to calculate future value
	    public static double calculateFutureValue(double principal, double rate, int years) {
	        // Base case: If years is 0, the future value is just the principal
	        if (years == 0) {
	            return principal;
	        }
	        // Recursive case: Apply the growth rate to the future value of n-1 years
	        return calculateFutureValue(principal, rate, years - 1) * (1 + rate);
	    }

	    public static void main(String[] args) {
	        double principal = 1000.0; // Initial value
	        double rate = 0.05; // 5% annual growth rate
	        int years = 10; // Number of years

	        double futureValue = calculateFutureValue(principal, rate, years);

	        System.out.println("Future Value after " + years + " years: " + futureValue);
	    }
	}

