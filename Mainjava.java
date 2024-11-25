package mycodes;

public class Mainjava{
	 
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
 
    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
 
    // Method to add two floating-point numbers
    public float add(float a, float b) {
        return a + b;
    }
 
    // Method to add an array of integers
    public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
 
    public static void main(String[] args) {
    	Mainjava addition = new Mainjava();
        // Add two integers
        System.out.println("Sum of two integers: " + addition.add(5, 10));
 
        // Add three integers
        System.out.println("Sum of three integers: " + addition.add(5, 10, 15));
 
        // Add two floating-point numbers
        System.out.println("Sum of two floats: " + addition.add(5.5f, 10.5f));
 
        // Add an array of integers
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of array: " + addition.add(numbers));
    }
}

