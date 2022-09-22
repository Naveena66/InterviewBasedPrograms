package matrices;

public class DisplayLowerTriangularSquareMatrix {
	public class DisplayLowerTriangularMatrix {
		public static int[][] display(int[][] a){
			int answer[][]=new int[3][3];
			if(a.length!=a[0].length){
				System.out.println("matrix is not square matrix");
			}else {
				for(int i=0;i<a.length;i++){    
					for(int j=0;j<a.length;j++){    
						if(j>i) {
							answer[i][j]=0;
						}else {
							answer[i][j]=a[i][j];
						}
					}      
				} 
			}
			return answer;
		}
		public static void main(String args[]){    
			int a[][]={{1,3,4},{2,4,3},{3,4,5}};    

			int[][] result=display(a);    
			for(int i=0;i<result.length;i++) {
				for(int j=0;j<result.length;j++) {
					System.out.print(result[i][j]+" ");
				}
				System.out.println();
			}

		}

	}
}
