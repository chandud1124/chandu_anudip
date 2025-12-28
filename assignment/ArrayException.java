public class ArrayException {

    public static void main(String[] args) {

        // Declare and initialize array
        int[] arr = {1, 2, 3, 4, 5};

        try {
            // Accessing array elements using loop
            // Loop intentionally goes beyond last index
            for (int i = 0; i <= arr.length; i++) {
                System.out.println("Element at index " + i + ": " + arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Error: Array index out of bounds.");
        }
    }
}