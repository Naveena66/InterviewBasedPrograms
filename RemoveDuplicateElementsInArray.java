package arrays;

public class RemoveDuplicateElementsInArray {
	public static int[] removeDuplicates(int[] arr) {
		int[] answer=new int[100];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				answer[j++]=arr[i];
			}
		}
		answer[j++]=arr[arr.length-1];
		return answer;
	}
	public static void main(String[] args) {
		int[] arr= {10,20,20,30,30,40,50,50};
		int[] result=removeDuplicates(arr);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}

}
