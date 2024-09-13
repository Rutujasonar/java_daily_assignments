class pattern{
	public static void main(String[] args){
		int a=10;
		int b=20;
		int c=30;
		
		int largest = b;
		int secondLargest = c;

		if(c>largest){
			secondLargest=largest;
			largest=c;
		}else {if(c>secondLargest){
			secondLargest=c;
		}}

		if(a>largest){
			secondLargest=largest;
			largest=a;
		}else{ if(a>secondLargest){
			secondLargest=a;
		}}

		System.out.println(secondLargest+" is the second largest");
		
	}
}