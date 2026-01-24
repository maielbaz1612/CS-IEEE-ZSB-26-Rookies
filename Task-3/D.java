package task3.d;

import java.io.*;
import java.util.*;

public class Main {

    public static long result(long[] arr, long T){
            long high = T * arr[0];
            long low = 1;
            long time = 0;
            while(low <= high){
                long mid = low + (high - low) / 2;
                long total = 0;
                for(int i =0;i < arr.length;i++){
                    total += mid/arr[i];
                    
                }
                if (total >= T) {
                    time = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
                    }
            return time;
        }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long t = Long.parseLong(st.nextToken());
        
        while (n < 1 || t < 1 ) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            t = Long.parseLong(st.nextToken());
        }
        
        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            if(arr[i]<1){
                arr[i] = Long.parseLong(st.nextToken());
            }
        }
        Arrays.sort(arr);
        
        System.out.println(result(arr,t));
        
    }
    
}
