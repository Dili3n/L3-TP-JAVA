package fr.uge.manifest.main;

import fr.uge.manifest.*;

public class Main {

  public static void main(String[] args) {
    var container = new Container("Germany", 500);
    System.out.println(container.destination());  // Germany
    System.out.println(container.weight());  // 500
    var container2 = new Container("Italy", 400);
    var container3 = new Container("Austria", 200);
    var manifest = new Manifest();
    manifest.add(container2);
    manifest.add(container3);
    System.out.println(manifest.weight());  // 600
    var container4 = new Container("Spain", 250);
    var container5 = new Container("Swiss", 200);
    var manifest2 = new Manifest();
    manifest2.add(container4);
    manifest2.add(container5);
    System.out.println(manifest2);
    // 1. Spain 250kg
    // 2. Swiss 200kg
    var passenger1 = new Passager("France");
    var container6 = new Container("England", 350);
    var manifest3 = new Manifest();
    manifest3.add(passenger1);
    manifest3.add(container6);
    System.out.println(manifest3);
    // 1. France (passenger)
    // 2. England 350kg
    System.out.println(manifest3.price()); // 710
    var container8 = new Container("Russia", 450);
    var container9 = new Container("China", 200);
    var container10 = new Container("Russia", 125);
    var passenger2 = new Passager("Russia");
    var manifest4 = new Manifest();
    manifest4.add(container8);
    manifest4.add(container9);
    manifest4.add(container10);
    manifest4.add(passenger2);
    manifest4.removeAllContainersFrom("Russia");
    System.out.println(manifest4);
    // 1. China 200kg
    // 2. Russia (passenger)
    var container11 = new Container("Monaco", 100);
    var passenger3 = new Passager("Paris");
    var container13 = new Container("Monaco", 300);
    var container12 = new Container("Luxembourg", 200);
    var manifest8 = new Manifest();
    manifest8.add(container11);
    manifest8.add(container12);
    manifest8.add(container13);
    manifest8.add(passenger3);
    System.out.println(manifest8.weightPerDestination());
    // {Monaco=400, Paris=0, Luxembourg=200}
  }
	
}
