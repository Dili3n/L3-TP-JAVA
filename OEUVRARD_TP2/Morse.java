import java.lang.StringBuilder; 

public class Morse {
  public static void main(String[] args){

    var stop = new StringBuilder();

    for(var elem: args){
      stop.append(elem).append(" Stop. ");
    }
      System.out.println(stop);
    }
}
