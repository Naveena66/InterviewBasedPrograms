package matrices;

public class TransposeOfGivenMatrix {
	public static int[][] transpose(int[][] a){
		int answer[][]=new int[3][3];
		for(int i=0;i<a.length;i++){    
			for(int j=0;j<a.length;j++){    
				answer[i][j]=a[j][i]; 
			}      
		}  
		return answer;
	}
	public static void main(String args[]){    
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    

		int[][] result=transpose(a);    
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result.length;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}

	}

}
