import java.util.ArrayList;
import java.util.Scanner;

class Room {
    private int roomNumber;
    private String type; // e.g., Single, Double, Suite
    private boolean isAvailable;

    public Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + " (" + type + ") - " + (isAvailable ? "Available" : "Not Available");
    }
}

class Booking {
    private int roomNumber;
    private String guestName;

    public Booking(int roomNumber, String guestName) {
        this.roomNumber = roomNumber;
        this.guestName = guestName;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + " booked by " + guestName;
    }
}

class Hotel {
    private ArrayList<Room> rooms;
    private ArrayList<Booking> bookings;

    public Hotel() {
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("Room added: " + room);
    }

    public void viewRooms() {
        System.out.println("=== Room List ===");
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

    public void bookRoom(int roomNumber, String guestName) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
                room.setAvailable(false);
                Booking booking = new Booking(roomNumber, guestName);
                bookings.add(booking);
                System.out.println("Room booked: " + booking);
                return;
            }
        }
        System.out.println("Room not available for booking.");
    }

    public void viewBookings() {
        System.out.println("=== Booking List ===");
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
        } else {
            for (Booking booking : bookings) {
                System.out.println(booking);
            }
        }
    }

    public void checkOut(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && !room.isAvailable()) {
                room.setAvailable(true);
                bookings.removeIf(booking -> booking.toString().contains("Room " + roomNumber));
                System.out.println("Checked out from Room " + roomNumber);
                return;
            }
        }
        System.out.println("Room not found or already available.");
    }
}

public class HotelManagementSystem {
    private Hotel hotel;
    private Scanner scanner;

    public HotelManagementSystem() {
        hotel = new Hotel();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("=== Hotel Management System ===");
        System.out.println("1. Add Room");
        System.out.println("2. View Rooms");
        System.out.println("3. Book Room");
        System.out.println("4. View Bookings");
        System.out.println("5. Check Out");
        System.out.println("6. Exit");
        System.out.print("Choose an option: ");
    }

    public void addRoom() {
        System.out.print("Enter room number: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter room type (Single/Double/Suite): ");
        String type = scanner.nextLine();
        Room newRoom = new Room(roomNumber, type);
        hotel.addRoom(newRoom);
    }

    public void viewRooms() {
        hotel.viewRooms();
    }

    public void bookRoom() {
        System.out.print("Enter room number to book: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter guest name: ");
        String guestName = scanner.nextLine();
        hotel.bookRoom(roomNumber, guestName);
    }

    public void viewBookings() {
        hotel.viewBookings();
    }

    public void checkOut() {
        System.out.print("Enter room number to check out: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        hotel.checkOut(roomNumber);
    }

    public void run() {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    addRoom();
                    break;
                case 2:
                    viewRooms();
                    break;
                case 3:
                    bookRoom();
                    break;
                case 4:
                    viewBookings();
                    break;
                case 5:
                    checkOut();
                    break;
                case 6:
                    System.out.println("Exiting the system. Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        HotelManagementSystem hms = new HotelManagementSystem();
        hms.run();
    }
}