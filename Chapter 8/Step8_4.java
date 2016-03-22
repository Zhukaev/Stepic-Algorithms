// 8.4.5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int W = s.nextInt();
        int n = s.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++){
            w[i] = s.nextInt();
        }
        int[][] D = new int[W+1][n+1];
        for (int i = 0; i <= W; i++){
            D[i][0] = 0;
        }
        for (int i = 0; i <= n; i++){
            D[0][i] = 0;
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= W; j++){
                D[j][i] = D[j][i-1];
                if (w[i-1] <= j){
                    D[j][i] = max(D[j][i], D[j-w[i-1]][i-1]+w[i-1]);
                }
            }
        }
        /*for(int i = 0; i < n; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(D[j][i]);
            }
            System.out.println();
        }*/
        System.out.print(D[W][n]);
    }
    public static int max(int a, int b) {
        if (a <= b) return b;
        return a;
    }
}
