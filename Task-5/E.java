package beautiful.xor;

import java.util.*;
import java.io.*;

public class BeautifulXOR {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        PrintWriter out = new PrintWriter(System.out);
        int cases = Integer.parseInt(br.readLine());

        while(cases-- > 0){
            StringTokenizer st = new StringTokenizer (br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            if (a == b) {
                out.println(0);
            } else if ((a ^ b) <= a) {
                out.println(1);
                out.println(a ^ b);
            } else {

                long x1 = b;
                long x2 = a;
                long temp = a ^ b;
                
                if (x1 <= a && x2 <= temp) {
                    out.println(2);
                    out.println(x1 + " " + x2);
                } else {
                    out.println(-1);
                }
            }
        }
        out.flush();
        out.close();
}}