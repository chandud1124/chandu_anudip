class Warmup1 {
    public static void main(String[] args) {

        // Example inputs
        boolean weekday = false;   // change this to true/false and test
        boolean vacation = false;  // change this to true/false and test

        boolean sleepIn;

        // Regular IF-ELSE method
        if (weekday == false || vacation == true) {
            sleepIn = true;
        } else {
            sleepIn = false;
        }

        System.out.println("Can we sleep in? " + sleepIn);
    }
}