package numofbits;

import java.io.*;

public class NumOfBits {

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int n = Integer.parseInt(br.readLine());
        long mod = 1000000007;
        long result = 1;
        
        for (int i = 0; i < n; i++) {
            result = (result * 2) % mod;
        }
        System.out.println(result);
    }
    
}
