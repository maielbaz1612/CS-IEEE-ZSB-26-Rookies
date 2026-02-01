package apples;

import java.io.*;
import java.util.*;

public class Apples {

    public static long result (int index, long sum1, long sum2,long [] arr){
        
        if (index == arr.length) {
            return Math.abs(sum1 - sum2);
        }

        long group1 = result( index+1 , sum1+arr[index] , sum2, arr);

        long group2 = result( index+1 , sum1 , sum2+arr[index] , arr);

        return Math.min(group1, group2);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer (br.readLine());
        long [] arr = new long [n];
        for (int i = 0 ; i<n ;i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
                
        
        System.out.println(result(0,0L,0L,arr));
    }
    
}
