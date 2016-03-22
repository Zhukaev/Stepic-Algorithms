// 2.2.6

#include <iostream>

int main() {
    int a; 
    std::cin >> a;
    int fib[a];
    fib[0] = 0;
    fib[1] = 1;
    for (int i = 2; i <=a; i++){
        fib[i] = fib[i-1] + fib[i-2];
    }
    std::cout << fib[a];
    return 0;
}

// 2.2.7

#include <iostream>

int main() {
    int a; 
    std::cin >> a;
    int fib[a];
    fib[0] = 0;
    fib[1] = 1;
    for (int i = 2; i <=a; i++){
        fib[i] = (fib[i-1] + fib[i-2])%10;
    }
    std::cout << fib[a];
    return 0;
}

// 2.2.8

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long m = s.nextLong();
        long k = 0;
		long S[] = new long[10000000];
		S[0] = 0;
		S[1] = 1;
		for (int i =2; i < n; i++){
			S[i] = (S[i-1] + S[i-2]) % m;
			k = k + 1;
		    if ((S[i]==1) && (S[i-1]==0))
    			break;
		}
		long g = n % k;
		System.out.print(S[(int)g]);
    }
}