package matrices;

public class SparseMatrix {
	public static void checkSparse(int[][] a){
		int count=0;
		for(int i=0;i<a.length;i++){    
			for(int j=0;j<a.length;j++){    
				if(a[i][j]==0) {
					count++; 
				}
			}      
		}  
		if(count>a.length) {
			System.out.println("Matrix will be Sparse");
		}else {
			System.out.println("Matrix will not be Sparse");
		}
	}
	public static void main(String args[]){    
		int a[][]={{4,0,0},{0,5,0},{0,0,6}};    
		checkSparse(a);
	}

}
