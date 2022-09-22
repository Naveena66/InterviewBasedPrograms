package arrays;

public class SecondMaxElementInArray {
	public static int secondMaximum(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[arr.length-2];
	}
	public static void main(String[] args) {
		int[] arr= {25,11,7,75,56};
		System.out.println(secondMaximum(arr));
	}
	
}
