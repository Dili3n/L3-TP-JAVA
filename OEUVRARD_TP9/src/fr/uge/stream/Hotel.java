package fr.uge.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.TreeMap;
import java.util.stream.Collectors;

public record Hotel(String name, List<Room> rooms) {
		
	public Hotel {
		Objects.requireNonNull(name);
		Objects.requireNonNull(rooms);
		rooms = List.copyOf(rooms);
	}
	
	public String roomInfo() {
		return rooms.stream()
				        .map(Room::name)
				        .collect(Collectors.joining(", "));

  }
	public String roomInfoSortedByFloor() {
		return rooms.stream()
								.sorted(Comparator.comparing(Room::floor))
								.map(Room::name)
								.collect(Collectors.joining(", "));
	}
	
	public Double averagePrice() {
		return rooms.stream()
								.mapToLong(Room::price)
								.average()
								.orElse(Double.NaN);
								
	}
	
	public Optional<Room> roomForPrice1(int price) {
		return rooms.stream().filter(r -> r.price() <= price)
												 .sorted(Comparator.comparingLong(Room::price).reversed())
												 .findFirst();
	}

	public Optional<Room> roomForPrice2(int price){
		return rooms.stream().filter(r -> r.price() <= price)
												 .max(Comparator.comparingLong(Room::price));
	}
	
	public static List<String> expensiveRoomNames(List<Hotel> hotels) {
    return hotels.stream().flatMap(h -> h.rooms.stream()
          																		 .sorted(Comparator.comparingLong(Room::price).reversed())
          																		 .limit(2))
										      .map(Room::name)
										      .collect(Collectors.toList());
  }
	
  public Map<Integer, List<Room>> roomInfoGroupedByFloor() {
    return rooms.stream().collect(Collectors.groupingBy(Room::floor));
  }

  public Map<Integer, List<Room>> roomInfoGroupedByFloorInOrder() {
    return rooms.stream()
    						.collect(Collectors.groupingBy(Room::floor, TreeMap::new, Collectors.toList()));
  }
}
