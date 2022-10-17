package fr.uge.manifest;

import java.util.Objects;

public record Container(String destination, int weight) implements Item {
	
	public Container {
		Objects.requireNonNull(destination);
		if(weight < 0) {
			throw new IllegalArgumentException("weight < 0");
		}
	}
	
	@Override
	public String destination() {
		return destination;
	}
	
	@Override
	public boolean isContainer() {
		return true;
	}
	
	@Override
	public int price() {
		return weight * 2;
	}
	
	@Override
  public String toString() {
		
		var str = new StringBuilder();
		str.append(destination).append(" ").append(weight).append("kg");
		return str.toString();
	}

}
