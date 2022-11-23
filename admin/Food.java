package admin;

public class Food {
    // Food name
    private String name;
    // Food price
    private double price;
    // Food quantity
    private int quantity;
    // Food category
    private String category;


    // Constructor
    public Food(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

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
    

    // toString method
    @Override
    public String toString() {
        //buat seperti tabel
        return String.format("| %-18s | Rp %-12s | %-10s | %-10s |", name, price, quantity, category);
    }

    //buat anaknya apetizer, main course, dessert
    public static class Appetizer extends Food {
        public Appetizer(String name, double price, int quantity, String category) {
            super(name, price, quantity, category);
        }
    }

    public static class MainCourse extends Food {
        public MainCourse(String name, double price, int quantity, String category) {
            super(name, price, quantity, category);
        }
    }

    public static class Dessert extends Food {
        public Dessert(String name, double price, int quantity, String category) {
            super(name, price, quantity, category);
        }
    }

}
