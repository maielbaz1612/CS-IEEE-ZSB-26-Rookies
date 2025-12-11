import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int j = 0; j < n; j++) {
            arr[j] = Integer.parseInt(st.nextToken());           
        }
        
        int m = Integer.parseInt(br.readLine());
        int[] temp = arr.clone();
        Arrays.sort(temp);
        
        long[] prefixOriginal = new long[n + 1];
        long[] prefixtemp = new long[n + 1];
        
        for (int i = 1; i <= n; i++) {
            prefixOriginal[i] = prefixOriginal[i - 1] + arr[i - 1];
            prefixtemp[i] = prefixtemp[i - 1] + temp[i - 1];
        }
        
        for (int j = 0; j < m ; j++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            long result=0;
            
            if (a == 1){
                result = prefixOriginal[r] - prefixOriginal[l - 1];
            }
            if (a == 2){
                result = prefixtemp[r] - prefixtemp[l - 1];
            }
            pw.println(result);
        }
        pw.close();
    }
    
}