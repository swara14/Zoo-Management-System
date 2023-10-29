package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Admin admin = new Admin();
        admin.addAnimal(new Mammal("lion", "Mammal", "roar", "The lion is a large cat of the genus Panthera native to Africa and India."));
        admin.addAnimal(new Mammal("dog", "Mammal", "bark", "The dog is a domesticated descendant of the wolf."));
        admin.addAnimal(new Reptile("snake", "Reptile", "hiss", "Snakes are elongated, limbless, carnivorous reptiles of the suborder Serpentes."));
        admin.addAnimal(new Reptile("crocodile", "Reptile", "crocodile sound", "Crocodiles or true crocodiles are large semiaquatic reptiles that live throughout the tropics."));
        admin.addAnimal(new Amphibian("frog", "Amphibian", "frog sound", "A frog is any member of a diverse and largely carnivorous group of short-bodied, tailless amphibians composing the order Anura."));
        admin.addAnimal(new Amphibian("toad", "Amphibian", "toad sound", "Toad is a common name for certain frogs, especially of the family Bufonidae."));

        admin.addAttractions(new Attraction(1, "Safari Experience", 20.00, "A thrilling experience in the zoo."));
        admin.addAttractions(new Attraction(2, "Botanical Garden", 25.00, "A stunning collection of orchids."));
        admin.addAttractions(new Attraction(3, "Dinosaur Show", 15.00, "A theme park with models of dinosaurs."));

//        Visitor visitor=new Visitor();
        double revenue = 0;

        while (true) {
            System.out.println("1.Enter as Admin\n2.Enter as a Visitor\n3.View Special Deals\n4.Exit");
//                sc.nextLine();
            System.out.print("Enter your choice: ");
            int n = sc.nextInt();

            if (n == 1) {
                sc.nextLine();
                System.out.print("Enter username: ");
                String username = sc.nextLine();
                System.out.print("Enter password: ");
                String password = sc.nextLine();
                if (username.equals("swara") && password.equals("swara123")) {
                    System.out.println("Logged in as admin.");
                    while (true) {
                        System.out.println("Admin Menu:\n1. Manage Attractions\n2. Manage Animals\n" +
                                "3. Schedule Events\n4. Set Discounts\n5. Set Special Deal\n" +
                                "6. View Visitor Stats\n7. View Feedback\n8. Exit\n");

                        System.out.print("Enter your choice: ");
                        int m = sc.nextInt();

                        if (m == 1) { //manage attractions
                            while (true) {
                                System.out.println("Manage Attractions:\n1. Add Attraction\n" +
                                        "2. View Attractions\n3. Modify Attraction\n4. Remove Attraction\n" +
                                        "5. Exit\n");

                                System.out.print("Enter you choice: ");
                                int ch = sc.nextInt();

                                if (ch == 1) { //add attractions
                                    sc.nextLine();
                                    System.out.print("Enter the id of the attraction: ");
                                    int id = sc.nextInt();
                                    System.out.print("Enter the name of attraction to add: ");
                                    sc.nextLine();
                                    String name = sc.nextLine();
                                    System.out.print("Enter price for attraction: ");
                                    Double price = sc.nextDouble();
                                    System.out.print("Enter attraction description: ");
                                    sc.nextLine();
                                    String description = sc.nextLine();

                                    admin.addAttractions(new Attraction(id, name, price, description));
                                    System.out.println("Attraction added.");
                                } else if (ch == 2) { //view attractions
                                    for (Attraction attraction : admin.attractions) {
                                        System.out.println("ID: " + attraction.getId());
                                        System.out.println("Name: " + attraction.getAt_name());
                                        System.out.println("Description: " + attraction.getDescription());
                                        System.out.println("Price: " + attraction.getPrice());
                                        if (attraction.isOpen() == true) {
                                            System.out.println("Status: Attraction is open.");
                                        } else {
                                            System.out.println("Status: Attraction is closed.");
                                        }
                                        System.out.println();
                                    }
                                } else if (ch == 3) { //modify attractions
                                    sc.nextLine();
                                    System.out.print("Enter the name of the attraction you want to update: ");
                                    String name = sc.nextLine();
                                    System.out.print("Enter the new price of attraction: ");
                                    Double newprice = sc.nextDouble();
                                    sc.nextLine();
                                    System.out.println("Enter the new description: ");
                                    String newdes = sc.nextLine();
                                    admin.updateAttractions(name, newdes, newprice);
                                    System.out.println("Attraction has been updated.");
                                } else if (ch == 4) { //remove attraction
                                    sc.nextLine();
                                    System.out.print("Enter attractions name to remove: ");
                                    String name = sc.nextLine();
                                    admin.removeAttractions(name);
                                    System.out.println("Attraction has been removed.");
                                } else if (ch == 5) { //exit
                                    break;
                                }
                            }
                        }

                        if (m == 2) { //manage animals
                            while (true) {
                                System.out.println("Manage Animals:\n1. Add Animal\n2. Update Animal Details\n" +
                                        "3. Remove Animal\n4. List Animals\n5. Exit\n");

                                System.out.print("Enter you choice: ");
                                int ch = sc.nextInt();

                                if (ch == 1) { //add new animal
                                    sc.nextLine();

                                    System.out.print("Enter the name of animal to add: ");
                                    String name = sc.nextLine();
//                                sc.nextLine();
                                    System.out.print("Enter category(Mammal/Amphibian/Reptile): ");
                                    String category = sc.nextLine();
                                    System.out.print("Enter sound it makes: ");
                                    String sound = sc.nextLine();
                                    System.out.print("Enter the history: ");
                                    String history = sc.nextLine();

                                    if (category.equalsIgnoreCase("Mammal")) {
                                        admin.addAnimal(new Mammal(name, "Mammal", sound, history));
                                        admin.mammals.add(name);
                                    } else if (category.equalsIgnoreCase("Reptile")) {
                                        admin.addAnimal(new Reptile(name, "Reptile", sound, history));
                                        admin.reptiles.add(name);
                                    } else if (category.equalsIgnoreCase("Amphibian")) {
                                        admin.addAnimal(new Amphibian(name, "Amphibian", sound, history));
                                        admin.amphibians.add(name);
                                    }
                                    System.out.println("Animal has been added.");
                                } else if (ch == 2) { //update details
                                    sc.nextLine();
                                    System.out.print("Enter the name of the animal you want to update: ");
                                    String name = sc.nextLine();
                                    System.out.print("Enter the new sound for the animal: ");
                                    String newSound = sc.nextLine();
                                    admin.updateAnimal(name, newSound);
                                    System.out.println("Animal has been updated.");
                                } else if (ch == 3) { //remove animal
                                    sc.nextLine();
                                    System.out.print("Enter animal name to remove: ");
                                    String name = sc.nextLine();
                                    if (admin.mammals.size() > 2 && admin.amphibians.size() > 2 && admin.reptiles.size() > 2) {
                                        admin.removeAnimal(name);
                                        System.out.println("Animal has been removed.");
                                    } else {
                                        System.out.println("You cannot remove more animals.");
                                    }
                                } else if (ch == 4) { //list animals
                                    for (Animal animal : admin.animals) {
                                        System.out.print("Name: " + animal.getAn_Name());
                                        System.out.print(", Category: " + animal.getAn_Category());
                                        System.out.print(", Sound: ");
                                        animal.makeSound();
                                    }
                                } else if (ch == 5) {
                                    break;
                                }
                            }
                        } else if (m == 3) { //schedule events
                            System.out.println("Attractions: ");
                            for (Attraction attraction : admin.attractions) {
                                System.out.println(attraction.getAt_name());
                            }
                            sc.nextLine();
                            System.out.print("Enter the name of attraction to schedule: ");
                            String name = sc.nextLine();
                            System.out.print("Schedule the attraction (open/close): ");
                            String schedule = sc.nextLine();
                            System.out.print("Enter the price of the attraction: ");
                            double price = sc.nextDouble();

                            boolean found = false;
                            for (Attraction attraction : admin.attractions) {
                                if (attraction.getAt_name().equalsIgnoreCase(name)) {
                                    found = true;
                                    if (schedule.equalsIgnoreCase("open")) {
                                        attraction.setOpen(true);
                                    } else if (schedule.equalsIgnoreCase("close")) {
                                        attraction.setOpen(false);
                                    } else {
                                        System.out.println("Invalid input");
                                    }
                                    attraction.setPrice(price);
                                    break;
                                }
                            }

                            if (!found) {
                                System.out.println("Attraction not available");
                            }

//                                for (Attraction attraction : admin.attractions) {
//                                    if (attraction.getAt_name().equalsIgnoreCase(name)) {
//                                        attraction.setPrice(price);
//                                        break;
//                                    } else {
//                                        System.out.println("Attraction not available");
//                                        break;
//                                    }
//                                }
                        }

                        if (m == 4) { // Set Discounts
                            while (true) {
                                System.out.println("1. Add Discount\n2. Remove Discount\n3. View Discount\n4. Exit");
                                System.out.print("Enter a choice: ");
                                int ch = sc.nextInt();
                                if (ch == 1) {
                                    sc.nextLine();
                                    System.out.print("Enter category for the discount to add: ");
                                    String category = sc.nextLine();
                                    System.out.print("Enter discount percentage(10 for 10%): ");
                                    int discount = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Enter description for the discount: ");
                                    String description = sc.nextLine();
                                    Discount dis = new Discount(category, discount);
                                    dis.setDescription(description);
                                    dis.setCode(category, discount);
                                    System.out.println("Code for the added discount: " + dis.getCode());
                                    admin.addDiscount(dis);
                                }
                                if (ch == 2) {
                                    sc.nextLine();
                                    System.out.print("Enter discount code to remove: ");
                                    String code = sc.nextLine();
                                    boolean flag = false;
                                    for (Discount dis : admin.discounts) {
                                        if (dis.getCode().equals(code)) {
                                            admin.removeDiscount(code);
                                            flag = true;
                                            System.out.println("Discount removed.");
                                            break;
                                        }
                                    }
                                    if (!flag) {
                                        System.out.println("Code not found.");
                                    }
                                }
                                if (ch == 3) {
                                    sc.nextLine();
                                    for (Discount dis : admin.discounts) {
                                        System.out.print(dis.getCode());
                                        System.out.println(": " + dis.getDescription());
                                    }
                                }
                                if (ch == 4) {
                                    break;
                                }
                            }
                        }
                        else if (m == 5) { //special deals
                            while (true) {
                                System.out.println("1. Add Special Deals\n2. Remove Deals\n3. View Deals\n4. Exit");
                                System.out.println("Enter your choice: ");
                                int ch = sc.nextInt();

                                if (ch == 1) {
                                    sc.nextLine();
//                                    System.out.print("Enter name of the special deal to add: ");
//                                    String name = sc.nextLine();
                                    System.out.print("Enter the minimum attractions for deal: ");
                                    int minAttr = sc.nextInt();
                                    System.out.print("Enter discount: ");
                                    int discount = sc.nextInt();

                                    SpecialDeal deal = new SpecialDeal(minAttr, discount);
//                                    deal.setName(name);
                                    deal.setCode(discount);
                                    admin.deals.add(deal);
                                    System.out.println("Special Deal added with code: " + deal.getCode());
                                }
                                if (ch == 2) {
                                    sc.nextLine();
                                    System.out.println("Enter code of deal to remove: ");
                                    String name = sc.nextLine();
//                                    admin.removeDeals(name);
//                                    System.out.println("Special deal removed.");
                                    boolean flag = false;
                                    for (SpecialDeal deal : admin.deals) {
                                        if (deal.getCode().equals(name)) {
                                            admin.removeDeals(name);
                                            flag = true;
                                            System.out.println("Special deal removed.");
                                            break;
                                        }
                                    }
                                    if (!flag) {
                                        System.out.println("Code not found.");
                                    }
                                }
                                if (ch == 3) {
                                    if (admin.deals.isEmpty()) {
                                        System.out.println("No special deals added.");
                                    }
                                    for (SpecialDeal deal : admin.deals) {
//                                        System.out.println(deal.getName() + ": ");
                                        System.out.println("Purchase " + deal.getMinAttractions() + " attractions to get a discount of " + deal.getDiscount() + "%.");
                                        System.out.println();
                                    }
                                }
                                if (ch == 4) {
                                    break;
                                }
                            }
                        } else if (m == 6) { //visitor stats
                            // total visitors, total revenue, and most popular attractions
                            Attraction mostPopularAttraction = null;
                            int maxCount = -1;
                            for (Attraction attraction : admin.attractions) {
                                if (attraction.getCount() > maxCount) {
                                    mostPopularAttraction = attraction;
                                    maxCount = attraction.getCount();
                                }
                            }
                            System.out.println("Total Visitors: " + admin.visitors.size());
                            System.out.println("Total Revenue: Rs. " + revenue);
                            if (mostPopularAttraction != null) {
                                System.out.println("Most Popular Attraction: " + mostPopularAttraction.getAt_name());
                            } else {
                                System.out.println("No attractions have been visited yet.");
                            }


                        } else if (m == 7) { //view feedback
                            System.out.println("Feedbacks: ");
                            for (String feedback : admin.feedbacks) {
                                System.out.println(feedback);
                            }
                        } else if (m == 8) {
                            System.out.println("Logged out.");
                            break;
                        }
                    }
                } else {
                    System.out.println("Wrong username or password! Try again");
                }
            } else if (n == 2) {
                Visitor loggedInVisitor = null;

                while (true) {
                    System.out.println("1.Register\n2.Log in\n3.Exit");
//                        sc.nextLine();
                    System.out.print("Enter your choice: ");
                    int p = sc.nextInt();

                    if (p == 1) {

                        System.out.print("Enter visitor name: ");
                        String name = sc.nextLine();
                        sc.nextLine();
                        System.out.print("Enter visitor age: ");
                        int age = sc.nextInt();
                        System.out.print("Enter visitor phone number: ");
                        int phone = sc.nextInt();
                        System.out.print("Enter balance: ");
                        int balance = sc.nextInt();
                        System.out.print("Enter visitor email: ");
                        String email = sc.nextLine();
                        sc.nextLine();
                        System.out.print("Enter visitor password: ");
                        String vis_password = sc.nextLine();

                        Visitor newVisitor = new Visitor(name, email, vis_password, "none", balance, age);
                        admin.addVisitors(newVisitor);
                        System.out.println("Registration successful!");

                    } else if (p == 2) {
//                            sc.nextLine();

                        System.out.print("Enter visitor email: ");
                        String email = sc.nextLine();
                        sc.nextLine();
                        System.out.print("Enter visitor password: ");
                        String vis_password = sc.nextLine();

                        boolean login = false;

                        for (Visitor visitor1 : admin.visitors) {
                            if (visitor1.getEmail().equals(email) && visitor1.getPassword().equals(vis_password)) {
                                loggedInVisitor = visitor1;
                                System.out.println("Login successful!");
                                login = true;
                                break;
                            }
                        }

                        if (login) {
                            while (true) {
                                System.out.println("Visitor Menu:\n1. Explore the Zoo\n2. Buy Membership\n" +
                                        "3. Buy Tickets\n4. View Discounts\n5. View Special Deals\n" +
                                        "6. Visit Animals\n7. Visit Attractions\n8. Leave Feedback\n" +
                                        "9. Log Out\n");

                                System.out.print("Enter your choice: ");
                                int q = sc.nextInt();

                                if (q == 1) { //explore zoo
                                    sc.nextLine();
                                    while (true) {
                                        System.out.println("Explore the Zoo:\n1. View Attractions\n" +
                                                "2. View Animals\n3. Exit\n");
                                        System.out.print("Enter a choice: ");
                                        int ch = sc.nextInt();

                                        if (ch == 1) { //view attractions
                                            for (Attraction attraction : admin.attractions) {
//                                                System.out.print(attraction.getId());
                                                System.out.println(attraction.getAt_name());
                                            }
                                            sc.nextLine();
                                            System.out.print("Select any one attraction: ");
                                            String sel = sc.nextLine();

                                            boolean flag = false;
                                            for (Attraction attraction : admin.attractions) {
                                                if (attraction.getAt_name().equalsIgnoreCase(sel)) {
                                                    System.out.println(attraction.getDescription());
                                                    flag = true;
                                                }
                                            }
                                            if (!flag) {
                                                System.out.println("Attraction not found!");
                                            }
                                        } else if (ch == 2) { //view animals
                                            for (Animal animal : admin.animals) {
                                                System.out.println(animal.getAn_Name());
                                            }
                                        } else if (ch == 3) {
                                            break;
                                        }
                                    }
                                } else if (q == 2) { //buy membership
                                    System.out.println("Buy Membership:\n1. Basic Membership (Rs. 20)\n" +
                                            "2. Premium Membership (Rs. 50)\n");

                                    System.out.print("Enter your choice: ");
                                    int ch = sc.nextInt();

                                    if (ch == 1) { //basic membership
//                                        for (Visitor visitor1: admin.visitors){
                                        if (loggedInVisitor.getMember_type().equalsIgnoreCase("Basic")) {
                                            System.out.println("You are already a basic member.");
                                        } else {
                                            double price = 20.00;
                                            if (loggedInVisitor.getBalance() < price) {
//                                                    System.out.println(visitor.getBalance());
                                                System.out.println("You do not have sufficient balance.");
                                            } else {
                                                if (loggedInVisitor.getBalance() < price) {
                                                    System.out.println("You do not have sufficient balance.");
                                                } else {
//                                                    double price = 0;
                                                    System.out.println("Available discounts: ");
                                                    for (Discount dis : admin.discounts) {
                                                        System.out.println(dis.getCode() + ": " + dis.getDiscount() + "% off.");
                                                    }
                                                    System.out.println("age: "+loggedInVisitor.getAge());
                                                    sc.nextLine();
                                                    System.out.print("Enter the code applicable to you (if none then type NA) or : ");
                                                    String code = sc.nextLine();
                                                    if (code.startsWith("MINOR")) {
                                                        if (loggedInVisitor.getAge() < 18) {
                                                            for (Discount dis : admin.discounts) {
                                                                if (code.equals(dis.getCode())) {
                                                                    price -= (price * (dis.getDiscount() / 100));
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("You are not eligible for this discount.");

                                                        }
                                                    } else if (code.startsWith("SENIOR")) {
                                                        if (loggedInVisitor.getAge() > 60) {
                                                            for (Discount dis : admin.discounts) {
                                                                if (code.equals(dis.getCode())) {
                                                                    price -= (price * (dis.getDiscount() / 100));
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("You are not eligible for this discount.");

                                                        }
                                                    } else if (code.equalsIgnoreCase("NA")) {
                                                        price = 50;
                                                    } else {
                                                        for (Discount dis : admin.discounts) {
                                                            if (code.equals(dis.getCode())) {
                                                                price -= (price * (dis.getDiscount() / 100));
                                                            }
                                                        }
                                                    }
                                                    loggedInVisitor.setBalance(loggedInVisitor.getBalance() - price);
                                                    loggedInVisitor.setMember_type("Basic");
                                                    System.out.println("You are now a basic member. Your new balance is: Rs. " + loggedInVisitor.getBalance());
                                                    revenue += price;
                                                }
                                            }
                                        }
                                    } else if (ch == 2) { //premium membership
//                                        for (Visitor visitor1: admin.visitors){
                                        if (loggedInVisitor.getMember_type().equalsIgnoreCase("Premium")) {
                                            System.out.println("You are already a premium member.");
                                        } else {
                                            double price = 50.00;
                                            if (loggedInVisitor.getBalance() < price) {
                                                System.out.println("You do not have sufficient balance.");
                                            } else {
//                                                        double totalPrice=0;
                                                System.out.println("Available discounts: ");
                                                for (Discount dis : admin.discounts) {
                                                    System.out.println(dis.getCode() + ": " + dis.getDiscount() + "% off.");
                                                }
                                                if (admin.deals.isEmpty()) {
                                                    System.out.println("No discounts available!");
                                                }
                                                sc.nextLine();
                                                System.out.print("Enter the code applicable to you (if none then type NA) or : ");
                                                String code = sc.nextLine();
                                                if (code.startsWith("MINOR")) {
                                                    if (loggedInVisitor.getAge() < 18) {
                                                        for (Discount dis : admin.discounts) {
                                                            if (code.equals(dis.getCode())) {
                                                                price -= (price * (dis.getDiscount() / 100));
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("You are not eligible for this discount.");
                                                        break;
                                                    }
                                                } else if (code.startsWith("SENIOR")) {
                                                    if (loggedInVisitor.getAge() > 60) {
                                                        for (Discount dis : admin.discounts) {
                                                            if (code.equals(dis.getCode())) {
                                                                price -= (price * (dis.getDiscount() / 100));
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("You are not eligible for this discount.");
                                                        break;
                                                    }
                                                } else if (code.equalsIgnoreCase("NA")) {
                                                    price = 50;
                                                } else {
                                                    for (Discount dis : admin.discounts) {
                                                        if (code.equals(dis.getCode())) {
                                                            price -= (price * (dis.getDiscount() / 100));
                                                        }
                                                    }
                                                }
                                                loggedInVisitor.setBalance(loggedInVisitor.getBalance() - price);
                                                loggedInVisitor.setMember_type("Premium");
                                                System.out.println("You are now a premium member. Your new balance is: Rs. " + loggedInVisitor.getBalance());
                                                revenue += price;
                                            }
                                        }
                                    }
                                } else if (q == 3) { // buy tickets (only for basic visitors)
//                                    for (Visitor visitor1 : admin.visitors) {
                                    if (loggedInVisitor.getMember_type().equals("Premium")) {
                                        System.out.println("You are a premium member. You do not need a ticket.");
                                    } else if (loggedInVisitor.getMember_type().equals("Basic")) {
                                        System.out.print("Enter the number of tickets: ");
                                        int num_t = sc.nextInt();
                                        System.out.println("Attractions:");
                                        for (Attraction attraction : admin.attractions) {
                                            System.out.println(attraction.getAt_name() + "(Rs. " + attraction.getPrice() + ")");
                                        }

                                        sc.nextLine();
                                        System.out.println("Select attraction to buy tickets: ");
                                        String sel = sc.nextLine();

                                        loggedInVisitor.addPurchaseAttractions(sel);

                                        double totalPrice = 0;

                                        for (Attraction attraction : admin.attractions) {
                                            if (attraction.getAt_name().equalsIgnoreCase(sel)) {
                                                attraction.setCount();
                                                double basePrice = attraction.getPrice();

                                                // Apply discounts
                                                System.out.println("Available Discounts: ");
                                                for (Discount dis : admin.discounts) {
                                                    System.out.println(dis.getCode() + ": " + dis.getDiscount() + "% off.");
                                                }
                                                if (admin.discounts.isEmpty()) {
                                                    System.out.println("No discounts available!");
                                                }

                                                if (num_t > 1) {
                                                    System.out.println("Available Special Deals: ");
                                                    for (SpecialDeal deal : admin.deals) {
                                                        System.out.println(deal.getCode() + ": Purchase " + deal.getMinAttractions() + " attractions to get " + deal.getDiscount() + "% off.");
                                                    }
                                                    if (admin.deals.isEmpty()) {
                                                        System.out.println("No special deals available!");
                                                    }
                                                }

                                                System.out.print("Enter the code applicable to you (if none then type NA) or : ");
                                                String code = sc.nextLine();
                                                if (code.startsWith("MINOR")) {
                                                    if (loggedInVisitor.getAge() < 18) {
                                                        for (Discount dis : admin.discounts) {
                                                            if (code.equals(dis.getCode())) {
                                                                basePrice -= (basePrice * (dis.getDiscount() / 100));
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("You are not eligible for this discount.");
                                                        break;
                                                    }
                                                } else if (code.startsWith("SENIOR")) {
                                                    if (loggedInVisitor.getAge() > 60) {
                                                        for (Discount dis : admin.discounts) {
                                                            if (code.equals(dis.getCode())) {
                                                                basePrice -= (basePrice * (dis.getDiscount() / 100));
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("You are not eligible for this discount.");
                                                        break;
                                                    }
                                                } else if (code.equalsIgnoreCase("NA")) {
                                                    basePrice = attraction.getPrice();
                                                }
                                                if (num_t > 1) {
                                                    if (code.startsWith("DEALS")) {
                                                        for (SpecialDeal deal : admin.deals) {
                                                            if (code.equals(deal.getCode())) {
                                                                double discountPercentage = deal.getDiscount() / 100.0;
                                                                basePrice -= basePrice * discountPercentage;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    for (Discount dis : admin.discounts) {
                                                        if (code.equals(dis.getCode())) {
                                                            basePrice -= (basePrice * (dis.getDiscount() / 100));
                                                        }
                                                    }
                                                }

                                                for (Discount dis : admin.discounts) {
                                                    if (code.equals(dis.getCode())) {
                                                        double discountPercentage = dis.getDiscount() / 100.0;
                                                        basePrice -= basePrice * discountPercentage;
                                                    }
                                                }
                                                totalPrice += basePrice * num_t;
                                            }
                                        }

                                        // Apply special deals if applicable
                                        for (SpecialDeal deal : admin.deals) {
                                            if (num_t > deal.getMinAttractions()) {
                                                double discountPercentage = deal.getDiscount() / 100.0;
                                                totalPrice -= totalPrice * discountPercentage;
                                            }
                                        }

                                        if (loggedInVisitor.getBalance() < totalPrice) {
                                            System.out.println("Insufficient balance");
                                        } else {
                                            System.out.println("The tickets were purchased successfully. Your total balance is now Rs. " + (loggedInVisitor.getBalance() - totalPrice));
                                            revenue += totalPrice;
//                                                loggedInVisitor.addPurchaseAttractions(sel);
                                            loggedInVisitor.setBalance(loggedInVisitor.getBalance() - totalPrice);
                                        }
                                    } else if (loggedInVisitor.getMember_type().equalsIgnoreCase("none")) {
                                        System.out.println("You have not bought membership yet!");
                                        break;
                                    }
//                                    }
                                } else if (q == 4) { //discounts
                                    System.out.println("Discounts available: ");
                                    for (Discount discount : admin.discounts) {
                                        System.out.println(discount.getCode() + ": " + discount.getDescription());
                                    }
                                } else if (q == 5) { //special deals
                                    if (admin.deals.isEmpty()) {
                                        System.out.println("No special deals added.");
                                    }
                                    for (SpecialDeal deal : admin.deals) {
//                                        System.out.println(deal.getName() + ": ");
                                        System.out.println("Purchase " + deal.getMinAttractions() + " attractions to get a discount of " + deal.getDiscount() + "%.");
                                        System.out.println();
                                    }
                                } else if (q == 6) { //visit animals
                                    //implement
                                    //The visitor will choose to visit an animal, this functionality will, in turn, ask the visitor
                                    // to either choose to feed the animal or read about the animal. Choosing to feed the animal will
                                    // result in the animal making a noise, for example, if you choose to feed a lion it will “Roar”,
                                    // reading about the animal will return a brief passage about the animal’s history.

                                    System.out.println("Animals: ");
                                    for (Animal animal : admin.animals) {
                                        System.out.println(animal.getAn_Name());
                                    }
                                    sc.nextLine();
                                    System.out.print("Enter name to choose the animal: ");
                                    String name = sc.nextLine();
                                    Animal chosen = null;
                                    for (Animal animal : admin.animals) {
                                        if (animal.getAn_Name().equalsIgnoreCase(name)) {
                                            chosen = animal;
                                            break;
                                        }
                                    }
                                    if (chosen != null) {
                                        System.out.println("Do you want to feed the animal or read about the animal? (feed/read): ");
                                        String choice = sc.nextLine();

                                        if (choice.equalsIgnoreCase("feed")) {
                                            chosen.makeSound();
                                            System.out.println("You fed the animal.");
                                        }
                                        if (choice.equalsIgnoreCase("read")) {
                                            System.out.print("History of the animal:");
                                            chosen.an_history();
                                        }
                                    }
                                } else if (q == 7) { // visit attractions
                                    System.out.println("Attractions: ");
                                    for (Attraction attraction : admin.attractions) {
                                        if (attraction.isOpen() == true) {
                                            System.out.println(attraction.getAt_name());
                                        }
                                    }
                                    sc.nextLine();
                                    System.out.print("Enter name to choose the attraction: ");
                                    String name = sc.nextLine();
                                    Attraction chosen = null;
                                    for (Attraction attraction : admin.attractions) {
                                        if (attraction.isOpen() == true) {
                                            if (attraction.getAt_name().equalsIgnoreCase(name)) {
                                                chosen = attraction;
                                                break;
                                            }
                                        }
                                    }
                                    if (chosen != null) {
//                                        for (Visitor visitor1 : admin.visitors) {
                                        if (admin.isOpen()) {
                                            if (loggedInVisitor.getMember_type().equals("Premium")) {
                                                System.out.println("Thank you for visiting " + chosen.getAt_name() + ". Hope you enjoyed!");
                                            } else if (loggedInVisitor.getMember_type().equals("Basic")) {
                                                if (loggedInVisitor.hasPurchasedTicket(chosen.getAt_name())) {
                                                    System.out.println("Thank you for visiting " + chosen.getAt_name() + ". Hope you enjoyed!");
                                                    loggedInVisitor.purchasedAttractions.remove(chosen.getAt_name());
                                                } else {
                                                    System.out.println("Ticket not available. Basic members need to buy separate tickets.");
                                                }
                                            }
                                        }
//                                        }
                                    } else {
                                        System.out.println("Attraction is either not open or does not exist.");
                                    }
                                } else if (q == 8) { //feedback
                                    sc.nextLine();
                                    System.out.println("Leave feedback: ");
                                    String note = sc.nextLine();

//                                    for (Visitor visitor1 : admin.visitors) {
                                    admin.feedbacks.add(note);
//                                    }
                                } else if (q == 9) { //logging out
                                    System.out.println("Logged out");
                                    loggedInVisitor = null;
                                    break;
                                }
                            }
                        }

                    }
                    else if(p==3){
                        break;
                    }
                }
            }
            else if(n==3){
                if (admin.deals.isEmpty()) {
                    System.out.println("No special deals added.");
                }
                for (SpecialDeal deal : admin.deals) {
//                                        System.out.println(deal.getName() + ": ");
                    System.out.println("Purchase " + deal.getMinAttractions() + " attractions to get a discount of " + deal.getDiscount() + "%.");
                    System.out.println();
                }
            }
            else if(n==4){
                System.out.println("Thank you for visiting!");
                return;
            }
        }
    }
}

