package Week2;

import java.util.Arrays;
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
			System.out.println("Enter "+n+ " sorted elements  --> ");
			int[] arr= new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}	
		
        int[] result = findSequence(arr);
    	System.out.println(Arrays.toString(result));
    	}

	}
	
	 static int binarysearch(int[] nums,int l,int r,int target){
	        if(l<=r){
	            int mid=(l+r)/2;
	            if(nums[mid]==target) return mid;
	            else if(nums[mid]>target)
	              return  binarysearch(nums,l,mid-1,target);
	            else
	               return binarysearch(nums,mid+1,r,target);
	        }
	        return -1;
	    }
	 
	 static int[] findSequence(int[] arr) {
		 int k=0;
		 boolean stop = false;
		 for(int i=0; (i<arr.length) && !stop;i++) {
			 for(int j=i; (j<arr.length)  && !stop;j++) {
				 int res= arr[i]+arr[j];
				  k= binarysearch(arr,j,arr.length-1,res);
				 if(k!=-1) {
					 arr[0]=i;
					 arr[1]=j;
					 arr[2]=k;
					 stop=true;
				 }
			 }
		 }
		 return new int[] {arr[0],arr[1],arr[2]};
	 }

}
