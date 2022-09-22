package arrays;

public class LeftRotationOfElementsFromGivenPosition {
	public static int[] leftRotation(int[] arr,int position) {
		int[] answer=new int[arr.length];
		for(int i=0;i<position;i++) {
			int j,first;
			first=arr[0];
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		for(int i=0;i<arr.length;i++) {
			answer[i]=arr[i];
		}
		return answer;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int position=3;
		int[] result=leftRotation(arr, position);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
	}

}
