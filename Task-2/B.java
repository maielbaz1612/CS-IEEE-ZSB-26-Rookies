import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(st.nextToken());
        
        while (t < 1 || t > 10000) {
            st = new StringTokenizer(br.readLine());
            t = Integer.parseInt(st.nextToken());
        }
        while(t-- > 0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            while (n < 1 || n > 200000 || q < 1 || q > 200000) {
                st = new StringTokenizer(br.readLine());
                n = Integer.parseInt(st.nextToken());
                q = Integer.parseInt(st.nextToken());
            }
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            
            StringBuilder sb = new StringBuilder();
            
            long[] prefixSum = new long[n + 1];
            for (int x = 1; x <= n; x++) {
                prefixSum[x] = prefixSum[x - 1] + arr[x - 1];
            }
            long total = prefixSum[n];
            
            for (int j = 0; j < q; j++) {
                st = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());

                while (l < 1 || r < l || r > n || k < 1 ) {
                    st = new StringTokenizer(br.readLine());
                    l = Integer.parseInt(st.nextToken());
                    r = Integer.parseInt(st.nextToken());
                    k = Integer.parseInt(st.nextToken());
                }
                
                long sum = prefixSum[r] - prefixSum[l-1];
                long newSum = total - sum + ( r-l + 1)*(long)k;
                if(newSum % 2 == 1) {
                     System.out.println("YES");
                } else {
                     System.out.println("NO");
                }
            }
            
}}}