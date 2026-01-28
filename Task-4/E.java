package subarrays;

import java.io.*;
import java.util.StringTokenizer;


public class Subarrays {
    public static int counter(int[]arr , int x){
        int count = 0;
        int sum = 0;
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > x && left <= right) {
                sum -= arr[left];
                left++;
            }

            if (sum == x) {
                count++;
            }
        }
        return count ;
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
