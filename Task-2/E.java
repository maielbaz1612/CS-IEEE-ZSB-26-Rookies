import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
        public static int GCD(int a, int b) {
                return b == 0 ? a : GCD(b, a % b);

            }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        while(N < 2 || N > 100000){
            N = Integer.parseInt(br.readLine());
        }
        
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int j = 0; j < N; j++) {
            arr[j] = Integer.parseInt(st.nextToken());           
        }
        
        int[] left = new int[N];
        left[0] = 0;
        for (int i = 1; i < N; i++) {
            left[i] = GCD(left[i-1], arr[i-1]);
        }
        
        int[] right = new int[N];
        right[N-1] = 0;
        for (int i = N-2; i >= 0; i--) {
            right[i] = GCD(right[i+1], arr[i+1]);
        }
        
        int max = 0;
        for (int i = 0; i < N; i++) {
            int withoutI = GCD(left[i], right[i]);
            max = Math.max(max, withoutI);
        }
        System.out.println(max);
        }
}