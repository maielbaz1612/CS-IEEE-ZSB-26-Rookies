package books;

import java.io.*;
import java.util.*;

public class Books {

    public static int numOfBooks(int[] arr, int t) {
        int left = 0;
        int sum = 0;
        int count = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > t) {
                sum -= arr[left];
                left++;
            }

            count = Math.max(count, right - left + 1);
        }
        
        return count;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        while (n < 1 || t < 1 ) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            t = Integer.parseInt(st.nextToken());}
        
        int[] minutes  = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            minutes[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(numOfBooks(minutes,t));
        
    }
    
}
