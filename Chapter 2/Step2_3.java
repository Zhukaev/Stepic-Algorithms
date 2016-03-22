// 2.3.5

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c,d;
        while(true){
            if (a >= b) {c = a % b; a = c;}
            else {d = b % a; b = d;}
            if (a == 0) {
                System.out.print(b);
                break;
            }
            else if (b == 0) {
                System.out.print(a);
                break;
            }
        }
    }
}