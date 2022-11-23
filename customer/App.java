package customer;

import java.util.Scanner;

import admin.*;


//create oop managment restaurant
public class App {

    // public static ArrayList<Food> foods = new ArrayList<Food>();
    // public static ArrayList<Drink> drinks = new ArrayList<Drink>();


    public static void main() {
        int foodQuantity = 0;
        int drinkQuantity = 0;
        int choose;

        // menu
        do {
            System.out.println("Welcome to our restaurant!");
            System.out.println("1. Order Food or Drink");
            System.out.println("2. View Order");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            Scanner sc = new Scanner(System.in);
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("1. Food");
                    System.out.println("2. Drink");
                    System.out.print("Choose: ");
                    int choose1 = sc.nextInt();
                    switch (choose1) {
                        case 1:
                            // view food
                            admin.readFood();

                           // order food
                           admin.orderFood(foodQuantity);
                            break;
                        case 2:
                            admin.readDrink();
                            
                            // order drink
                            admin.orderDrink(drinkQuantity);
                            break;
                        default:
                            System.out.println("Wrong choose!");
                            break;
                    }
                    break;
                case 2:
                    // orderlist
                    admin.orderList();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Wrong choose!");
                    break;
            }
        } while (choose != 3);
    }
}