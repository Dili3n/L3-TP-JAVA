package fr.uge.stream;

import java.util.ArrayList;
import java.util.List;

public class Streams {
	
	public static List<String> namesOfTheAdults(List<Person> persons) {
		return persons.stream()
							 .filter(p -> p.age()>=18)
							 .map(Person::name)
							 .toList();
	}
	
  public static List<String> namesOfTheAdultsBeta(List<Person> persons) {
    var names = new ArrayList<String>();
    for(var person: persons) {
      if (person.age() >= 18) {
        names.add(person.name());
      }
    }
    return names;
  }
}