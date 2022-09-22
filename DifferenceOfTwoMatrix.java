package matrices;

public class DifferenceOfTwoMatrix {
	
	public static int[][] addMatrix(int[][] a, int[][] b){
		int answer[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {   
				answer[i][j]=a[i][j]-b[i][j]; 
			}      
		}  
		return answer;
	}
	public static void main(String args[]){    
		int a[][]={{4,5,6},{3,4,1},{1,2,3}};    
		int b[][]={{2,0,3},{2,3,1},{1,1,1}};

		int[][] result=addMatrix(a, b);    
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}

	}

}
