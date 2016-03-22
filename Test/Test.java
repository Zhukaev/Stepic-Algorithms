// 1

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner s = new Scanner(System.in);
		long a = s.nextInt();
		long b = s.nextInt();
		long x = a * b;
		long c,d;
		while(true){
			if (a >= b) {c = a % b; a = c;}
			else {d = b % a; b = d;}
			if (a == 0) {
				System.out.println(x / b);
				break;
			}
			else if (b == 0) {
				System.out.println(x / a);
				break;
			}
		}
		long finish = System.currentTimeMillis();
		long timeConsumedMillis = finish - start;
		//System.out.print(timeConsumedMillis);
	}
}


// 2


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n = s.nextLine();
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n.length(); i++){
			arr.add(Character.getNumericValue(n.charAt(i)));
		}
		int k;
		if (arr.get(arr.size() - 1) == 0)
			k = 0;
		else
			k = 1;
		for(int i = 0; i < arr.size() - 1; i++){
			if(arr.get(i) == arr.get(i+1)){}
			else k++;
		}
	//	for(int i = 0; i < arr.size(); i++)
	//	System.out.print(arr.get(i) + " ");
		System.out.print(k);
	}
}
