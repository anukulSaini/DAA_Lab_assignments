package Week2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
			System.out.println("Enter "+n+ "elements  --> ");
			int[] arr= new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}	
			System.out.println("Enter target --> ");
			int target=sc.nextInt();
        System.out.println("Answer--> "+numberOfPairs(arr,target));
		}
	}
	
	static int numberOfPairs(int arr[],int target) {
		Map<Integer,Integer> map = new HashMap<>();
		int ans=0;
		Arrays.sort(arr);
		for (int i=0;i<arr.length;i++) {
			int dif= arr[i]-target;
			if(map.containsKey(dif)) {
				ans++;
			}
			map.put(arr[i],i);
		}
		return ans;
	}

}
