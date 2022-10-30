package fr.uge.blockbuster;

import java.time.Duration;
import java.util.Objects;

public record VideoTape(String name, Duration ofMinutes) implements Film {

	public VideoTape {
		Objects.requireNonNull(name);
		Objects.requireNonNull(ofMinutes);
		
	}
	
	@Override
	public String toText() {
		var str = new StringBuilder();
		str.append("VideoTape:").append(name).append(":").append(ofMinutes.toMinutes());
		return str.toString();
	}

}
