# 	Objets, délégation, ArrayList, HashMap


 -------------------------------------------
 ### **Exercice 1 - Assignation, égalité, référence**
 
 #### 7. A faire pour le compte rendu :
 
 ##### 1. Que fait sysout + Ctrl + Space dans un main ?
 
 Ecrire sysout puis faire Ctrl + Space est un raccourci pour 
 écrire ``System.out.println();``
 
 ##### 2. Que fait toStr + Ctrl + Space dans une classe ?
 
  `` @Override  
public String toString() {  
	  // TODO Auto-generated method stub    
	  return super.toString();  
 }``
 
 Création du début de la méthode toString()
 
 ##### 3. Définir un champs foo de type int, que fait get + Ctrl + Space, et set + Ctrl + Space .
 
 Raccourci pour écrire getClass()
 Reccourci pour écrire Set<>

 ##### 4. Dans le menu Source, comment générer un constructeur initialisant le champ foo ?
 
 Generate Constructeur using Fields
 
 ##### 5. Sélectionner le nom de la classe puis Alt + Shift + R, qu'obtient-on ? Même question avec le champ foo .
 
 Permet de renommer la classe.
 
 ##### 6. Écrire a = 2 + 3 + 4, puis sélectionner 2 + 3 puis Alt + Shift + L .
 
 va créer un champs avec un nom saisi par l'utilisateur qui sera égal à 2 + 3.
 
 ##### 7. Écrire new Integer(2), en gardant le curseur après ')', appuyer sur Ctrl + 1, que se passe-t-il ?
 
 Integer integer = new Integer(2);
 
 ##### 8. Déclarer une variable s de type String et cliquer sur String en maintenant la touche Ctrl . Que se passe-t-il ?
 
 On est envoyé vers la class String...
 
 ##### 9. Dans la méthode toString(), que fait un Ctrl + Clic sur super.toString() ?
 
 On est envoyé la la class Object sur le méthode toString().
 
 ##### 10. Sélectionner le champs foo, puis Ctrl + Shift + G. Que se passe-t-il ?
 
 Cela nous ouvre une fenetre recherche.
 
 ##### 11. À quoi sert Ctrl + Shift + O ?
 
 Supprime les import qui ne sont pas utilisés.
 
 ##### 12. À quoi sert Ctrl + Shift + C ?
 
 Cela crée un commentaire.
 
  -------------------------------------------
  
 ### **Exercice 2 - Library**
 
 
 ###### 5. Expliquer pourquoi la méthode findByTitle doit renvoier null plutôt que de lever une exception.
 
 Pour pouvoir mettre qu'un livre est null et ne pas faire une erreur...
 
   -------------------------------------------
   
 ### **Exercice 3 - Librarie 2 (le retour de la vengeance)**
 
 
 ###### 1. Quelle est la complexité de la méthode findByTitle de la classe Library ?
 
 Le nombre d'élément dans books.
 
 ##### 2.
 
 Avec map la compléxité sera de 1.
 
 ##### 3. Code de l'exercice 2.
 
``
private ArrayList<Book> books;  
  
public Library() {   
	books = new ArrayList<>();   
}  
  ``
  ``
public void add(Book book) {  
	Objects.requireNonNull(book);  
	books.add(book);  
}  ``
  ``
public Book findByTitle(String titre) {  
	  
	for(var elem : books) {  
		if (elem.title().equals(titre)) {  
			return elem;  
		}  
	}  
	return null;  
}  
   ``
   ``
public String toString() {  
	  
	var livre = new StringBuilder();  
	   
	for(var elem : books) {  
		livre.append(elem).append("\n");  
	}  
	  
	return livre.toString();
  ``
 ##### 4.
 
 On préfère une class pour l'encapsulation qu'un record n'a pas...
 Par l'accessibilité.
 
 ##### 5. Pour l'implantation de la méthode toString, quelle méthode de java.util.HashMap doit-on utiliser pour obtenir l'ensemble des valeurs stockées ? 
 
map.entrySet();

##### 6. Comment peut-on résoudre ce problème ?

Il suffit de remplacer les HashMap par LinkedHashMap dans le code.

##### 8. Implanter correctement la méthode removeAllBooksFromAuthor.

``
for (var entry : books.entrySet()) {
	var key = entry.getKey();
	var value = entry.getValue();
	if (value.author().equals(author)) {
		books.remove(key);
	}
}``

 -------------------------------------------
 
 Liens qui m'ont aidé à mieux comprendre java / le TP :    
 [Java](https://docs.oracle.com/en/java/javase/16/docs/api/)   
 [Cours Collection](https://igm.univ-mlv.fr/~beal/Teaching/poo4.pdf)
 

