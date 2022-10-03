import java.util.Objects;
import java.lang.Override;

public record Book(String title, String author) {

  @Override
  public String toString() { // remplace le toString() existant
    return title + " by " + author;
  }

  public Book { /* Constructeur compact */
    Objects.requireNonNull(title, "titre doit etre non null");
    Objects.requireNonNull(author, "auteur doit etre non null");
  }

  public Book(String title){
    this(title, "<no author>");
  }

  public Book withTitle(String title) {
    Objects.requireNonNull(title, "titre doit etre non null");
    return new Book(title, author);
  }

  public boolean isFromTheSameAuthor(Book anotherBook){
    return author.equals(anotherBook.author);

  }
}

