class Restaurant {

    private boolean orderPlaced = false;
    private boolean foodCooked = false;

    // Waiter places order
    synchronized void foodOrder(String orderName) {
        System.out.println("Thread waiter: customer has ordered " + orderName);
        orderPlaced = true;
        notifyAll();
    }

    // Cook cooks food
    synchronized void cookedOrder(String orderName) {
        while (!orderPlaced) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Thread cook: chef has received the ordered " + orderName);
        System.out.println("Thread cook: cooking under progress.....");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread cook: Order is ready!!");
        foodCooked = true;
        notifyAll();
    }

    // Customer receives food
    synchronized void receivedOrder(String orderName) {
        while (!foodCooked) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Thread waiter: food is delivered to customer!!");
        System.out.println("Thread customer: customer has received the order: " + orderName);
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {

        Restaurant r = new Restaurant();
        String order = "Chicken biryani";

        Thread customer = new Thread(() -> {
            System.out.println("Thread customer: customer is chosing an order ...");
            r.receivedOrder(order);
        });

        Thread waiter = new Thread(() -> {
            r.foodOrder(order);
        });

        Thread cook = new Thread(() -> {
            r.cookedOrder(order);
        });

        customer.start();
        waiter.start();
        cook.start();
    }
}