package xor.mixup;

import java.io.*;
import java.util.*;

public class XORMixup {

    public static int result (int[]arr){
        int total = 0;
        for (int num : arr){
            total ^= num ;
        }
        for (int num : arr){
            if ((total ^ num) == num ){
                return num ;
            }
        }
        return -1 ;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int cases = Integer.parseInt(br.readLine());
        while(cases != 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer (br.readLine());
            int [] arr = new int[n];
            for (int i = 0 ; i < n ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            System.out.println(result(arr));
            
            cases --;
        }
    }
    
}
