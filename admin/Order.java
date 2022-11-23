package admin;

import java.util.ArrayList;

public class Order {

    // Order ID
    private int id;
    private double totalPrice;
    private ArrayList<Food> foodList = new ArrayList<>();
    private ArrayList<Drink> drinkList = new ArrayList<>();

    // Constructor
    public Order(int id) {
        this.id = id;
    }

    public Order(ArrayList<Food> foods, ArrayList<Drink> drinks) {
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList<Food> foodList) {
        this.foodList = foodList;
    }

    public ArrayList<Drink> getDrinkList() {
        return drinkList;
    }   

    public void setDrinkList(ArrayList<Drink> drinkList) {
        this.drinkList = drinkList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    // toString method

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", foodList=" + foodList + ", drinkList=" + drinkList + '}';
    }

    //total price
    public double totalPrice() {
        double total = 0;
        for (int i = 0; i < foodList.size(); i++) {
            total += foodList.get(i).getPrice() * foodList.get(i).getQuantity();
        }
        for (int i = 0; i < drinkList.size(); i++) {
            total += drinkList.get(i).getPrice() * drinkList.get(i).getQuantity();
        }
        return total;
    }

}
