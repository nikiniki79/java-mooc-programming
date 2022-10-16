
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account x = new Account("Matthews account", 1000);
        Account y = new Account("My account", 0);
        x.withdrawal(100.0);
        y.deposit(100.0);
        System.out.println(x);
        System.out.println(y);
    }
}
