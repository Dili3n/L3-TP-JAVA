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

/*
2 )
book est un objet Book qui a pour titre "Da Vinci Code" et
comme auteur "Dan Brown".
book.title réfère donc à "Da Vinci Code". 
book.author réfère à "Dan Brown".

*/

/*
4 )
Création d'un constructeur, avec requireNonNull
pour montrer 


public Book {
  Objects.requireNonNull(auteur, "auteur doit etre non null");
}
*/

/*
6 )
Appel du constructeur canonique avec this(title, "<no author>");
qui permet de donner deux arguments.

*/

/*

8 )
Dans un record on ne modifie pas un champ il est private ! 
./Book.java:15: error: cannot assign a value to final variable title
    this.title = title;

Il faut créer une nouvel object pour permettre de changer le titre d'un livre

*/