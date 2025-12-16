class bank{
    double amt;
    bank(double amt) {
        this.amt = amt;
    }
    void withdraw(double withdrawalamt) {
        String message =(withdrawalamt <= amt)? "Withdrawal successful" : "Insufficient balance";
        System.out.println(message);
        if(withdrawalamt<=amt) {
            amt -= withdrawalamt;
        }
    }
void deposite(double depositeamt) {
    amt=amt+depositeamt;
    System.out.println("Amount deposited successful, available balance is: " + amt);
}
}

public class bankmain {
    public static void main(String[] args) {
        bank b = new bank(5000);
        b.deposite(2000);
        b.withdraw(1000);
    
}
}