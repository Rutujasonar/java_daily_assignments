class Number{
	public static void main(String[] args){
	int i;
	int j;
	for(i=1;i<=3;i++){
		for(j=1;j<=5;j++){
			if(j%2==1){
				System.out.print(" =");
			}else{
				System.out.print(" *");
			}
		}System.out.println();
	}
	}
}