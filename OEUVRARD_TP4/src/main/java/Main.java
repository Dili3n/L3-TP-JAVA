
public class Main {
	
  public static void main(String[] args) {
    System.out.println("Hello Eclipse");
    var book = new Book("Da Vinci Code", "A");
    var book2 = new Book("Les Miserables", "Victor Hugo");
    var library = new Library();
    
    library.add(book);
    library.add(book2);
    
    System.out.println(library.findByTitle("Da Vinci Code")); 
    System.out.println("\nListe des livres :\n");
    System.out.println(library.toString());
    
    var library2 = new Library();
    library2.add(new Book("Da Vinci Code", "Dan Brown"));
    library2.add(new Book("Angels & Demons", "Dan Brown"));
    System.out.println("\nListe des livres Library 2 :\n");
    System.out.println(library2.toString());
    library2.removeAllBooksFromAuthor("Dan Brown");
    System.out.println("\nListe des livres Library 2 :\n");
    System.out.println(library2.toString());
    
  }
}