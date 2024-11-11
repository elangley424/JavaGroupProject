
public class PriceInfo {

	    private int basePrice;

	    public PriceInfo() {
	        this.basePrice = 100; // Base price for calculations
	    }

	    // Calculate price based on floor and beds
	    public int calculatePrice(int floor, int beds) {
	        int floorMultiplier = floor * 50; // Higher floors have higher costs
	        int bedMultiplier = beds * 20;
	        return basePrice + floorMultiplier + bedMultiplier;
	    }

	    public void displayPrice(int floor, int beds) {
	        int price = calculatePrice(floor, beds);
	        System.out.println("Price for " + beds + "-bed room on floor " + floor + ": $" + price);
	    }
	}

