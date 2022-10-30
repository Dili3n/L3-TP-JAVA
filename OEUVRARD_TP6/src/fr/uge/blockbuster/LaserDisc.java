package fr.uge.blockbuster;

import java.util.Objects;

public record LaserDisc(String name) implements Film {
	
	public LaserDisc {
		Objects.requireNonNull(name);
	}
	
	@Override
	public String toText() {
		var str = new StringBuilder();
		str.append("LaserDisc:").append(name);
		return str.toString();
	}
	
}
