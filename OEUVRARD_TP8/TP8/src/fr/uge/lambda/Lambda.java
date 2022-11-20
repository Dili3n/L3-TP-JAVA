package fr.uge.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lambda {

	public static void toUpperCas(List <String> list) {
		list.replaceAll(s -> s.toUpperCase(Locale.ROOT));
	}
	
	public static Map<String, Integer> occurences (List<String> list){
		var map = new HashMap<String, Integer>();
		list.forEach(s -> map.merge(s,  1, (a, b) -> a+b));
		return map;		
	}
	
	public static Map<String, Integer> occurences2(List<String> list){
    var map = new HashMap<String, Integer>();
		list.forEach(s -> map.merge(s, 1, Integer::sum));
		return map;
	}
	
	public static Map<String, Long> occurences3(List<String> list){
    return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
	
}
