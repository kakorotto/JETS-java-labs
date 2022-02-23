import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPv4Regex {

    private static final String IPV4_PATTERN =
            "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";

    private static final Pattern pattern = Pattern.compile(IPV4_PATTERN);

    public static boolean isValid(final String ip) {
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    public static void main (String[] args){
	    System.out.println(IPv4Regex.isValid(args[0]);
}
