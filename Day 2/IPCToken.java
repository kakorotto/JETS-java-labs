//StringTokenizer st = new StringTokenizer("this is a test","\\.");
    // while (st.hasMoreTokens()) {
  //       System.out.println(st.nextToken());
//     }

import java.util.*;
public class IPCToken {
//private static final String IPV4_PATTERN_ALLOW_LEADING_ZERO =    "^((25[0-5]|(2[0-4]|1[0-9]|[1-9]|)[0-9])(\\.(?!$)|$)){4}$";
        public static void main(String[] args){
        String ip = args[0];
StringTokenizer st = new StringTokenizer(ip,"\\.");
     while (st.hasMoreTokens()) {
         System.out.println(st.nextToken());
     }
        }
}

