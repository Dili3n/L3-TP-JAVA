/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;*/
import java.util.LinkedHashMap;
import java.util.Objects;

public class Library {
	
	private final LinkedHashMap<String, Book> books;
	
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
		
		var iterator = books.entrySet().iterator();
		while(iterator.hasNext()) {
			var value = iterator.next();
			if(value.getValue().author().equals(author)) {
				iterator.remove();
			}
		}
		
	}
	
	@Override
	public String toString() {
		
		var livre = new StringBuilder();
		
		for (var values : books.values()) {
			livre.append(values).append("\n");
		}
		
		return livre.toString();
	}
}
