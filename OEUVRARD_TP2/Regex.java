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
    
    var ip = new IpV4("127.29.128.23");
    System.out.println(Arrays.toString(ip.verifIp(ip.adresse())));

    }

}

