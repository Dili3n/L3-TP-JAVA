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