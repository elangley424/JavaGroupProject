import java.util.ArrayList;

public class Amenities {
    private ArrayList<String> selectedAmenities;

    public Amenities() {
        selectedAmenities = new ArrayList<>();
    }

    public void addAmenity(String amenity) {
        selectedAmenities.add(amenity);
    }

    public void displayAmenities() {
        System.out.println("Selected Amenities: " + selectedAmenities);
    }

    public ArrayList<String> getAmenities() {
        return selectedAmenities;
    }
}