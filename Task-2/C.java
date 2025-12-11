import java.io.*;
import java.util.StringTokenizer;

public class solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("bcount.in"));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(new FileWriter("bcount.out"));
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        
        if (N < 1 || N > 100000 || Q < 1 || Q > 100000) {
            pw.close();
            return;
        }
        
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < N; j++) {
            if (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            
            int x = Integer.parseInt(st.nextToken());           
            if (x < 0 || x > 4) {
                x = Integer.parseInt(st.nextToken());
                
            }
            arr[j] = x;
        }
        
        int[] first = new int[N + 1];
        int[] second = new int[N + 1];
        int[] third = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            first[i] = first[i - 1] + (arr[i - 1] == 1 ? 1 : 0);
            second[i] = second[i - 1] + (arr[i - 1] == 2 ? 1 : 0);
            third[i] = third[i - 1] + (arr[i - 1] == 3 ? 1 : 0);
        }
        
        for (int j = 0; j < Q ; j++) {
            
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int count1 = first[b] - first[a - 1];
            int count2 = second[b] - second[a - 1];
            int count3 = third[b] - third[a - 1];
            pw.println(count1 +" "+count2+" "+count3);

        }
        pw.close();
    }
}