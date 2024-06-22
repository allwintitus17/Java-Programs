import java.util.Scanner;

public class BusApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("IPCS BUS BOOKING SYSTEM!!");
        int busDetails[][] = {
            {20, 25},
            {25, 45},
            {30, 55}
        };
        String srcDest[][] = {
            {"Chennai", "Bangalore", "101"},
            {"Trivandrum", "Goa", "102"},
            {"Bangalore", "Salem", "103"}
        };

        int choice;
        System.out.println("ENTER THE CHOICE:");
        System.out.println("1. Display Bus Details");
        System.out.println("2. Book a Travel");
        choice = sc.nextInt();

        switch (choice) {
            case 1 -> Display_Bus(busDetails, srcDest);
            case 2 -> book_tickets(busDetails, srcDest, sc);
            default -> System.out.println("Enter the correct option");
        }
    }

    public static void Display_Bus(int busDetails[][], String srcDest[][]) {
        System.out.println("Display Bus details");
        for (int i = 0; i < srcDest.length; i++) {
            System.out.println("Bus No: " + srcDest[i][2]);
            System.out.println("Source: " + srcDest[i][0]);
            System.out.println("Destination: " + srcDest[i][1]);
            System.out.println("Available Seats: " + busDetails[i][0]);
            System.out.println("Ticket Price: $" + busDetails[i][1]);
            System.out.println();
        }
    }

    public static void book_tickets(int busDetails[][], String srcDest[][], Scanner sc) {
        System.out.print("Enter the Name of the passenger: ");
        String name = sc.next();
        System.out.println("Available Routes:");
        for (int i = 0; i < srcDest.length; i++) {
            System.out.println((i + 1) + ". " + srcDest[i][0] + " to " + srcDest[i][1] + " (Bus No: " + srcDest[i][2] + ")");
        }
        System.out.print("Enter the route number to book: ");
        int route = sc.nextInt();
        
        if (route < 1 || route > srcDest.length) {
            System.out.println("Invalid route number. Booking failed.");
            return;
        }

        route--; 
        System.out.print("Enter the number of seats to book: ");
        int seats = sc.nextInt();

        if (seats <= 0 || seats > busDetails[route][0]) {
            System.out.println("Invalid number of seats. Booking failed.");
            return;
        }

        busDetails[route][0] -= seats; 

        System.out.println("Booking successful!");
        System.out.println("Passenger Name: " + name);
        System.out.println("Route: " + srcDest[route][0] + " to " + srcDest[route][1]);
        System.out.println("Seats Booked: " + seats);
        System.out.println("Total Price: $" + (seats * busDetails[route][1]));
    }
}
