class P{

	public static void main(String gg[]){
	
		int i,j,k,p;
		for(i=1;i<=5;i++){
			for(j=5;j>=i;j--){
			System.out.print(" ");
			}
			for(k=1;k<=i;k++){
			System.out.print("*");
			}
			for(p=3;p<=i+1;p++){
			System.out.print("*");
			}
			System.out.println(" ");
			// System.out.println(i);
		}
	}
}