package fr.uge.manifest;

import java.util.Objects;

public record Passager(String destination) implements Item {
	
	public Passager {
		Objects.requireNonNull(destination);
	}
	
	@Override
	public String destination() {
		return destination;
	}
	
	@Override
	public int weight() {
		return 0;
	}
	
	@Override
	public boolean isContainer() {
		return false;
	}
	
	@Override
	public int price() {
		return 10;
	}
	
	@Override 
	public String toString() {
		return destination + " (passager) ";
	}
	
	
}
