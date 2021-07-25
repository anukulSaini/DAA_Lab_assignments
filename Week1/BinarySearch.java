package Week1;
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
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
		System.out.println("Present at "+ans);

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


}
