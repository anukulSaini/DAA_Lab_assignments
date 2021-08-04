package Week3;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Number of test case ");
		int t=sc.nextInt();
		for(int tc=0;tc<t;t--) {
			System.out.println("Enter array size --> ");
			int n = sc.nextInt();
			System.out.println("Enter "+n+ " unsorted elements  --> ");
			int[] arr= new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			selectionSort(arr,arr.length);
		}
		
	}
	
	public static void selectionSort(int[] arr,int n) {
		int swap=0;
		int comp=0;
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
				comp++;
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
			swap++;
		}
		for(int a:arr)
			System.out.print(a+" ");
		System.out.println();
		System.out.println("Swaps "+swap);
		System.out.println("Comparisions "+comp);
	}
	
}
