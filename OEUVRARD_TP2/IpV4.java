import java.util.regex.Pattern;
import java.util.regex.Matcher;

public record IpV4(String adresse) {

    public static int[] verifIp(String adresse){

        var tab = new int[4];

        var pattern = Pattern.compile("(\\d+).(\\d+).(\\d+).(\\d+)");
        var matcher = pattern.matcher(adresse);
        if (matcher.matches()) {
            for(var i = 1; i <= matcher.groupCount(); i++){
                if(Integer.parseInt(matcher.group(i)) > 0 && 255 > Integer.parseInt(matcher.group(i))){
                    var entier = Integer.parseInt(matcher.group(i));
                    tab[i-1] = entier;
                } else {
                    throw new IllegalArgumentException("Entre 0 et 255");
                }

            }
        } else {
            throw new IllegalArgumentException("Adresse IP invalide");
        }
        return tab;
    }

}
