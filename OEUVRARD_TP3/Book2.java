import java.util.Objects;

public class Book2 {
  private final String title;
  private final String author;

  @Override
  public boolean equals(Object o) {
    return o instanceof Book2 book && author.equals(book.author) && title.equals(book.title);
  }

  @Override
  public int hashCode() {
    return title.hashCode() ^ author.hashCode();
    /* ou utiliser return Objects.hash(title, author); mais moins rapide */
  }

  public Book2(String title, String author) {
    Objects.requireNonNull(title, "titre doit etre non null");
    Objects.requireNonNull(author, "auteur doit etre non null");
    this.title = title;
    this.author = author;
  }
}


/* 
Exercice 3

Le equals n'est pas possible car contrairement à un record
une class n'intrègre pas directement les méthodes HashCode et Equals
Il faut réécrire HashCode et Equals, Ne pas oublier Override.

*/