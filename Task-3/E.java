package cellular.network;

import java.io.*;
import java.util.*;

public class CellularNetwork {

    public static int distance(int[] cities ,int[] towers){
        int maxR = 0;
        
        for (int city : cities) {
            int pos = Arrays.binarySearch(towers, city);
            int Right = Integer.MAX_VALUE;
            int Left = Integer.MAX_VALUE;

            if (pos < 0) {
                pos = -(pos + 1);
            } else {
                continue; 
            }
            
            if (pos < towers.length) {
                Right = towers[pos] - city;
            }
            if (pos > 0) {
                Left = city - towers[pos - 1];
            }
            int minDistanceForThisCity = Math.min(Right, Left);

            maxR = Math.max(maxR, minDistanceForThisCity);
        }
        return maxR;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] cities = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cities[i] = Integer.parseInt(st.nextToken());
            
        }
        int[] towers = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            towers[i] = Integer.parseInt(st.nextToken());
            
        }
        Arrays.sort(towers);
        Arrays.sort(cities);
        
        System.out.println(distance(cities,towers));
    }
    
}
