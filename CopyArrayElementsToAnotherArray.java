package arrays;

public class CopyArrayElementsToAnotherArray {
	public static int[] copyArray(int[] arr1) {
		int[] arr2=new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		
		return arr2;
	}
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		int[] result=copyArray(arr1);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		
	}

}
