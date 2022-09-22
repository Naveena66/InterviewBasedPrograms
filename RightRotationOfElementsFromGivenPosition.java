package arrays;

public class RightRotationOfElementsFromGivenPosition {
	public static int[] rightRotation(int[] arr,int position) {
		int[] answer=new int[arr.length];
		for(int i=0;i<position;i++) {
			int j,last;
			last=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		for(int i=0;i<arr.length;i++) {
			answer[i]=arr[i];
		}
		return answer;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int position=3;
		int[] result=rightRotation(arr, position);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
	}
}
