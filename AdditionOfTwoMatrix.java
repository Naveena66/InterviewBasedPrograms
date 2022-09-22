package matrices;

public class AdditionOfTwoMatrix {
	public static int[][] addMatrix(int[][] a, int[][] b){
		int answer[][]=new int[3][3];
		for(int i=0;i<a.length;i++){    
			for(int j=0;j<b.length;j++){    
				answer[i][j]=a[i][j]+b[i][j]; 
			}      
		}  
		return answer;
	}
	public static void main(String args[]){    
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,4,3},{1,2,4}};

		int[][] result=addMatrix(a, b);    
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result.length;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}

	}
}