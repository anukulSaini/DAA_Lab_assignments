package Week2;

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
			System.out.println("Enter "+n+ " sorted elements  --> ");
			int[] arr= new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("no.? --> ");
			int s= sc.nextInt();
			int ans = binarysearch(arr,0,n-1,s);
			if(ans==-1) 
				System.out.println("Not Present");
			else
			    System.out.println(s+ " Present  "+ (lower(arr,0,n-1,s,arr.length-1)-upper(arr,0,n-1,s,arr.length-1)+1));
			
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
	
	  static int upper(int[] arr,int l,int r,int x,int n){
	        if(l<=r){
	        int mid = (l+r)/2;
	        if( arr[mid]==x  && arr[mid-1]!=x){
	            return mid;
	        }
	        if( arr[mid]==x  && arr[mid-1]==x){
	            return upper(arr,l,mid-1,x,n);
	        }
	        else if(x<arr[mid]){
	            return upper(arr,l,mid-1,x,n);
	        }
	        else {
	            return upper(arr,mid+1,r,x,n);
	        }
	        }
	        return -1;
	    }
	  
	  static int lower(int[] arr,int l,int r,int x,int n){
	        if(r>=l){
	        int mid = (l+r)/2;
	        if(mid ==r) {
	        	return r;
	        }
	        else if(arr[mid]==x && arr[mid+1]!=x){
	            return mid;
	        }
	        else if(arr[mid]==x && arr[mid+1]==x) {
	        	return lower(arr,mid+1,r,x,n);
	        }
	        else if(x<arr[mid]){
	            return lower(arr,l,mid-1,x,n);
	        }
	        else if(x>arr[mid]){
	            return lower(arr,mid+1,r,x,n);
	        }
	        }
	        return -1;
	    }

}
