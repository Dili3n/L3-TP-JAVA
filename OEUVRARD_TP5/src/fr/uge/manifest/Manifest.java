package fr.uge.manifest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Manifest {

	private final ArrayList<Item> dest;
	
	public Manifest() {
		dest = new ArrayList<>();
	}
	
	public int weight() {
		var res = 0;
		for(var elem : dest) {
			res += elem.weight();
		}
		return res;
	}
	
	public void add(Item c) {
		Objects.requireNonNull(c);
		dest.add(c);
	}
	
	public void removeAllContainersFrom(String destination) {
		
		var iterator = dest.iterator();
		while(iterator.hasNext()) {
			var value = iterator.next();
			if(destination.equals(value.destination())){
				if(isContainer(value)) {
					iterator.remove();
				}
			}
		}
	}
	
	public boolean isContainer(Item c) {
		return c.isContainer();
	}
	
	
	public HashMap<String, Integer> weightPerDestination(){
		var map = new HashMap<String, Integer>();
		for(var elem : dest) {
			if(!map.containsKey(elem.destination())) {
				map.put(elem.destination(), elem.weight());
			} else {
				var newWeight = map.get(elem.destination());
				map.put(elem.destination(), Integer.valueOf(newWeight.intValue() + elem.weight()));
			}
		}
		return map;
	}
	
	@Override
  public String toString() {
		var str = new StringBuilder();
		var indice = 1;
		for (var elem : dest) {
		  str.append(indice).append(". ").append(elem).append("\n");
		  indice += 1;
		}
		return str.toString();
	}

	public int price() {
		int tax = 0;
		for (var elem : dest) {
			tax = tax + elem.price();		
		}
		return tax;
	}
	
}
