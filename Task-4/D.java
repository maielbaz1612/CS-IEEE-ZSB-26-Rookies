package eating.candies;

import java.io.*;
import java.util.StringTokenizer;


public class EatingCandies {

    public static int counter (int [] arr){
        int count =0;
        int sumL =0 , sumR =0 ;        
        int left = 0 ;
        int right = arr.length-1;
        int total =0;
        while (left <= right){
            
            if(sumL < sumR){
                sumL += arr[left];
                left++;
                count ++;
            }else{
                sumR += arr[right];
                right--;
                count ++ ;
            }
            if (sumL == sumR){
                total=count;
            }
            
        }        
        return total ;
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int cases = Integer.parseInt(br.readLine());
        while(cases != 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer (br.readLine());
            int [] arr = new int[n];
            for (int i = 0 ; i < n ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            System.out.println(counter(arr));
            
            cases --;
        }
    }
    
}
