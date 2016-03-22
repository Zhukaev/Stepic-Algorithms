import java.util.*;

public class Step2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		List<Long> arr= new ArrayList<Long>();
		for (int i = 0; i < n; i++){
			arr.add(s.nextLong());
		}
		Map<Long, Integer> a = new HashMap<Long, Integer>() {
		};
		boolean test = false;
		for (int i = 0; i < n; i++){
			if (a.containsKey(arr.get(i))){
				a.put(arr.get(i),a.get(arr.get(i)) + 1);
				if (a.get(arr.get(i)) > n / 2){
					test = true;
				}
			}
			else {
				a.put(arr.get(i),1);
			}
		}
		if (test == true) System.out.print("1");
		else System.out.print("0");

	}
}