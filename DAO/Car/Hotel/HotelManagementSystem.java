package Hotel;

public class HotelManagementSystem {
    public static void main(String[] args) {
        int totalRooms = 10; // Number of rooms in the hotel
        Hotel hotel = new Hotel(totalRooms);

        hotel.displayAvailableRooms();

        // Reserving rooms
        hotel.reserveRoom(3);
        hotel.reserveRoom(5);

        hotel.displayAvailableRooms();

        // Canceling reservations
        hotel.cancelReservation(5);
        hotel.cancelReservation(7);
    }
}