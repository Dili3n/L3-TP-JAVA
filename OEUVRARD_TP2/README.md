# String, StringBuilder, égalité, et expressions régulières

 -------------------------------------------
 ### Exercice 1 - Assignation, égalité, référence
 
 2. Quel est le type de s ? Comment le compilateur fait-il pour savoir qu'il existe une méthode length() sur s ?
 
 Le programme nous affiche true pour s1 == s2 car == compare les adresses
 de s1 et s2 qui sont les mêmes.
 Alors que s1 et s3 n'ont pas les mêmes adresses, donc false ! 
 
 3. Quelle est la méthode à utiliser si l'on veut tester si le contenu des chaînes de caractères est le même ?

 La méthode equals pour vérifier le contenu des chaines de caractères.
 
 4. Qu'affiche le code suivant ? Expliquer.
 
 Les deux strings ont le même contenu donc sont sur la même adresse d'où le
 message qui renvoi true.
 
 5. Expliquer pourquoi il est important que java.lang.String ne soit pas mutable.
 
 Elle ne peut pas être modifiée.
 
 6. Qu'affiche le code suivant ?

 Le code affiche "hello", car la ligne s8.toUpperCase() n'est pas assignée à  la variable s8
 Pour afficher "HELLO", il aurait fallu écrire s8 = s8.toUpperCase();
 Et ne pas oublier Locale.ROOT ne pas oublier le import java.util.Locale
 
 -------------------------------------------
 ### Exercice 2 - En morse. Stop.
 
 2. A quoi sert l'objet java.lang.StringBuilder ?

 StringBuilder permet de pouvoir concaténer plusieurs chaînes de caractères
 de façon maximisée.

 Pourquoi sa méthode append(String) renvoie-t-elle un objet de type StringBuilder ?
 
 ...
 
 3. Quel est l'avantage par rapport à la solution précédente ?
 
 En l'écrivant comme ça, c'est plus lisible. Et la concaténation est plus optimisée.
 
 4. 
Des guillemets simples peuvent être utilisés car ils sont utilisés
pour y mettre un seul caractère, comme dans ce cas.
Alors que les doubles guillemets peuvent contenir plusieurs caractères.
Donc dans ce cas les guillemets simples peuvent être utilisés.

5.

...
 
 -------------------------------------------
 ### Exercice 3 - Reconnaissance de motifs
 
 1. A quoi servent la classe java.util.regex.Pattern et sa méthode compile ?
    A quoi sert la classe java.util.regex.Matcher ?
    
regex.Pattern :
permet la représentation d'un automate avec une expression régulière.
regex.Matcher :
permet de parcourir un automate, avec deux sous parties : 
matcher.find() qui reconnait un endroit du texte.
matcher.lookingAt() reconnait le début du texte.
matcher.matches() reconnait l'entièreté du texte.
vu dans le cours [ici](https://igm.univ-mlv.fr/~beal/Teaching/poo2.pdf)

 2. Écrire un programme qui lit des chaînes de caractères sur la ligne de commande et affiche les chaînes qui correspondent à des nombres, c'est-à-dire les chaînes dont tous les caractères sont compris entre '0' et '9'.
 
 ``var pattern = Pattern.compile("\\d+");``
 
 -------------------------------------------
 
 Liens qui m'ont aidé à mieux comprendre java / le TP :
 [Java](https://docs.oracle.com/en/java/javase/16/docs/api/) 
 [Cours Pattern & Matcher](https://igm.univ-mlv.fr/~beal/Teaching/poo2.pdf)
 

