package arrays;

public class SecondMinElementInArray {
	public static int secondMinimum(int[] arr) {
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
		return arr[1];
	}
	public static void main(String[] args) {
		int[] arr= {25,11,7,75,56};
		System.out.println(secondMinimum(arr));
	}

}
