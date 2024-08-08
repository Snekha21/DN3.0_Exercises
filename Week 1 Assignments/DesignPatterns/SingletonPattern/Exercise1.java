package SingletonPattern;

public class Exercise1 {
	    public static void main(String[] args) {
	        // Get the single instance of Logger
	        Logger logger1 = Logger.getInstance();
	        Logger logger2 = Logger.getInstance();

	        // Log messages using both instances
	        logger1.log("This is the first log message.");
	        logger2.log("This is the second log message.");

	        // Verify that both instances are the same
	        if (logger1 == logger2) {
	            System.out.println("Both logger1 and logger2 are the same instance.");
	        } else {
	            System.out.println("logger1 and logger2 are different instances.");
	        }
	    }
	}

