package testing;

abstract class testAbstract {
    
    private String name;
    private double price;

    public testAbstract(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    abstract void category();
}

class test extends testAbstract {

    public test(String name, double price) {
        super(name, price);
    }

    @Override
    void category() {
        System.out.println("Makanan " + super.getName());
    }
    
}

class hadad {
    public static void main(String[] args) {
        test t = new test("Nasi Goreng", 10000);
        t.category();
    }
}