package Week3;

import java.util.Scanner;

public class Problem3 {

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
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			
        int c=0;
        sort(arr);
        
        for(int i=0;i<n-1;i++) {
        	if(arr[i]==arr[i+1]) {
        		System.out.println("YES");
        		c=5;
        	   break;
        	}
        }
        if(c!=5)//just checking if yes is not printed.
        System.out.println("No");
 
		}
        
		
	}

	 static void heapify(int arr[], int n, int i)
	    {
	        int largest = i; 
	        int l = 2 * i + 1; 
	        int r = 2 * i + 2; 
	        if (l < n && arr[l] > arr[largest])
	            largest = l;
	        if (r < n && arr[r] > arr[largest])
	            largest = r;
	        if (largest != i) {
	            int swap = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = swap;
	            heapify(arr, n, largest);
	        }
	    }   
	 
	 static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
	 static public void sort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = n / 2 - 1; i >= 0; i--)
	            heapify(arr, n, i);
	        for (int i = n - 1; i > 0; i--) {
	            int temp = arr[0];
	            arr[0] = arr[i];
	            arr[i] = temp;
	            heapify(arr, i, 0);
	        }
	    }
	
}
