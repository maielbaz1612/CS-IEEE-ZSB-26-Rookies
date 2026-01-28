package chocolate;

import java.io.*;
import java.util.StringTokenizer;

public class Chocolate {

    public static String count (int [] arr){
        if (arr.length == 1) return "1 0";
        int left = 0;
        int right = arr.length - 1 ;
        int sumL = 0 , sumR = 0;
        int countL = 0 , countR = 0;
        
        while (left <= right){
            
            if(sumL <= sumR){
                sumL += arr[left];
                left++;
                countL ++;
            }else{
                sumR += arr[right];
                right--;
                countR ++ ;
            }
        }
            return countL+" "+countR;
    } 
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer (br.readLine());
        int [] arr = new int [n];
        for (int i = 0 ; i<n ;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(count(arr));
    }
    
}
