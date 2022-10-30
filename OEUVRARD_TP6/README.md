# 	Interface et Entrée/Sortie

 -------------------------------------------
 ### Exercice 1 - Blockbuster
 
 #### 2. Quel doit être le type du paramètre de add et le type de retour de lookup ?
 
 Le type du paramètre de add doit être "Film"
 le type de retour de lookup doit aussi être "Film"
 
 #### Que doit renvoyer lookup s'il n'y a ni cassette vidéo ni laser disc ayant le nom demandé dans le catalogue ?

Renvoyer null.
 
 ####  3. Pourquoi fromText est-elle une méthode statique alors que toText est une méthode d'instance ?
 
FromText est une methode static car elle n'agit pas sur des variables d'instance alors que toText si.
 
 #### 4. Quelle méthode doit-on utiliser pour créer un écrivain sur un fichier texte à partir d'un Path ?
 
 newBufferedWriter(of)
 
 #### Comment doit-on faire pour garantir que la ressource système associée est bien libérée ?
 
 Avec un try.
 
  #### Comment doit-on gérer l'exception d'entrée/sortie ?
  
  Catch IOException.
 
 -------------------------------------------
 
 Liens qui m'ont aidé à mieux comprendre java / le TP :    
 [Java](https://docs.oracle.com/en/java/javase/16/docs/api/)   
 [Cours Pattern & Matcher](https://igm.univ-mlv.fr/~beal/Teaching/poo6.pdf)
 

