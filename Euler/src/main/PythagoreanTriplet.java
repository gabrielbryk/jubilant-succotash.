package main;

public class PythagoreanTriplet {

	public static void main(String[] args) {		
		int c = 0;
		for(int a = 1;a<1000;a++){
			for(int b = 1;b<1000;b++){
				c = getPyth(a, b);
				if(c != 0 && checkadd(a, b, c)){
					System.out.println("Final= a:" + a + " b:" + b + " c:" + c + "Product: " + (a*b*c));
					System.exit(1);
				}
			}
		}
	}
	public static boolean checkadd(int a,int b,int c){
		if(a+b+c==1000){
			return true;
		}
		else{
			return false;
		}
	}
	public static int getPyth(int a, int b){
		double c = ((a*a) + (b*b));
		c = Math.sqrt(c);
		if((int)(c) == c){			
			System.out.println("a:" + a + " b:" + b + " c:" + c);
			return (int) c;
		}
		else{
			return 0;
		}
	}
}
