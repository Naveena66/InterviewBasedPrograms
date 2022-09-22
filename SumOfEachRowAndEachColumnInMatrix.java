package matrices;

public class SumOfEachRowAndEachColumnInMatrix {
	public static void sumRowOrColumn(int[][] a){
		int[] sumRowArray=new int[a.length];
		int[] sumColumnArray=new int[a.length];

		int sumRow;
		int sumColumn;
		for(int i=0;i<a.length;i++){   
			sumRow=0;
			for(int j=0;j<a[0].length;j++){    
				sumRow+=a[i][j];
			}   
			sumRowArray[i]=sumRow;
		} 
		for(int i=0;i<a[0].length;i++){
			sumColumn=0;
			for(int j=0;j<a.length;j++){    
				sumColumn+=a[j][i];
			}  
			sumColumnArray[i]=sumColumn;
		} 
		for(int i=0;i<a.length;i++) {
			System.out.println("Sum of "+(i+1)+"st row: "+sumRowArray[i]);
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("Sum of "+(i+1)+"st column: "+sumColumnArray[i]);
		}
		return ;
	}
	public static void main(String args[]){    
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    

		sumRowOrColumn(a);

	}

}
