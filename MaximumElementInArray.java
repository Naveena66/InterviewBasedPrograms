package arrays;

public class MaximumElementInArray {
	public static int maximum(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr= {25,11,7,75,56};
		System.out.println(maximum(arr));
	}

}
