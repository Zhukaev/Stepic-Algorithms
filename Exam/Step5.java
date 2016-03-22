import java.util.*;

public class Step5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++){
			arr.add(s.nextInt());
		}
		Collections.sort(arr);
		while(arr.get(0) + arr.get(1) <= m){
			arr.remove(0);
		}
		System.out.print(arr.size());
	}
}