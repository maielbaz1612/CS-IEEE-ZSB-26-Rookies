package subarrays;

import java.io.*;
import java.util.*;

public class Subarrays {
    public static String counter(int[]arr , int x){
        HashMap<Integer,Integer> h = new HashMap<> ();
        
        for (int i = 0; i < arr.length; i++) {
            int target = x - arr[i];
            if (h.containsKey(target)) {
                return (h.get(target) + 1) + " " + (i + 1);
            }

            h.put(arr[i], i);
        }
        return "IMPOSSIBLE";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        StringTokenizer st = new StringTokenizer (br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer (br.readLine());
        int[]arr = new int [n];
        for(int i = 0 ; i <n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(counter(arr,x));
        
    }
    
}
