package fr.uge.monopoly;

public record Hotel(int rooms, double efficiency) implements Asset {
	
	
	public Hotel {
		if (rooms < 0) {
			throw new IllegalArgumentException("rooms >= 0");
		}
		if (efficiency < 0 || efficiency > 1) {
			throw new IllegalArgumentException("0 < efficiency < 1");
		}
	}
	
	public double getEfficiency() {
		return efficiency;
	}
	
	public int pricePerNight() {
		return (int) (100 * rooms * efficiency);
	}
	
	@Override 
	public String toString() {
		return "Hotel " + rooms + " rooms " + efficiency;
	}

}
