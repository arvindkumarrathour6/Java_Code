package Hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms;

    public Hotel(int numRooms) {
        rooms = new ArrayList<>();
        for (int i = 0; i < numRooms; i++) {
            rooms.add(new Room(i + 1));
        }
    }

    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                System.out.println("Room Number: " + room.getRoomNumber());
            }
        }
    }

    public boolean reserveRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && !room.isOccupied()) {
                room.setOccupied(true);
                System.out.println("Room " + roomNumber + " has been reserved.");
                return true;
            }
        }
        System.out.println("Room " + roomNumber + " is either occupied or doesn't exist.");
        return false;
    }

    public void cancelReservation(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && room.isOccupied()) {
                room.setOccupied(false);
                System.out.println("Reservation for Room " + roomNumber + " has been cancelled.");
                return;
            }
        }
        System.out.println("Room " + roomNumber + " is not currently reserved.");
    }
}

