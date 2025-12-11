import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        
        while (n < 1 || q > 200000) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            q = Integer.parseInt(st.nextToken());
        }
        
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        long[] prefixSum = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            while (a < 1 || b < a || b > n) {
                st = new StringTokenizer(br.readLine());
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
            }
            
            long sum = prefixSum[b] - prefixSum[a - 1];
            sb.append(sum).append("\n");
        }
        
        System.out.print(sb);
    }
}