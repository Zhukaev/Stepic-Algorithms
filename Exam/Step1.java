import java.util.*;

public class Step1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		List<Long> arr= new ArrayList<Long>();
		for (int i = 0; i < n; i++){
			arr.add(s.nextLong());
		}
		if (arr.size() == 3 && arr.get(0) !=1){
			throw new RuntimeException(arr.toString());
		}
		long a = Collections.max(arr);
		arr.remove(arr.indexOf(a));
		long b = Collections.max(arr);
		System.out.print(a*b);
	}
}
