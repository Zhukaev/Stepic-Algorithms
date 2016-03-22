//3.1.9 

// Example program
#include <iostream>
int main()
{
    int a = 0;
    std::cin >> a;
    int arr[a][2];
    int temp[1][2];
    int final[100];
    int kol = 1;
    for (int j = 0; j < a; j++){
        for (int i = 0; i < 2; i++){
            std::cin >> arr[j][i];
            //std::cout << arr [j][i]; // отладка
        }
        //std::cout << std::endl;
    }
    for (int i = 0; i < a - 1; i++){
        for (int j = 0; j < a - i - 1; j++){
            if (arr[j][1] > arr[j + 1][1]) { 
                for (int k = 0; k < 2; k++) temp[1][k] = arr [j][k];
                for (int k = 0; k < 2; k++) arr[j][k] = arr[j+1][k];
                for (int k = 0; k < 2; k++) arr[j+1][k] = temp[1][k];
            }
        }
    }
    int j = 1;
    final[0] = arr[0][1];
    int max = arr[0][1];
    for (int i = 0; i < a; i++){
        if (max < arr[i][0]){
            max = arr[i][1];
            final[j] = max;
            j++;
            
        }
    }
    std::cout << j << std::endl;
    for (int i = 0; i < j; i++){
        std::cout << final[i] << std::endl;
    }
    /*/
    for (int j = 0; j < a; j++){
        for (int i = 0; i < 2; i++){
            std::cout << arr [j][i];
        }
        std::cout << std::endl;
    }
    /*/
}

// 3.1.10

/* package whatever; // don't place package name! */
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n; // количество предметов
		double W; // вместимость рюкзака
		double price = 0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		W = s.nextInt();
		double[][] R = new double[n][3]; // цена | вес | цена за кг
		double[][] temp = new double[1][3];
		//заполнение маассива
		for (int i = 0; i < n; i++){
			for ( int j = 0; j < 2; j++){
			R[i][j] = s.nextInt();
		}
		R[i][2] = R[i][0]/R[i][1];
    }
		//сортировка массива
		for (int i = 0; i < n - 1; i++){
			for (int j = 0; j < n - i - 1; j++){
				if (R[j][2] < R[j + 1][2]) { 
					for (int k = 0; k < 3; k++) temp[0][k] = R[j][k];
					for (int k = 0; k < 3; k++) R[j][k] = R[j+1][k];
					for (int k = 0; k < 3; k++) R[j+1][k] = temp[0][k];
				}
			}
		}
		/*/вывод отсортированного массива
		for (int i = 0; i < n; i++){
			for ( int j = 0; j < 3; j++){
				System.out.print(R[i][j] + " ");
			}
			System.out.println();
    }*/
		//заполняем рюкзак
		while (true){
			for (int i = 0; i < n; i++){
				if (W == 0) break;
				else if (R[i][1] <= W){
					W = W - R[i][1];
					price = price + R[i][0];
                //std::cout << "W = " << W << " price = " << price << " R[i][0] = " << R[i][0] << std::endl;
				}
				else if (R[i][1] > W){
					price = price + R[i][0]*W/R[i][1];
					W = 0;
                //std::cout << "W = " << W << " price = " << price << " R[i][0] = " << R[i][0] << std::endl;
				}
			}    
			break;
		}
		System.out.print(price);
	}
}

//3.1.11

/* package whatever; // don't place package name! */
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int[] b;
		b = new int [50000];
		int i = 0;
		while (true){
			if (a <= 0) break;
			else if (a > i){
				a = a - i - 1;
				i++;
				b[i - 1] = i;
				//System.out.println("i = " + i + " a = " + a);
			}
			else if (a <= i){
			    b[i-1] = b[i-1] + a;
			    a = 0;
			    //System.out.println("i = " + i + " a = " + a);
			}
		}
        System.out.println(i);
		for (int j = 0; j < i; j++){
			System.out.print(b[j] + " ");
			
		}
		//System.out.print(a);
	}
}