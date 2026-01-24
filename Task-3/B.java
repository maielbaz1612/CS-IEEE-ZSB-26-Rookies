package sumqueries;

import java.io.*;
import java.util.*;

public class binary {

    public static int Search(int[] arr, int p){
        int sum = 0;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr [mid] <= p) {
                sum = mid + 1; 
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int numShops = Integer.parseInt(br.readLine());
        
        int[] prices = new int[numShops];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numShops; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(prices);        
        
        int q = Integer.parseInt(br.readLine());
        
        StringBuilder output = new StringBuilder();
        for (int m = 0; m < q; m++) {
            int money = Integer.parseInt(br.readLine()); 
            int result = Search(prices, money);
            output.append(result).append("\n");
        }
        
        System.out.print(output);
       
}}
