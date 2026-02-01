package red.scarf;

import java.io.*;
import java.util.StringTokenizer;


public class Main {

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer (br.readLine());
        int [] arr = new int [n];
        int total = 0;
        for (int i = 0 ; i<n ;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            total ^= arr[i];
        }
        
        int [] result = new int [n];
        for (int i = 0; i< n ;i++){
            result [i] = arr[i] ^ total;
        }
        for(int num : result){
            System.out.print(num +" ");
        }
    }
    
}
