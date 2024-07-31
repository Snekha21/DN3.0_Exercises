package Exercise3;
import java.util.Arrays;


public class Exercise3 {

	    private Order[] orders;
	    private int size;

	    public Exercise3(int capacity) {
	        this.orders = new Order[capacity];
	        this.size = 0;
	    }

	    public void addOrder(String orderId, double totalPrice) {
	        if (size >= orders.length) {
	            System.out.println("Order list is full. Cannot add more orders.");
	            return;
	        }
	        orders[size++] = new Order(orderId, totalPrice);
	    }

	    // Bubble Sort
	    public void bubbleSort() {
	        boolean swapped;
	        for (int i = 0; i < size - 1; i++) {
	            swapped = false;
	            for (int j = 0; j < size - i - 1; j++) {
	                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
	                    // Swap orders[j] and orders[j + 1]
	                    Order temp = orders[j];
	                    orders[j] = orders[j + 1];
	                    orders[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            if (!swapped) break; // No swapping means the array is already sorted
	        }
	    }

	    // Quick Sort
	    public void quickSort() {
	        quickSort(0, size - 1);
	    }

	    private void quickSort(int low, int high) {
	        if (low < high) {
	            int pi = partition(low, high);
	            quickSort(low, pi - 1);
	            quickSort(pi + 1, high);
	        }
	    }

	    private int partition(int low, int high) {
	        double pivot = orders[high].getTotalPrice();
	        int i = (low - 1);
	        for (int j = low; j < high; j++) {
	            if (orders[j].getTotalPrice() <= pivot) {
	                i++;
	                // Swap orders[i] and orders[j]
	                Order temp = orders[i];
	                orders[i] = orders[j];
	                orders[j] = temp;
	            }
	        }
	        // Swap orders[i + 1] and orders[high] (or pivot)
	        Order temp = orders[i + 1];
	        orders[i + 1] = orders[high];
	        orders[high] = temp;
	        return i + 1;
	    }

	    @Override
	    public String toString() {
	        return "InventoryManagementSystem{" +
	                "orders=" + Arrays.toString(Arrays.copyOfRange(orders, 0, size)) +
	                '}';
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	    	Exercise3 ims = new Exercise3(10);

	        ims.addOrder("O001", 250.00);
	        ims.addOrder("O002", 150.00);
	        ims.addOrder("O003", 300.00);
	        ims.addOrder("O004", 100.00);

	        System.out.println("Initial Orders:");
	        System.out.println(ims);

	        // Bubble sort
	        ims.bubbleSort();
	        System.out.println("Orders after Bubble Sort:");
	        System.out.println(ims);

	        // Adding more orders
	        ims.addOrder("O005", 200.00);
	        ims.addOrder("O006", 50.00);

	        // Quick sort
	        ims.quickSort();
	        System.out.println("Orders after Quick Sort:");
	        System.out.println(ims);
	    }
	}


