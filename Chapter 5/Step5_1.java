// 5.1.4

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		List<Integer> firstarr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			firstarr.add(s.nextInt());
		int m = s.nextInt();
		/*List<Integer> secarr = new ArrayList<Integer>();
		for (int i = 0; i < m; i++)
			secarr.add(s.nextInt());
		for (int i = 0; i < m; i++){
			int b = secarr.get(i);
			System.out.print(BinarySearch(b,firstarr) + " ");	
		}*/
		int k = 1;
		int left = 0;
		int right = n - 1;
		for (int i = 0; i < m; i++)
			BinarySearch(s.nextInt(),1,left,right,firstarr);	
	}
	public static int BinarySearch (int b,int k,int left, int right, List<Integer> firstarr){
		if (firstarr.size() == 0){System.out.print("-1 "); return 0;}
//		System.out.println(firstarr.get(right / 2) + " <>= " + b + " left = " + left + " right " + right);
		if (right - left > 0 && firstarr.get((right + left) / 2) > b) {
			right = (right + left) / 2;
			//k = k + i;	
//			System.out.print(">" + k + ">");
			BinarySearch(b,k,left,right,firstarr);
			return 0;
		}
		else if (right - left > 0 && firstarr.get((right + left) / 2) < b){
			left = (left + right) / 2 + 1;
			//k = k + left;	
//			System.out.print("<" + k + "<");
			BinarySearch(b,k,left,right,firstarr);
			return 0;
		}
		else if (firstarr.get((right + left) / 2) == b){
			k = k + (left + right) / 2;
			System.out.println(k + " ");
			return 0;
		}
		else if (right - left > 0 && firstarr.get((right + left) / 2) != b){
			System.out.println("-1 ");
			return 0;
		}
		System.out.println("-1 ");
		return 0;
	}
}