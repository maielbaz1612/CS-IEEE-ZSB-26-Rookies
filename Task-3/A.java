package binary2;

import java.io.*;
import java.util.StringTokenizer;


public class Binary2 {

    public static long Search(long n, int k) {
    long low = 1;
    long high = n;
    long v = n; 

    while (low <= high) {
        long mid = low + (high - low) / 2;

        
        long total = 0;
        long tempV = mid;
        
        while (tempV > 0) {
            total += tempV;
            tempV /= k;
        }

        if (total >= n) {
            v = mid;
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return v;
}
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        while (n < 1 || k < 2 || k > 10) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
        }
        System.out.println(Search(n,k));
        
        
    }
    
}
