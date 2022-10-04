# Egalité, nullabilité, mutabilité, affichage

 -------------------------------------------
 ### Exercice 1 - Livre
 
 #### 2. Expliquer.

book est un objet Book qui a pour titre "Da Vinci Code" et
comme auteur "Dan Brown".
book.title réfère donc à "Da Vinci Code". 
book.author réfère à "Dan Brown".

 ####  3. Quel est le problème ? Comment peut-on le corriger ?
 
``Main.java:5: error: title has private access in Book
    System.out.println(book.title + ' ' + book.author);``
                      
``Main.java:5: error: author has private access in Book
    System.out.println(book.title + ' ' + book.author);``

On a pas accès à la méthode Book, book.title et book.author sont privés.

Comme Book est un record il existe des méthodes title et author.
On peut donc rajouter () pour appeler une méthode.
 
 ####  4. Comment faire pour éviter ce problème sachant qu'il existe une méthode static requireNonNull dans la classe java.util.Objects.
 
Création d'un constructeur, avec requireNonNull
pour montrer   

``public Book {
  Objects.requireNonNull(auteur, "auteur doit etre non null");
}``
 
 #### 6.
 
 Appel du constructeur canonique avec ``this(title, "<no author>");``
qui permet de donner deux arguments.
 
  #### 7. Comment le compilateur fait-il pour savoir quel constructeur appeler ?

  #### 8. Pourquoi le code suivant ne marche pas ? Comment faire alors ?
  
  Dans un record on ne modifie pas un champ il est private !   
``./Book.java:15: error: cannot assign a value to final variable title
    this.title = title;``

Il faut créer une nouvel object pour permettre de changer le titre d'un livre
 
 -------------------------------------------
 ### Exercice 2 - Liberté, Égalité, toString
 
  #### 1. Qu'affiche le code ci-dessous ?
  
  b1 == b2 affiche true car les adresses de b1 et b2 sont les mêmes.
b2 == b3 affiche false car les adresses de b2 et b3 ne sont pas les mêmes,
car b1 n'est pas le même objet de que b3.
  
  #### 2. 
  
  Grace à equals.  
 
   `` System.out.println(b1.title().equals(b2.title()) && b1.author().equals(b2.author()));
    System.out.println(b1.title().equals(b3.title()) && b1.author().equals(b3.author()));``
  
  #### 4 .Comment faire pour que le code suivant
  
  Pour que le code suivant  
 
``var javaBook = new Book("Da Java Code", "Duke Brown");
System.out.println(javaBook);``  
 
affiche
Da Java Code by Duke Brown
Il faut redéfinir la méthode toString du record

 `` @Override
  public String toString() { // remplace le toString() existant
    return title + " by " + author;
  }``

#### 6.

Override sert à savoir si la méthode qu'on veut modifier existe en le demandant au
compilateur.

 -------------------------------------------
 ### Exercice 3 - Reconnaissance de motifs
 
 #### Comment corriger le problème si on s'entête à utiliser une classe ?
 
Le equals n'est pas possible car contrairement à un record
une class n'intrègre pas directement les méthodes HashCode et Equals
Il faut réécrire HashCode et Equals, Ne pas oublier Override.
 
 -------------------------------------------
 
 ### Exercice 4 - Tri à caillou [à la maison]
 
 Création d'un tableau d'entier 
 
 ``var array = new int[] { 1, 8, 17, 5, 6 };``
 
 Avec ce tableau on appel une classe qui effectue le travail, grâce à la 
 méthode IndexOfMin et Swap.
 -------------------------------------------
 
 Liens qui m'ont aidé à mieux faire le TP :    
 [Java](https://docs.oracle.com/en/java/javase/16/docs/api/)   
 [Cours Classes](https://igm.univ-mlv.fr/~beal/Teaching/poo3.pdf)
 

