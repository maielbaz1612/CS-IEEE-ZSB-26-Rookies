package task3.c;

import java.io.*;
import java.util.*;

public class Task3C {

    public static boolean validation(int[] H ,int[] B , int k){
        boolean valid = false;
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < H.length && j < B.length){
            if( B[j] >= H[i]){
                count++;
                i++;
                j++;
            }else{
                j++;
            }
            if (count >= k){
                valid = true;
                break;
            }
        }
        return valid;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        while (N < 1 || M < 1 || K < 1 || K > Math.min(N,M)) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
        }
        int[] head = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            head[i] = Integer.parseInt(st.nextToken());
            if(head[i] < 1){
                head[i] = Integer.parseInt(st.nextToken());
            }
        }
        int[] body = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            body[i] = Integer.parseInt(st.nextToken());
            if(body[i] < 1){
                body[i] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(head);
        Arrays.sort(body);
        
        boolean result = validation(head,body,K);
        if(result == true){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
    
}}
