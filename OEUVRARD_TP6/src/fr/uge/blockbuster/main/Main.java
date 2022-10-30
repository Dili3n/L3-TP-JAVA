package fr.uge.blockbuster.main;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.time.Duration;

import fr.uge.blockbuster.Catalog;
import fr.uge.blockbuster.Film;
import fr.uge.blockbuster.LaserDisc;
import fr.uge.blockbuster.VideoTape;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
    var laserDisc = new LaserDisc("Jaws");
    var videoTape = new VideoTape("The Cotton Club", Duration.ofMinutes(128));
    var videoTape2 = new VideoTape("Mission Impossible", Duration.ofMinutes(110));
    var catalog = new Catalog();
    System.out.println("\n\tQuestion 2 : add()\n");
    catalog.add(laserDisc);
    catalog.add(videoTape);
    catalog.add(videoTape2);
    // catalog.add(new LaserDisc("Mission Impossible"));  // exception !
    System.out.println("\n\tQuestion 2 : lookup()\n");
    System.out.println(catalog.lookup("Jaws"));
    System.out.println(catalog.lookup("The Cotton Club"));
    System.out.println(catalog.lookup("Indiana Jones"));
    
    System.out.println("\n\tQuestion 3 : toText()\n");
    var laserDiscText = laserDisc.toText();
    var videoTapeText = videoTape.toText();
    System.out.println(laserDiscText);  // LaserDisc:Jaws
    System.out.println(videoTapeText);  // VideoTape:The Cotton Club:128
    
    System.out.println("\n\tQuestion 3 : fromText()\n");
    var laserDisc2 = Film.fromText(laserDiscText);
    var videoTape3 = Film.fromText(videoTapeText);
    System.out.println(laserDisc.equals(laserDisc2));  // true
    System.out.println(videoTape.equals(videoTape3));  // true
    
    System.out.println("\n\tQuestion 4 : ()\n");
    
    var catalog2 = new Catalog();
    catalog2.add(laserDisc);
    catalog2.add(videoTape);
    catalog2.save(Path.of("catalog.txt"));
    
    var catalog3 = new Catalog();
    catalog3.load(Path.of("catalog.txt"));
    System.out.println(catalog3.lookup("Jaws").toText());  // LaserDisc:Jaws
    System.out.println(catalog3.lookup("The Cotton Club").toText());  // VideoTape:The Cotton Club:128
    
    var catalog4 = new Catalog();
    catalog4.add(new LaserDisc("A Fistful of €"));
    catalog4.add(new VideoTape("For a Few €s More", Duration.ofMinutes(132)));
    catalog4.save(Path.of("catalog-windows-1252.txt"), Charset.forName("Windows-1252"));

    var catalog5 = new Catalog();
    catalog5.load(Path.of("catalog-windows-1252.txt"), Charset.forName("Windows-1252"));
    System.out.println(catalog5.lookup("A Fistful of €").toText());
    System.out.println(catalog5.lookup("For a Few €s More").toText());
	}

}
