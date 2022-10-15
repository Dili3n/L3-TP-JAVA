
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


/*

javap -c Library.class

dilien.oeuvrard@pccop2b201-18:~/Bureau/JAVA/TP4/build/classes$ javap -c Library.class
Compiled from "Library.java"
public class Library {
  public Library();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #14                 // class java/util/ArrayList
       8: dup
       9: invokespecial #16                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #17                 // Field books:Ljava/util/ArrayList;
      15: return

  public void add(Book);
    Code:
       0: aload_1
       1: invokestatic  #25                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_0
       6: getfield      #17                 // Field books:Ljava/util/ArrayList;
       9: aload_1
      10: invokevirtual #31                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      13: pop
      14: return

  public Book findByTitle(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #17                 // Field books:Ljava/util/ArrayList;
       4: invokevirtual #38                 // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
       7: astore_3
       8: goto          34
      11: aload_3
      12: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      17: checkcast     #48                 // class Book
      20: astore_2
      21: aload_2
      22: invokevirtual #50                 // Method Book.title:()Ljava/lang/String;
      25: aload_1
      26: invokevirtual #54                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      29: ifeq          34
      32: aload_2
      33: areturn
      34: aload_3
      35: invokeinterface #59,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      40: ifne          11
      43: aconst_null
      44: areturn
}

*/