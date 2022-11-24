package admin;

abstract class Drink {
    // Drink name
    private String name;
    // Drink price
    private double price;
    // Drink quantity
    private int quantity;
    // Drink category
    private String category;

    // Constructor
    public Drink(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    // abstract method category
    abstract String category();

    // Getters and setters 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int setTempQuantity(int quantity) {
        return quantity;
    }

    public int getTempQuantity() {
        return setTempQuantity(quantity);
    }

    // toString method
    @Override
    public String toString() {
        //buat seperti tabel
        return String.format("| %-18s | Rp %-12s | %-8s | %-10s |", name, price, quantity, category);
    }

    //anak drink Hot and Cold
    public static class Hot extends Drink {

        public Hot(String name, double price, int quantity, String category) {
            super(name, price, quantity, category);
        }

        @Override
        String category() {
            return "Hot";
        }
    }

    public static class Cold extends Drink {

        public Cold(String name, double price, int quantity, String category) {
            super(name, price, quantity, category);
        }

        @Override
        String category() {
            return "Cold";
        }
    }

    
}
