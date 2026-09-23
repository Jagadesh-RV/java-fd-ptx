// Abstraction

abstract class Payment {

    int amount;

    Payment(int amount) {
        this.amount = amount;
        System.out.println("Payment Done using " + getClass());
    }

    abstract void pay();
}

class Debitcard extends Payment {

    Debitcard(int amount) {
        super(amount);
    }

    void pay() {
        System.out.println(amount + " paid through Debitcard ");
    }
}

class Creditcard extends Payment {

    Creditcard(int amount) {
        super(amount);
    }

    void pay() {
        System.out.println(amount + " paid through Creditcard ");
    }
}

class CardPayment {

    public static void main(String[] args) {
        Payment p1 = new Debitcard(5000);
        p1.pay();
        Payment p2 = new Creditcard(10000);
        p2.pay();
    }
}
