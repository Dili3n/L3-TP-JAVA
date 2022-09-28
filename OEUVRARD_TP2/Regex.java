import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.StringBuilder; 
import java.util.Arrays;

public class Regex {

  public static void main(String[] args){

    var str = new StringBuilder();
    var pattern = Pattern.compile("[A-Za-z]*[0-9]+");

    for(var elem: args){
      if (pattern.matcher(elem).matches()){
        str.append(elem).append(" ");
      }
    }
    System.out.println(str);
    
    var ip = new IpV4("192.29.194.23");
    System.out.println(Arrays.toString(ip.verifIp("192.29.194.23")));

    }

}


/* 1)
regex.Pattern :
permet la représentation d'un automate avec une expression régulière.
regex.Matcher :
permet de parcourir un automate, avec deux sous parties : 
matcher.find() qui reconnait un endroit du texte.
matcher.lookingAt() reconnait le début du texte.
matcher.matches() reconnait l'entièreté du texte.
vu dans le cours link; https://igm.univ-mlv.fr/~beal/Teaching/poo2.pdf


*/

/* 2)
var pattern = Pattern.compile("\\d+");


*/


