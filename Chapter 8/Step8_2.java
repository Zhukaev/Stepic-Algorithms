// 8.2.5

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int max;
		int[] inputarr = new int[n];
		int[] d = new int[n];
		for (int i = 0; i < n; i++){
			inputarr[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++){
			d[i] = 1;
			for (int j = 0;j < i; j++){
				if (inputarr[i] % inputarr[j] == 0){
					d[i] = max (d[i], 1 + d[j]);
				}
			}
		}
		//for (int i = 0; i < n; i++){
		//	System.out.print(d[i] + " ");
		//}
		int result = d[0];
		for (int i = 0;i < n; i++){
			result = max(result, d[i]);
		}
		System.out.println();
		System.out.print(result);
	}
	public static int max(int a, int b){
		if (a > b) return a;
		else return b;
	}
}

//8.2.6

import java.util.Scanner;
import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max;
        List<Integer> pos = new ArrayList<Integer>();
        int[] inputarr = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++){
            inputarr[i] = s.nextInt();
        }
            for (int i = 0; i < n; i++){
                d[i] = 1;
                for (int j = 0; j < i; j++){
                    if (inputarr[i] <= inputarr[j]){
                        d[i] = max (d[i], 1 + d[j]);
                    }
                }
            }
            
            int result = d[0];
            for (int i = 0;i < n; i++){
                result = max(result, d[i]);
            }
            System.out.println(result);
            //for (int i = 0; i < n; i++){
            //    System.out.print(d[i] + " ");
            //}
            int k = n - 1;
            while (result > 0){
            	if (d[k] == result){
            		pos.add(0, k + 1);
            		result = result - 1;
            	}
            	k--;
            }
            for (int i = 0; i < pos.size(); i++){
            System.out.print(pos.get(i) + " ");
            }
        }
    public static int max(int a, int b){
        if (a > b) return a;
        else return b;
    }
}