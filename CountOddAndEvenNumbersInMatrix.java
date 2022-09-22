package matrices;

public class CountOddAndEvenNumbersInMatrix {
	public static void checkOddOrEven(int[][] a){
		int countEven=0;
		int countOdd=0;
		for(int i=0;i<a.length;i++){    
			for(int j=0;j<a.length;j++){    
				if(a[i][j]%2==0) {
					countEven++;
				}else {
					countOdd++;
				}
			}      
		} 
		System.out.print("Even numbers count: "+countEven+"\nOdd numbers count: "+countOdd);
		return;
	}
	public static void main(String args[]){    
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    

		checkOddOrEven(a);
	}

}
