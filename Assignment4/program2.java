class Pattern{
	public static void main(String args[]){
	int a=1;
	int sq;
	for(int i=1;i<=5;i++){
	if(i%2==1){
		sq=a*a*a;
		System.out.print(sq+" ");
	}else{
		sq=a*a;
		System.out.print(sq+" ");
	}a++;
	}
	}
}