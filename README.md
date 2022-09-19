# Premiers pas en Java, chaînes de caractères, tableaux, boucles

 
 ### Exercice 1 - Hello Groland
 
 Rien à dire.
 
 ### Exercice 2 - Afficher les arguments de la ligne de commande
 
 1. Que se passe-t-il si l'on ne passe pas d'argument lors de l'exécution du programme ? 
 
 Lors de l'exécution du prgramme un message d'erreur apparait : 
 
 > Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0 at PrintArgs.main(PrintArgs.java:3)
 
 Ce message nous dit explicitement qu'on est out au range, car nous cherchons args[0] qui n'existe pas vu que l'utilisateur a exécuté son programme sans mettre
 d'argument.
 
 3. Changer votre programme pour utiliser la syntaxe dite du 'for deux points', c'est à dire for(Type value: array)
 
 `for(var mot : args){}`
 
 ### Exercice 3 - Calculette simple
