class Number{
	public static void main(String[] args){
	int a=20;
	int b=30;
	int c=40;
	if(a<=b && a<=c){
		System.out.print(a+" is smallest among all numbers");
	}else if(b<=a && b<=c){
		System.out.print(b+" is the smallest among all numbers");
	}else{
		System.out.print(c+" is the smallest among all numbers");
	}
	}
}