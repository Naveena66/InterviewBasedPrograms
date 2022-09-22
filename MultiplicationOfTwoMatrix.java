package matrices;

public class MultiplicationOfTwoMatrix {
	public static int[][] productMatrix(int[][] a, int[][] b){
		int answer[][]=new int[3][3];
		for(int i=0;i<a.length;i++){  
			for(int j=0;j<b.length;j++){
				answer[i][j]=0;
				for(int k=0;k<a.length;k++) {
					answer[i][j]+=a[i][k]*b[k][j]; 
				}
			}      
		}  
		return answer;
	}
	public static void main(String args[]){    
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};

		int[][] result=productMatrix(a, b);    
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result.length;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}

	}

}
