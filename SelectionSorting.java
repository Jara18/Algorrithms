package sorting_algo;

import java.util.Scanner;

public class SelectionSorting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<n-1; i++) {
			int min = i;
			for(int j=i; j<n; j++) {
				if(a[j]<a[min]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int e:a) {
			System.out.print(e+" ");
		}
		
	}

}
