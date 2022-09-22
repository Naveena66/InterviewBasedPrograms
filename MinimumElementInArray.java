package arrays;

public class MinimumElementInArray {
	public static int minimum(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int[] arr= {25,11,7,75,56};
		System.out.println(minimum(arr));
	}


}
