public class Toto{
  public static void main(String[] args){

    var s1 = "toto";
    var s2 = s1;
    var s3 = new String(s1);
    
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);

    var s6 = "toto";
    var s7 = "toto";
    
    System.out.println(s6 == s7);

    var s8 = "hello";
    s8 = s8.toUpperCase();
    System.out.println(s8);
  }
}

/* 2) 
Le programme nous affiche true pour s1 == s2 car == compare les adresses
de s1 et s2 qui sont les mêmes.
Alors que s1 et s3 n'ont pas les mêmes adresses, donc false ! 
*/

/* 3)
La méthode equals pour vérifier le contenu des chaines de caractères.
*/

/* 4)
Les deux strings ont le même contenu donc sont sur la même adresse d'où le
message qui renvoi true
*/

/* 5)
Elle ne peut pas être modifié.
*/

/* 6)
Le code affiche "hello", car la ligne s8.toUpperCase() n'est pas assigné à la variable s8
Pour afficher "HELLO", il aurait fallu écrire s8 = s8.toUpperCase();
Et ne pas oublier Locale.ROOT ne pas oublier le import java.util.Locale
*/