public class Main {

  public static void main(String[] args){

    var book = new Book("Da Vinci Code");
    System.out.println(book.title() + ' ' + book.author());
    /* Changement du titre Da Vinci Code en Les misérables */
    var anotherBook = book.withTitle("Les misérables"); 
    System.out.println(anotherBook.title() + ' ' + anotherBook.author());

    /* Exercice 2 */

    var b1 = new Book("Da Java Code", "Duke Brown");
    var b2 = b1;
    var b3 = new Book("Da Java Code", "Duke Brown");

    System.out.println(b1 == b2); /* true */
    System.out.println(b1 == b3); /* false */


    System.out.println(b1.title().equals(b2.title()) && b1.author().equals(b2.author())); /* true */
    System.out.println(b1.title().equals(b3.title()) && b1.author().equals(b3.author())); /* true */


    /* Exercice 2.3 */

    var book1 = new Book("Da Vinci Code", "Dan Brown");
    var book2 = new Book("Angels & Demons", new String("Dan Brown"));

    System.out.println(book1.isFromTheSameAuthor(book2));

    /* Exercice 2.4 */

    var javaBook = new Book("Da Java Code", "Duke Brown");
    System.out.println(javaBook);

    /* Exercice 3 */
    var book31 = new Book2("Da Vinci Code", "Dan Brown");
    var book32 = new Book2("Da Vinci Code", "Dan Brown");
    System.out.println(book31.equals(book32));

  }
}

/*
1.3 )

Main.java:5: error: title has private access in Book
    System.out.println(book.title + ' ' + book.author);
                           ^
Main.java:5: error: author has private access in Book
    System.out.println(book.title + ' ' + book.author);

On a pas accès à la méthode Book, book.title et book.author sont privés.

Comme Book est un record il existe des méthodes title et author.
On peut donc rajouter () pour appeler une méthode.

*/

/*
2.1 )

b1 == b2 affiche true car les adresses de b1 et b2 sont les mêmes.
b2 == b3 affiche false car les adresses de b2 et b3 ne sont pas les mêmes,
car b1 n'est pas le même objet de que b3.

2.2 ) 
Grace à equals.

    System.out.println(b1.title().equals(b2.title()) && b1.author().equals(b2.author()));
    System.out.println(b1.title().equals(b3.title()) && b1.author().equals(b3.author()));

*/

/* 
2.4 )
Pour que le code suivant
var javaBook = new Book("Da Java Code", "Duke Brown");
System.out.println(javaBook);
affiche
Da Java Code by Duke Brown
Il faut redéfinir la méthode toString du record

  @Override
  public String toString() { // remplace le toString() existant
    return title + " by " + author;
  }


2.6 )
Override sert à savoir si la méthode qu'on veut modifier existe en le demandant au
compilateur.

*/