class multiplication{
	public static void main(String[] args){
		int i,j,k;
	
		int[][] arr1=new int[2][2];
		int[][] arr2=new int[2][2];
		int[][] arr3=new int[2][2];
		int index=0;
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				arr1[i][j]=Integer.parseInt(args[index++]);
			}
		}
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				arr2[i][j]=Integer.parseInt(args[index++]);
			}
		}
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				for (k = 0; k < 2; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
			}
		}
		System.out.println("Resultant Matrix:");
            for (i = 0; i <2; i++) {
                for (j = 0; j <2; j++) {
                    System.out.println(arr3[i][j] + " ");
                }
                System.out.println();
            }
	}
}
