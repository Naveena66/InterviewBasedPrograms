package arrays;

public class CountOccuranceOfEachElement {
	public static void countOccurance(int[] arr) {
		int[] result=new int[arr.length];
		int visited=-1;
		for(int i=0;i<arr.length;i++) {
			int answer=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					answer++;
					result[j]=visited;
				}
			}
			if(result[i]!=visited) {
				result[i]=answer;
			}
		}
		for(int i=0;i<result.length;i++) {
			if(result[i]!=visited) {
				System.out.println(arr[i]+" >> "+result[i]);
			}
		}
		
		return;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,8,3,2,2,3,5,1};
		countOccurance(arr);
		
	}

}
