package fr.uge.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public record Actor(String firstName, String lastName) {
  public Actor {
    Objects.requireNonNull(firstName);
    Objects.requireNonNull(lastName);
  }
  
  public static Map<String, ArrayList<String>> actorGroupFirstName(List<Actor> list){
  	
  	var map = new HashMap<String, ArrayList<String>>();

    list.forEach(s->map.computeIfAbsent(s.firstName(), k->new ArrayList<>()).add(s.lastName()));

    return map;
  	
  }

  public static Map<String, List<Actor>> actorGroupBy(List<Actor> list, Function<Actor, String> f){
  	
  	var map = new HashMap<String, List<Actor>>();

    list.forEach(s->map.computeIfAbsent(f.apply(s), k->new ArrayList<>()).add(s));

    return map;
  	
  }

  public static <U, T> Map<U, List<T>> groupBy(List<T> list, Function<T, U> f){
  	
  	var map = new HashMap<U, List<T>>();

    list.forEach(s->map.computeIfAbsent(f.apply(s), k->new ArrayList<>()).add(s));

    return map;
  	
  }

  public static void main(String[] args){
    var list = new ArrayList<Actor>();
    list.add(new Actor("bob", "de niro"));
    list.add(new Actor("bob", "cat"));
    list.add(new Actor("willy", "cat"));
    System.out.println(actorGroupFirstName(list));
    var group1 = actorGroupBy(list, Actor::firstName);  // groupe par prénom
    System.out.println(group1);
    var group2 = actorGroupBy(list, Actor::lastName);   // groupe par nom
    System.out.println(group2);
    var group3 = groupBy(list, Actor::firstName);   // groupe par nom
    System.out.println(group3);
    
  }
  
}
