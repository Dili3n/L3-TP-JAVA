# Stream, Collecteur et Comparateur


 -------------------------------------------
 ### Exercice 1 - Un exemple simple
 
 #### 1 . Quelle est l'interface fonctionnelle prise en paramètre de filter ? Quels sont les types de paramètre et de retour de la lambda ? 

L'interface fonctionnelle est Predicate, paramètre un objet de type Person et retourne un booléen.

 #### 2. Quelle est l'interface fonctionnelle prise en paramètre de map ? Quels sont les types de paramètre et de retour de la lambda ?

L'interface fonctionnelle est Function, paramètre un objet de type Person et retourne un objet de type String.

 ### Exercice 2 - Le grand Hôtel

  #### 7 . Qu'elle implantation est la meilleure en terme de complexité pire cas ? 

 La meilleur implantation en terme de complexité est la deuxième car elle utilise `max` qui est une fonction qui a une complexité pire cas de O(n) et non pas O(n²) comme la première implantation.


 #### 8 . Quel est le type de retour de la méthode roomInfoGroupedByFloor ? 

    Le type de retour de la méthode roomInfoGroupedByFloor est un `Map<Integer, List<Room>>`.
    
 -------------------------------------------
 
 Liens qui m'ont aidé à mieux comprendre java / le TP :    
 [Java](https://docs.oracle.com/en/java/javase/16/docs/api/)   
 [Cours] (https://igm.univ-mlv.fr/~beal/Teaching/poo8.pdf)
 

