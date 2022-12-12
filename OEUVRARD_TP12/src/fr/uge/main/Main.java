package fr.uge.main;

import java.util.ArrayList;
import java.util.List;

import fr.uge.monopoly.Apartment;
import fr.uge.monopoly.AssetManager;
import fr.uge.monopoly.Hotel;

public class Main {

	public static void main(String[] args) {
	  var hotel = new Hotel(5, 0.75);
	  System.out.println(hotel);  // Hotel 5 rooms 0.75
    var apartment = new Apartment(30, List.of("Bony", "Clyde"));
    System.out.println(apartment); // Apartment 30 m2 with Bony, Clyde 1.
    var list = new ArrayList<String>();
    list.add("Bob");
    var apartment2 = new Apartment(50, list);
    list.remove("Bob");
    System.out.println(apartment2);  // Apartment 50 m2 with Bob 0.5
    var hotel2 = new Hotel(5, 0.75);
    var apartment3 = new Apartment(30, List.of("Bony", "Clyde"));
    var manager = new AssetManager();
    manager.add(hotel2);
    manager.add(apartment3);
    System.out.println(manager.profitPerNight());  // 415
    var hotel5 = new Hotel(5, 0.75);
    var apartment5 = new Apartment(30, List.of("Bony", "Clyde"));
    var manager5 = new AssetManager();
    manager5.add(hotel5);
    manager5.add(apartment5);
    System.out.println(manager5); // affiche
    // Hotel 5 rooms 0.75
    // Apartment 30 m2 with Bony, Clyde 1.0
    var hotel6 = new Hotel(5, 0.75);
    var apartment6 = new Apartment(30, List.of("Bony", "Clyde"));
    var manager6 = new AssetManager();
    manager6.add(hotel6);
    manager6.add(apartment6);
    System.out.println(manager6.lowestEfficiency(0.8));  // [Hotel 5 rooms 0.75]
    var hotel7 = new Hotel(5, 0.75);
    var apartment7 = new Apartment(30, List.of("Bony", "Clyde"));
    var manager7 = new AssetManager();
    manager7.add(hotel7);
    manager7.add(apartment7);
    manager7.remove(0.8);
    System.out.println(manager7);  // affiche
    // Apartment 30 m2 with Bony, Clyde 1.0
	}
}
