//method overloading-compile time polymorphism

class Calculator {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void add(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
}

class AddDemo {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(1, 2);
        c.add(1, 2, 3);
        c.add(1, 2, 3, 4);
    }
}
