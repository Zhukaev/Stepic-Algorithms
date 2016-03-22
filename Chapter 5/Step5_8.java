// 5.8.3

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = (s.nextInt());
		List<Integer> sortarr = new ArrayList<Integer>();
		for (int i = 0; i < 11; i++){
			int k = 0;
			for (int j = 0; j < n; j++){
				if (arr[j] == i) k++;
			}
			for (int c = 0; c < k; c++)
			sortarr.add(i);
		}
		for (int i = 0; i < n; i++)
			System.out.print(sortarr.get(i) + " ");
	}
}