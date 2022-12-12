package fr.uge.monopoly;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public record Apartment(int area, List<String> person) implements Asset {
	
	public Apartment {
		Objects.requireNonNull(person);
		if (area < 1) {
			throw new IllegalArgumentException("area > 0");
		}
		person = List.copyOf(person);
	}
	
	public double getEfficiency() {
		if (person.size() == 1) {
			return 0.5;
		}
		return 1.0;
	}
	
	public int pricePerNight() {
		return (int) (20 * person.size() * getEfficiency());
	}
	
	@Override
	public String toString() {
		var sb = new StringBuilder();
		sb.append("Apartment ").append(area).append(" m2 with ");
		sb.append(person.stream().collect(Collectors.joining(", ")));
		sb.append(" ").append(getEfficiency());
		return sb.toString();
	}
	
}
