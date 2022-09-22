package matrices;

public class IdenticalMatrix {
	public static void checkIdentical(int[][] a, int[][] b){
		boolean flag=true;
		for(int i=0;i<a.length;i++){    
			for(int j=0;j<b.length;j++){    
				if(a[i][j]!=b[i][j]) {
					flag=false;
					break;
				}
			}      
		}  
		if(flag) {
			System.out.println("Matrices are Identical");
		}else {
			System.out.println("Matrices are not identical");
		}
	}
	public static void main(String args[]){    
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,4,3},{3,4,5}};
		checkIdentical(a, b);
	}

}
