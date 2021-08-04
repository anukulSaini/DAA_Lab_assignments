package Week3;

import java.util.Scanner;

public class Problem1 {

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
		insertionSort(arr,arr.length);
		}
	
	}
	
	public static void insertionSort(int[] arr,int n ) {
		
		int comp=0;
		int shift=0;
		for(int i=1;i<n;i++) {
			int value = arr[i];
			int hole=i;
			shift++;
			while(hole>0 && arr[hole-1]>value) {
				arr[hole]=arr[hole-1];
				hole--;
				comp++;
				shift++;
			}
			arr[hole]=value;
		}
		for(int j:arr)
			System.out.print(j+" ");
		System.out.println();
		System.out.println("Shifts "+shift);
		System.out.println("Comparisions "+comp);
		
	}
}
