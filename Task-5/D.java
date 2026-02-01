package sumxor;

import java.io.*;
import java.util.StringTokenizer;

public class SumXor {

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        StringTokenizer st = new StringTokenizer (br.readLine());
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        int queries = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer (br.readLine());
        int [] arr = new int [n];
        for (int i = 0 ; i < n ;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] xor = new int [n];
        int temp = 0;
        for (int x =0 ; x < n ; x++){
            xor[x] = temp^arr[x];
            temp = xor[x];
        }
        while(queries != 0){
            st = new StringTokenizer (br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int result=0;
            if(a > 1){
                result = (xor[b-1])^(xor[a-2]);
            }else {
                result = xor[b-1];
            }
            
            out.println(result);
            queries --;
        }
        out.flush();
        out.close();
    }
    
}
