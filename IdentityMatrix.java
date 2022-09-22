package matrices;

public class IdentityMatrix {
	public static void checkIdentity(int[][] a){
		boolean flag=true;
		for(int i=0;i<a.length;i++){    
			for(int j=0;j<a.length;j++){    
				if(i==j && a[i][j]!=1) {
					flag=false;
					break;
				}
				if(i!=j && a[i][j]!=0) {
					flag=false;
					break;
				}
			}      
		}  
		if(flag) {
			System.out.println("Matrix will be identity");
		}else {
			System.out.println("Matrix will not be identity");
		}
	}
	public static void main(String args[]){    
		int a[][]={{1,0,0},{0,1,0},{0,0,1}};    
		checkIdentity(a);
	}

}
