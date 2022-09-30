# Premiers pas en Java, chaînes de caractères, tableaux, boucles

 -------------------------------------------
 ### Exercice 1 - Hello Groland
 
 Rien à dire.
 
 -------------------------------------------
 ### Exercice 2 - Afficher les arguments de la ligne de commande
 
 1. Que se passe-t-il si l'on ne passe pas d'argument lors de l'exécution du programme ? 
 
 Lors de l'exécution du prgramme un message d'erreur apparait : 
 
 > Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0 at PrintArgs.main(PrintArgs.java:3)
 
 Ce message nous dit explicitement qu'on est out au range, car nous cherchons args[0] qui n'existe pas vu que l'utilisateur a exécuté son programme sans mettre
 d'argument.
 
 3. Changer votre programme pour utiliser la syntaxe dite du 'for deux points', c'est à dire for(Type value: array)
 
 `for(var mot : args){}`
 
 -------------------------------------------
 ### Exercice 3 - Calculette simple
 
 Lien qui m'a aidé à mieux comprendre java [ici](https://docs.oracle.com/en/java/javase/16/docs/api/)
 
 1. Indiquer dans le programme où sont les variables et quel est leur type associé.
 
 `int value = scanner.nextInt(); 
  int value2 = scanner.nextInt();`
  
  Ce sont des entiers.
  
 3. Pourquoi nextInt() n'est pas une fonction ? Qu'est nextInt() alors ?

 nextInt() n'est pas une fonction car en java les fonctions n'existent pas en langage orienté objet.
 On dit alors que nextInt() est une méthode.
 Elle a pour but de demander un entier dans la console quand la ligne s'exécute.
 On peut prendre le scanf de stdio.h en C comme équivalent à cette méthode.
 
 4. Expliquer la ligne : import java.util.Scanner;

On import la classe Scanner pour pouvoir l'utiliser dans notre code.

 -------------------------------------------
 ### Exercice 4 - Record et conversion de String en entier
 
 1. Quelle doit être la ligne de commande pour compiler le fichier Point.java ?
 
 javac Point.java
 
 3. Que veut dire static pour une méthode ?

 Static veut dire que cette méthode pourra seulement agir sur les variables de classe et pas sur celles d'instance.
 
 4. Que se passe-t-il lorsque l'un des arguments n'est pas un nombre ?
 
 > Exception in thread "main" java.lang.NumberFormatException: For input string: "a" at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67) at java.base/java.lang.Integer.parseInt(Integer.java:665) at java.base/java.lang.Integer.parseInt(Integer.java:781) at TestPoint.main(TestPoint.java:4)
 
Le compilateur n'aime pas... Il ne veut pas recevoir un string alors qu'un int est attendu.
 
 6. Quels sont les paramètres et le type de retour de la méthode distance ?

 Comme paramètres distance à deux int, venant du record ``Point(int x, int y)``
 Sa valeur de retour est un double qu'on peut interpréter comme un nombre à virgule.
 
 -------------------------------------------
 ### Exercice 5 - De C vers Java
 
 #### Comment peut-on expliquer la différence de vitesse ?
 
 En C : environ 1 seconde.
 En java : environ 0.2 seconde.
 
 Cette différence peut être expliqué sur le fait que java est équipé du JIT (Just In Time) qui permet d'améliorer la rapidité d'exécution de Java.
 
 -------------------------------------------
 
 Lien qui m'a aidé à mieux comprendre java [ici](https://docs.oracle.com/en/java/javase/16/docs/api/) 

