// 8.3.8

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    static String n = s.nextLine();
    static String m = s.nextLine();
    static int[][]D = new int[n.length()+1][m.length()+1];

    public static void main(String[] args) {
        for (int i = 0; i < m.length()+1; i ++){
            for (int j = 0; j < n.length()+1; j++){
                D[j][i] = -1;
            }
        }
        char[] arrm = m.toCharArray();
        char[] arrn = n.toCharArray();
        System.out.print(EditDistTD(arrm, arrn));
    }
    public static int EditDistTD(char [] arrm, char[] arrn){
        for (int k = 0; k < n.length()+1; k++){
            D[k][0] = k;
        }
        for (int k = 0; k < m.length()+1; k++){
            D[0][k] = k;
        }

        for (int i = 1; i < arrn.length+1; i++){
            for (int j = 1; j < arrm.length+1; j++){
                int c = diff(arrn[i-1],arrm[j-1]);
                D[i][j] = min(D[i - 1][j] + 1, D[i][j-1] + 1, D[i - 1][j - 1] + c);
            }
        }
        /*System.out.println("arrm = " + arrm.length + " arrn = " + arrn.length);
        for (int i = 0; i < arrn.length+1; i++){
            for (int j = 0; j < arrm.length+1; j++){
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }*/
        return D[n.length()][m.length()];
    }
    public static int min(int a, int b, int c){
        if(a <= b && a <= c) return a;
        else if(c <= b && c <= a) return c;
        else if(b <= c && b <= a) return b;
        return 0;
    }
    public static int diff(char a, char b){
        if (a == b) return 0;
        return 1;
    }
}
