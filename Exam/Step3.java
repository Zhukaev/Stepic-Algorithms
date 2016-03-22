import java.util.*;

public class Step3 {
	static long max(long a, long b){
		if (a > b) return a;
		return b;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		List<Long> arrn = new ArrayList<Long>();
		for (int i = 0; i < n; i++){
			arrn.add(s.nextLong());
		}
		int m = s.nextInt();
		List<Long> arrm= new ArrayList<Long>();
		for (int i = 0; i < m; i++){
			arrm.add(s.nextLong());
		}
//		System.out.println(arrn.get(0) + " " + arrm.get(0));
		long[][] arr = new long[n+1][m+1];
		for(int i = 1; i < n + 1; i++){
			arr[i][0] = 0;
		}
		for(int i = 1; i < m + 1; i++){
			arr[0][i] = 0;
		}

		for(int i = 1; i < n+1; i++){
			for (int j = 1; j < m+1; j++){
				if (arrn.get(i-1).equals(arrm.get(j-1))){
				//	System.out.println("==" + arrn.get(i-1) + " " + arrm.get(j-1));
					arr[i][j] = arr[i-1][j-1] + 1;
				}
				else {
				//	System.out.println("!=" + arrn.get(i-1) + " " + arrm.get(j-1));
					arr[i][j] = max(arr[i - 1][j], arr[i][j - 1]);
				}
			}
		}
		//вывод
/*		for(int i = 0; i < n + 1; i++){
			for(int j = 0; j < m + 1; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}*/
		System.out.print(arr[n][m]);
	}
}