/*import java.util.ArrayList;*/
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Library {
	
	private LinkedHashMap<String, Book> books;
	
	public Library() {
		books = new LinkedHashMap<>();
	}
	
	public void add(Book book) {
		Objects.requireNonNull(book);
		var book2 = new Book(book.title(), book.author());
  	books.put(book.title(), book2);
	}
	
	public Book findByTitle(String titre) {
		
		return books.get(titre);
		
	}
	
	
	public void removeAllBooksFromAuthor(String author) {
		
		/*for (var entry : books.entrySet()) {
			var key = entry.getKey();
			var value = entry.getValue();
			if (value.author().equals(author)) {
				books.remove(key);
			}
		}*/
		
		var iterator = books.entrySet().iterator();
		while(iterator.hasNext()) {
			var value = iterator.next();
			if(value.getValue().author().equals(author)) {
				iterator.remove();
			}
		}
		
	}
	
	public String toString() {
		
		var livre = new StringBuilder();
		
		for (var values : books.values()) {
			livre.append(values).append("\n");
		}
		
		return livre.toString();
	}
}

/*private ArrayList<Book> books;

public Library() { 
	books = new ArrayList<>(); 
}

public void add(Book book) {
	Objects.requireNonNull(book);
	books.add(book);
}

public Book findByTitle(String titre) {
	
	for(var elem : books) {
		if (elem.title().equals(titre)) {
			return elem;
		}
	}
	return null;
}
  
public String toString() {
	
	var livre = new StringBuilder();
	
	for(var elem : books) {
		livre.append(elem).append("\n");
	}
	
	return livre.toString();
}*/
