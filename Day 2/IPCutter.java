import java.util.Arrays;
public class IPCutter {
private static final String IPV4_PATTERN_ALLOW_LEADING_ZERO = 	 "^((25[0-5]|(2[0-4]|1[0-9]|[1-9]|)[0-9])(\\.(?!$)|$)){4}$";
	public static void main(String[] args){
        String ip = args[0];
        String[] splitIP = ip.split("\\.");
        String[] splitIP2 = ip.split(IPV4_PATTERN_ALLOW_LEADING_ZERO);
	System.out.println(Arrays.toString(splitIP));
	System.out.println(Arrays.toString(splitIP2));

	}
}
