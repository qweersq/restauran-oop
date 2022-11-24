package admin;

import java.util.ArrayList;
import java.util.Scanner;

public class admin {
    public static ArrayList<Food> foods = new ArrayList<Food>();
    public static ArrayList<Drink> drinks = new ArrayList<Drink>();
    public static ArrayList<Order> orders = new ArrayList<Order>();

    public static void setArraylist() {
        // add food to list
        foods.add(new Food.Appetizer("Spring Roll", 2.50, 0, "Appetizer"));
        foods.add(new Food.Appetizer("Chicken Wings", 3.50, 0, "Appetizer"));
        foods.add(new Food.Appetizer("Potato Wedges", 3.50, 0, "Appetizer"));

        foods.add(new Food.MainCourse("Chicken Chop", 5.50, 0, "Main Course"));
        foods.add(new Food.MainCourse("Beef Steak", 6.50, 0, "Main Course"));
        foods.add(new Food.MainCourse("Fish & Chips", 6.50, 0, "Main Course"));

        foods.add(new Food.Dessert("Ice Cream", 2.50, 0, "Dessert"));
        foods.add(new Food.Dessert("Chocolate Cake", 3.50, 0, "Dessert"));
        foods.add(new Food.Dessert("Fruit Salad", 3.50, 0, "Dessert"));

        // add drink to list
        drinks.add(new Drink.Cold("Coca Cola", 2.50, 0, "Cold"));
        drinks.add(new Drink.Cold("Sprite", 2.50, 0, "Cold"));
        drinks.add(new Drink.Cold("Lemon Tea", 2.50, 0, "Cold"));

        drinks.add(new Drink.Hot("Coffee", 2.50, 0, "Hot"));
        drinks.add(new Drink.Hot("Tea", 2.50, 0, "Hot"));
        drinks.add(new Drink.Hot("Hot Chocolate", 2.50, 0, "Hot"));

    }

    public static void orderList() {
        System.out.println("Order list: ");
        System.out.println("+======================================================================+");
        System.out.println("| Id |      Name      |      Price      |      Category     | Quantity |");
        System.out.println("+======================================================================+");
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).getQuantity() > 0) {
                System.out.printf("| %-2d | %-14s | %-15.3f | %-17s | %-8d |%n", i + 1,
                        foods.get(i).getName(),
                        foods.get(i).getPrice(), foods.get(i).getCategory(), foods.get(i).getQuantity());
            }
        }
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).getQuantity() > 0) {
                System.out.printf("| %-2d | %-14s | %-15.3f | %-17s | %-8d |%n", i + 1,
                        drinks.get(i).getName(),
                        drinks.get(i).getPrice(), drinks.get(i).getCategory(), drinks.get(i).getQuantity());
            }
        }
        System.out.println("+======================================================================+");
        // print total price
        double totalPrice = 0;
        for (int i = 0; i < foods.size(); i++) {
            totalPrice += foods.get(i).getPrice() * foods.get(i).getQuantity();
        }
        for (int i = 0; i < drinks.size(); i++) {
            totalPrice += drinks.get(i).getPrice() * drinks.get(i).getQuantity();
        }
        System.out.printf("| Total Price : Rp %-51.3f |\n", totalPrice);

        System.out.println("+======================================================================+");
    }

    public static void orderFood(int foodQuantity) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose: ");
        int chooseFood = sc.nextInt();
        System.out.print("Quantity: ");
        int quantityFood = sc.nextInt();
        // jika quantity lebih dari 0 maka hanya menambahkan quantity
        if (foods.get(chooseFood - 1).getQuantity() > 0) {
            foodQuantity = foods.get(chooseFood - 1).getQuantity() + quantityFood;
            foods.get(chooseFood - 1).setQuantity(foodQuantity);
        } else {
            foods.get(chooseFood - 1).setQuantity(quantityFood);
        }
        foodQuantity += quantityFood;
    }

    public static void orderDrink(int drinkQuantity) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose: ");
        int chooseDrink = sc.nextInt();
        System.out.print("Quantity: ");
        int quantityDrink = sc.nextInt();
        // jika quantity lebih dari 0 maka hanya menambahkan quantity
        if (drinks.get(chooseDrink - 1).getQuantity() > 0) {
            drinkQuantity = drinks.get(chooseDrink - 1).getQuantity() + quantityDrink;
            drinks.get(chooseDrink - 1).setQuantity(drinkQuantity);
        } else {
            drinks.get(chooseDrink - 1).setQuantity(quantityDrink);
        }
    }

    public static void addFood() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter food name: ");
        String name = sc.nextLine();
        System.out.print("Enter food price: ");
        double price = sc.nextDouble();
        int cat;
        System.out.println("\n1. Main course");
        System.out.println("2. Dessert");
        System.out.println("3. Appetizer");
        System.out.print("Select food category: ");

        cat = sc.nextInt();
        switch (cat) {
            case 1:
                foods.add(new Food.MainCourse(name, price, 0, "Main Course"));
                break;
            case 2:
                foods.add(new Food.Dessert(name, price, 0, "Dessert"));
                break;
            case 3:
                foods.add(new Food.Appetizer(name, price, 0, "Appetizer"));
                break;
        }
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).getCategory().equals("\n\nAppetizer")) {
                System.out.printf("| %-2d | %-14s | %-15.3f | %-17s |%n", i + 1, foods.get(i).getName(),
                        foods.get(i).getPrice(), foods.get(i).getCategory());
            }
        }

        System.out.println("\n\nFood added successfully!");
    }

    public static void readFood() {
        // apetiizer
        System.out.println("+===========================================================+");
        System.out.println("| Id |      Name      |      Price      |      Category     |");
        System.out.println("+===========================================================+");
        System.out.println("Appetizer: ");
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).getCategory().equals("Appetizer")) {
                
                System.out.printf("| %-2d | %-14s | %-15.3f | %-17s |%n", i + 1, foods.get(i).getName(),
                        foods.get(i).getPrice(), foods.get(i).category());
            }
        }
        System.out.println("+-----------------------------------------------------------+");

        // main course
        System.out.println("Main Course: ");
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).getCategory().equals("Main Course")) {
                System.out.printf("| %-2d | %-14s | %-15.3f | %-17s |%n", i + 1, foods.get(i).getName(),
                        foods.get(i).getPrice(), foods.get(i).category());
            }
        }

        // dessert
        System.out.println("+-----------------------------------------------------------+");
        System.out.println("Dessert: ");
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).getCategory().equals("Dessert")) {
                System.out.printf("| %-2d | %-14s | %-15.3f | %-17s |%n", i + 1, foods.get(i).getName(),
                        foods.get(i).getPrice(), foods.get(i).category());
            }
        }
        System.out.println("+===========================================================+");

    }

    public static void updateFood() {
        // pilih category yang mau diedit
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose category to edit: ");
        System.out.println("1. Appetizer");
        System.out.println("2. Main Course");
        System.out.println("3. Dessert");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Appetizer: ");
                System.out.println("+===========================================================+");
                System.out.println("| Id |      Name      |      Price      |      Category     |");
                System.out.println("+===========================================================+");
                for (int i = 0; i < foods.size(); i++) {
                    if (foods.get(i).getCategory().equals("Appetizer")) {
                        System.out.printf("| %-2d | %-14s | %-15.3f | %-17s |%n", i + 1, foods.get(i).getName(),
                                foods.get(i).getPrice(), foods.get(i).getCategory());
                    }
                }
                System.out.println("+===========================================================+");
                System.out.print("Enter food id to edit: ");
                int id = sc.nextInt();
                System.out.print("Enter new food name: ");
                String name = sc.next();
                System.out.print("Enter new food price: ");
                double price = sc.nextDouble();
                foods.get(id - 1).setName(name);
                foods.get(id - 1).setPrice(price);
                System.out.println("Food edited successfully!");
                break;
            case 2:
                System.out.println("Main Course: ");
                System.out.println("+===========================================================+");
                System.out.println("| Id |      Name      |      Price      |      Category     |");
                System.out.println("+===========================================================+");
                for (int i = 0; i < foods.size(); i++) {
                    if (foods.get(i).getCategory().equals("Main Course")) {
                        System.out.printf("| %-2d | %-14s | %-15.3f | %-17s |%n", i + 1, foods.get(i).getName(),
                                foods.get(i).getPrice(), foods.get(i).getCategory());
                    }
                }
                System.out.println("+===========================================================+");
                System.out.print("Enter food id to edit: ");
                int id1 = sc.nextInt();
                System.out.print("Enter new food name: ");
                String name1 = sc.next();
                System.out.print("Enter new food price: ");
                double price1 = sc.nextDouble();
                foods.get(id1 - 1).setName(name1);
                foods.get(id1 - 1).setPrice(price1);
                System.out.println("Food edited successfully!");
                break;
            case 3:
                System.out.println("Dessert: ");
                System.out.println("+===========================================================+");
                System.out.println("| Id |      Name      |      Price      |      Category     |");
                System.out.println("+===========================================================+");
                for (int i = 0; i < foods.size(); i++) {
                    if (foods.get(i).getCategory().equals("Dessert")) {
                        System.out.printf("| %-2d | %-14s | %-15.3f | %-17s |%n", i + 1, foods.get(i).getName(),
                                foods.get(i).getPrice(), foods.get(i).getCategory());
                    }
                }
                System.out.println("+===========================================================+");
                System.out.print("Enter food id to edit: ");
                int id2 = sc.nextInt();
                System.out.print("Enter new food name: ");
                String name2 = sc.next();
                System.out.print("Enter new food price: ");
                double price2 = sc.nextDouble();
                foods.get(id2 - 1).setName(name2);
                foods.get(id2 - 1).setPrice(price2);
                System.out.println("Food edited successfully!");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    public static void deleteFood() {
        // pilih category yang mau diedit
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose category to delete: ");
        System.out.println("1. Appetizer");
        System.out.println("2. Main Course");
        System.out.println("3. Dessert");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Appetizer: ");
                System.out.println("+===========================================================+");
                System.out.println("| Id |      Name      |      Price      |      Category     |");
                System.out.println("+===========================================================+");
                for (int i = 0; i < foods.size(); i++) {
                    if (foods.get(i).getCategory().equals("Appetizer")) {
                        System.out.printf("| %-2d | %-14s | %-15.3f | %-17s |%n", i + 1, foods.get(i).getName(),
                                foods.get(i).getPrice(), foods.get(i).getCategory());
                    }
                }
                System.out.println("+===========================================================+");
                System.out.print("Enter food id to delete: ");
                int id = sc.nextInt();
                foods.remove(id - 1);
                System.out.println("Food deleted successfully!");
                break;
            case 2:
                System.out.println("Main Course: ");
                System.out.println("+===========================================================+");
                System.out.println("| Id |      Name      |      Price      |      Category     |");
                System.out.println("+===========================================================+");
                for (int i = 0; i < foods.size(); i++) {
                    if (foods.get(i).getCategory().equals("Main Course")) {
                        System.out.printf("| %-2d | %-14s | %-15.3f | %-17s |%n", i + 1, foods.get(i).getName(),
                                foods.get(i).getPrice(), foods.get(i).getCategory());
                    }
                }
                System.out.println("+===========================================================+");
                System.out.print("Enter food id to delete: ");
                int id1 = sc.nextInt();
                foods.remove(id1 - 1);
                System.out.println("Food deleted successfully!");
                break;
            case 3:
                System.out.println("Dessert: ");
                System.out.println("+===========================================================+");
                System.out.println("| Id |      Name      |      Price      |      Category     |");
                System.out.println("+===========================================================+");
                for (int i = 0; i < foods.size(); i++) {
                    if (foods.get(i).getCategory().equals("Dessert")) {
                        System.out.printf("| %-2d | %-14s | %-15.3f | %-17s |%n", i + 1, foods.get(i).getName(),
                                foods.get(i).getPrice(), foods.get(i).getCategory());
                    }
                }
                System.out.println("+===========================================================+");
                System.out.print("Enter food id to delete: ");
                int id2 = sc.nextInt();
                foods.remove(id2 - 1);
                System.out.println("Food deleted successfully!");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    public static void food() {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n ==== Food CRUD ====");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addFood();
                    break;
                case 2:
                    readFood();
                    break;
                case 3:
                    updateFood();
                    break;
                case 4:
                    deleteFood();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 5);
    }

    public static void addDrink() {
        int cat;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter drink name: ");
        String name = sc.next();
        System.out.print("Enter drink price: ");
        double price = sc.nextDouble();
        System.out.println("\n1. Hot");
        System.out.println("2. Cold");
        System.out.print("Select food category: ");

        cat = sc.nextInt();
        switch (cat) {
            case 1:
                drinks.add(new Drink.Hot(name, price, 0, "Hot"));
                break;
            case 2:
                drinks.add(new Drink.Cold(name, price, 0, "Cold"));
                break;

        }
        System.out.println("\n\n Drink added successfully!");
    }

    public static void readDrink() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose category to read: ");
        System.out.println("1. Hot");
        System.out.println("2. Cold");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Hot: ");
                System.out.println("+===========================================================+");
                System.out.println("| Id |      Name      |      Price      |      Category     |");
                System.out.println("+===========================================================+");
                for (int i = 0; i < drinks.size(); i++) {
                    if (drinks.get(i).getCategory().equals("Hot")) {
                        System.out.printf("| %-2d | %-14s | %-15.3f | %-17s |%n", i + 1, drinks.get(i).getName(),
                                drinks.get(i).getPrice(), drinks.get(i).category());
                    }
                }
                System.out.println("+===========================================================+");
                break;
            case 2:
                System.out.println("Cold: ");
                System.out.println("+===========================================================+");
                System.out.println("| Id |      Name      |      Price      |      Category     |");
                System.out.println("+===========================================================+");
                for (int i = 0; i < drinks.size(); i++) {
                    if (drinks.get(i).getCategory().equals("Cold")) {
                        System.out.printf("| %-2d | %-14s | %-15.3f | %-17s |%n", i + 1, drinks.get(i).getName(),
                                drinks.get(i).getPrice(), drinks.get(i).category());
                    }
                }
                System.out.println("+===========================================================+");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    public static void updateDrink() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose category to update: ");
        System.out.println("1. Hot");
        System.out.println("2. Cold");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Hot: ");
                System.out.println("+===========================================================+");
                System.out.println("| Id |      Name      |      Price      |      Category     |");
                System.out.println("+===========================================================+");
                for (int i = 0; i < drinks.size(); i++) {
                    if (drinks.get(i).getCategory().equals("Hot")) {
                        System.out.printf("| %-2d | %-14s | %-15.3f | %-17s |%n", i + 1, drinks.get(i).getName(),
                                drinks.get(i).getPrice(), drinks.get(i).getCategory());
                    }
                }
                System.out.println("+===========================================================+");
                System.out.print("Enter drink id to update: ");
                int id = sc.nextInt();
                System.out.print("Enter new drink name: ");
                String name = sc.next();
                System.out.print("Enter new drink price: ");
                double price = sc.nextDouble();
                drinks.get(id - 1).setName(name);
                drinks.get(id - 1).setPrice(price);
                System.out.println("Drink updated successfully!");
                break;
            case 2:
                System.out.println("Cold: ");
                System.out.println("+===========================================================+");
                System.out.println("| Id |      Name      |      Price      |      Category     |");
                System.out.println("+===========================================================+");
                for (int i = 0; i < drinks.size(); i++) {
                    if (drinks.get(i).getCategory().equals("Cold")) {
                        System.out.printf("| %-2d | %-14s | %-15.3f | %-17s |%n", i + 1, drinks.get(i).getName(),
                                drinks.get(i).getPrice(), drinks.get(i).getCategory());
                    }
                }
                System.out.println("+===========================================================+");
                System.out.print("Enter drink id to update: ");
                int id1 = sc.nextInt();
                System.out.print("Enter new drink name: ");
                String name1 = sc.next();
                System.out.print("Enter new drink price: ");
                double price1 = sc.nextDouble();
                foods.get(id1 - 1).setName(name1);
                foods.get(id1 - 1).setPrice(price1);
                System.out.println("Drink updated successfully!");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    public static void deleteDrink() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose category to delete: ");
        System.out.println("1. Hot");
        System.out.println("2. Cold");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Hot: ");
                System.out.println("+===========================================================+");
                System.out.println("| Id |      Name      |      Price      |      Category     |");
                System.out.println("+===========================================================+");
                for (int i = 0; i < drinks.size(); i++) {
                    if (drinks.get(i).getCategory().equals("Hot")) {
                        System.out.printf("| %-2d | %-14s | %-15.3f | %-17s |%n", i + 1, drinks.get(i).getName(),
                                drinks.get(i).getPrice(), drinks.get(i).getCategory());
                    }
                }
                System.out.println("+===========================================================+");
                System.out.print("Enter drink id to delete: ");
                int id = sc.nextInt();
                drinks.remove(id - 1);
                System.out.println("Drink deleted successfully!");
                break;
            case 2:
                System.out.println("Cold: ");
                System.out.println("+===========================================================+");
                System.out.println("| Id |      Name      |      Price      |      Category     |");
                System.out.println("+===========================================================+");
                for (int i = 0; i < drinks.size(); i++) {
                    if (drinks.get(i).getCategory().equals("Cold")) {
                        System.out.printf("| %-2d | %-14s | %-15.3f | %-17s |%n", i + 1, drinks.get(i).getName(),
                                drinks.get(i).getPrice(), drinks.get(i).getCategory());
                    }
                }
                System.out.println("+===========================================================+");
                System.out.print("Enter drink id to delete: ");
                int id1 = sc.nextInt();
                drinks.remove(id1 - 1);
                System.out.println("Drink deleted successfully!");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    public static void drink() {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n ==== Drink CRUD ====");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addDrink();
                    break;
                case 2:
                    readDrink();
                    break;
                case 3:
                    updateDrink();
                    break;
                case 4:
                    deleteDrink();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 5);
    }

    public static void main() {
        // CRUD Food and Drink
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n ==== CRUD Food and Drink ====");
            System.out.println("1. Food");
            System.out.println("2. Drink");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    food();
                    break;
                case 2:
                    drink();
                    break;
                case 3:
                    System.out.println("Thank you for using our system!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 3);
    }

}