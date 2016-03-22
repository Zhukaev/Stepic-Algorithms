// 5.4.5

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static long inv = 0;
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++){
			arr.add(s.nextInt());
		}
		List<Integer> sortarr = MergeSort(arr);
//		for (int i = 0; i < sortarr.size(); i++)
//			System.out.print(sortarr.get(i) + " ");
		System.out.print(inv);
	}

	public static List<Integer> MergeSort(List<Integer> inputArr) {
		if (inputArr.size() < 2)
			return inputArr;
		int half = inputArr.size() / 2;
		List<Integer> left = MergeSort(inputArr.subList(0,half));
		List<Integer> right = MergeSort(inputArr.subList(half,inputArr.size()));
		List<Integer> newarr = Merge(left, right);
		return newarr;
	}

	public static List<Integer> Merge(List<Integer> left,List<Integer> right) {
		int j = 0; int k = 0;
		List<Integer> newarr = new ArrayList<Integer>();
		for(int i = 0; i < left.size() + right.size(); i++){
			if(j < left.size() && k < right.size() && left.get(j) <= right.get(k)){
				newarr.add(left.get(j));
				j++;
			}
			else if(j < left.size() && k < right.size() && left.get(j) > right.get(k)){
				newarr.add(right.get(k));
				k++;
				Main.inv = Main.inv + left.size() - j;
			}
			else if (k < right.size()){
				newarr.add(right.get(k));
				k++;
			}

			else if (j < left.size()){
				newarr.add(left.get(j));
				j++;
			}
		}

		return newarr;
	}
}