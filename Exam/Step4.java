import java.util.*;

public class Step4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		List<Integer> arrn = new ArrayList<Integer>();
		for (int i = 0; i < n; i++){
			arrn.add(i);
		}
		List<Integer> arrm= new ArrayList<Integer>();
		for (int i = 0; i < n; i++){
			arrm.add(i);
		}
//		System.out.println(arrn.get(0) + " " + arrm.get(0));
		int[][] arr = new int[n+1][n+1];
		for (int i = 0; i < n + 1; i++){
			arr[0][i] = 1;
		}
		for(int i = 1; i < n+1; i++){
			for (int j = 1; j < n+1; j++){
				if (i >= j)
				arr[i][j] = (arr[i - j][j]+arr[i][j-1])%1000000007;
				else arr[i][j] = (arr[i][j]+arr[i][j-1])%1000000007;
			}
		}
		//вывод
/*		for(int i = 0; i < n + 1; i++){
			for(int j = 0; j < n + 1; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}*/
		System.out.print(arr[n][n]);
	}
}