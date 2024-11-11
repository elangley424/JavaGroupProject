
import java.util.HashMap;
import java.util.HashSet;

public class RoomInfo {
    private HashMap<Integer, HashSet<Integer>> availableRooms;
    private int numberOfBeds;
    private boolean isAvailable;

    public RoomInfo(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
        this.availableRooms = new HashMap<>();
        initializeRooms();
    }

    // Initialize all rooms on each floor
    private void initializeRooms() {
        int roomNumber = 101;  // Starting room number (e.g., 101 for first floor, first room)
        
        // Create 50 rooms, 10 rooms per floor
        for (int floor = 1; floor <= 5; floor++) {
            for (int i = 1; i <= 5; i++) {  // 5 one-bedroom rooms per floor
                availableRooms.put(roomNumber, 1);  // 1 bed
                roomNumber++;
            }
            for (int i = 1; i <= 5; i++) {  // 5 two-bedroom rooms per floor
                availableRooms.put(roomNumber, 2);  // 2 beds
                roomNumber++;
            }
        }
    }

    // Check room availability based on number of beds and floor
    public boolean isRoomAvailable(int floor) {
        HashSet<Integer> rooms = availableRooms.get(floor);
        if (rooms != null && rooms.size() > 0) {
            return true;
        }
        return false;
    }

    // Reserve a room
    public boolean reserveRoom(int floor) {
        HashSet<Integer> rooms = availableRooms.get(floor);
        if (rooms != null && !rooms.isEmpty()) {
            // Get the first room by iterating through the set
            for (Integer roomNumber : rooms) {
                rooms.remove(roomNumber);  // Remove the first room
                return true;  // Return true to indicate the room was reserved
            }
        }
        return false;  // Return false if no room was available
    }
    
    

    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");
        for (int floor : availableRooms.keySet()) {
            System.out.println("Floor " + floor + ": " + availableRooms.get(floor).size() + " rooms available");
        }
    }
}