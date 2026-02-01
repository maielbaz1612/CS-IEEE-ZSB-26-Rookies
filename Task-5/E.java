package beautiful.xor;

import java.util.*;
import java.io.*;

public class BeautifulXOR {
    static FastScanner in = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int t = in.nextInt();
        while (t-- > 0) {
            long a = in.nextLong();
            long b = in.nextLong();
            
            if (a == b) {
                out.println(0);
            } else if ((a ^ b) <= a) {
                out.println(1);
                out.println(a ^ b);
            } else {

                long x1 = b;
                long x2 = a;
                long intermediate = a ^ b;
                
                if (x1 <= a && x2 <= intermediate) {
                    out.println(2);
                    out.println(x1 + " " + x2);
                } else {
                    out.println(-1);
                }
            }
        }
        out.close();
    }

static class FastScanner {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer("");

    String next() {
        while (!st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }
}
}