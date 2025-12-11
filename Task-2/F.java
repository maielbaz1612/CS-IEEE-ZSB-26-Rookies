import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String firstLine = br.readLine();
        
        if (firstLine == null) return;
        StringTokenizer st = new StringTokenizer(firstLine);
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        
        int max = 200000;
        int[] arr = new int[max + 5]; 
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            if (line == null) break;
            st = new StringTokenizer(line);
            
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            
            if (l < 1) l = 1;
            if (r > max) r = max;
            if (l > r) continue; 
            
            arr[l]++;
            if (r + 1 < arr.length) {
                arr[r + 1]--;
            }
        }
        
        int[] freq = new int[max + 1];
        int current = 0;
        for (int i = 1; i <= max; i++) {
            current += arr[i];
            freq[i] = current;
        }
        
        int[] prefix = new int[max + 1];
        prefix[0] = 0;
        for (int i = 1; i <= max; i++) {
            prefix[i] = prefix[i - 1];
            if (freq[i] >= k) {
                prefix[i]++;
            }
        }
        
        for (int i = 0; i < q; i++) {
            String line = br.readLine();
            if (line == null) break;
            st = new StringTokenizer(line);
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if (a < 1) a = 1;
            if (b > max) b = max;
            if (a > b) {
                pw.println(0);
                continue;
            }
            
            int answer = prefix[b] - prefix[a - 1];
            pw.println(answer);
        }
        
        pw.close();
    }
}