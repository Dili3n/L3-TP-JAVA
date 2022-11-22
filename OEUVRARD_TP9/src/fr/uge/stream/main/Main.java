package fr.uge.stream.main;

import java.util.List;

import fr.uge.stream.*;

public class Main {

  public static void main(String[] args) {
    var persons = List.of(
      new Person("Ana", 21),
      new Person("John", 17),
      new Person("Liv", 29));
    var names = Streams.namesOfTheAdults(persons);
    System.out.println(names);
  
	  var hotel = new Hotel("paradisio", List.of(
	    new Room("blue", 100, 100),
	    new Room("yellow", 110, 200),
	    new Room("fuchsia", 120, 300),
	    new Room("red", 100, 200),
	    new Room("green", 100, 200)
	  ));
	  System.out.println(hotel.roomInfo());
	  System.out.println(hotel.roomInfoSortedByFloor());
	  System.out.println(hotel.averagePrice());
	  System.out.println(hotel.roomForPrice1(250));  // Optional[Room[name=yellow, floor=110, price=200]]
	  System.out.println(hotel.roomForPrice2(250));  // Optional[Room[name=yellow, floor=110, price=200]]
	  
    var hotel2 = new Hotel("fantastico", List.of(
        new Room("queen", 1, 200),
        new Room("king", 1, 500)
        ));
    System.out.println(Hotel.expensiveRoomNames(List.of(hotel, hotel2)));  // [fuchsia, yellow, king, queen]
    System.out.println(hotel.roomInfoGroupedByFloor());
    // {100=[Room[name=blue, ...], Room[name=red, ...], Room[name=green, ...]], 
    //  120=[Room[name=fuchsia, ...]], 110=[Room[name=yellow, ...]]}
	  
  
  }
	
}
