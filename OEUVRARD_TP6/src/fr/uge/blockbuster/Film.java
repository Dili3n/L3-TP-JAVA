package fr.uge.blockbuster;

import java.time.Duration;
import java.util.Objects;

public interface Film {
	
	String LASER_DISC = "LaserDisc";
	String VIDEO_TAPE = "VideoTape";
	static Film fromText(String text) {
		Objects.requireNonNull(text);
		var tab = text.split(":");
		System.out.println(tab[0]);
		return switch(tab[0]) {
		  case LASER_DISC -> new LaserDisc(tab[1]);
		  case VIDEO_TAPE -> new VideoTape(tab[1],Duration.ofMinutes(Long.parseLong(tab[2])));
		  default -> throw new IllegalStateException();
		};
	}
	
	abstract String toText();
	String name();
}
