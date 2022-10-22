# Interface et Collection


 -------------------------------------------
 ### Exercice 1 - Manifeste d'un porte conteneur  
 
 #### On souhaite maintenant pouvoir afficher un manifeste.  
Le formatage exact pour une ligne est: [numéro]. [destination] [poids]kg
    
suivi d'un retour à la ligne (y compris après la dernière ligne).
Modifier le type Manifest pour que le code suivant ait le comportement attendu:
 
1 -  _méthode toString Manifest_
 
```
@Override  
public String toString() {  
  var str = new StringBuilder();  
  var indice = 1;  
  for (var elem : dest) {  
		 str.append(indice).append(". ").append(elem).append("\n");  
		 indice += 1;  
  }  
  return str.toString();  
}  
```

2 - _méthode toString Container_

```
@Override
public String toString() {
		
  var str = new StringBuilder();
		str.append(destination).append(" ").append(weight).append("kg");
		return str.toString();
	}
 ```
 
#### Pour résoudre la question précédente, au lieu de faire des appels de méthode, on peut aussi utiliser instanceof. Expliquer comment on peut utiliser instanceof.  

On aurait pu utiliser instanceof pour savoir si on a affaire à une container ou un passager.
Si instanceof retourne true, il se trouve qu' on compare un passager à une un passaer ou container à container.

#### Puis expliquer selon vous quel est le problème d'utiliser instanceof dans ce contexte et pourquoi on ne doit pas l'utiliser.

Le soucis n'est pas pour trouver tous les containers venant d'une destination mais pour les supprimer. On aurait le même soucis que dans le tp précédent.
On préfère utiliser ici un iterator.
 
 -------------------------------------------
 
 Liens qui m'ont aidé à mieux comprendre java / le TP :    
 [Java](https://docs.oracle.com/en/java/javase/16/docs/api/)   
 [Cours Interface et Collection](https://igm.univ-mlv.fr/~beal/Teaching/poo5.pdf)
 

