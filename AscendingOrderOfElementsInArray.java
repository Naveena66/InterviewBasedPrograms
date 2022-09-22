package arrays;

public class AscendingOrderOfElementsInArray {
	public static int[] ascendingOrder(int[] arr) {
		int[] answer = new int[arr.length];
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
		for(int i=0;i<arr.length;i++) {
			answer[i]=arr[i];
		}
		return answer;
	}
	public static void main(String[] args) {
		int[] arr= {25,11,7,75,56};
		int[] result=ascendingOrder(arr);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}

}
