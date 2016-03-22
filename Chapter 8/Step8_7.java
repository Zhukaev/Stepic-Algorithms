// 8.7.4

import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        res.add(0);
        res.add(0);
        for (int i = 0; i < arr.length; i++) { 
			int stair = arr[i]; 
			res.add(Math.max(res.get(i+1), res.get(i)) + stair); 
		} 
		System.out.print(res.get(res.size() - 1));
    }
}
