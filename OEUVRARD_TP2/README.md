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

 Le code affiche "hello", car la ligne s8.toUpperCase() n'est pas assignÃ© Ã  la variable s8
 Pour afficher "HELLO", il aurait fallu Ã©crire s8 = s8.toUpperCase();
 Et ne pas oublier Locale.ROOT ne pas oublier le import java.util.Locale
 
 -------------------------------------------
 ### Exercice 2 - En morse. Stop.
 
 ...
 
 -------------------------------------------
 ### Exercice 3 - Reconnaissance de motifs
 
 ...
 
 -------------------------------------------
 
 Lien qui m'a aidé à mieux comprendre java [ici](https://docs.oracle.com/en/java/javase/16/docs/api/) 

