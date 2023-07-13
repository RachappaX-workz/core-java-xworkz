/*class Multiplication {
	public static void main(String aqrgs[]){
		mul(344,433);
		mul(424,732);
		mul(341,809);
		mul(4256,8736);
		mul(6377,98770);
		mul(36528,9338);
		mul(73535,927);
		mul(6532,9289);
		mul(82626,1010);
		mul(862682,91165);
	}
	public static void mul(int x, int y){
		System.out.println(x*y);
	}
}*/


class Multiplication {
	public static void main(String aqrgs[]){
		long mul=mul(2,3,4);
		System.out.println(mul);
		long mul1=mul(22,32);
		System.out.println(mul1);
		long mul2=mul(24,3);
		System.out.println(mul2);
		long mul3=mul(52,33,54);
		System.out.println(mul3);
		long mul4=mul(82,23,40);
		System.out.println(mul4);
	}
	public static void mul(int x, int y){
		return (x*y);
	}
	public static long mul(long x, long y,long z){
		return (x*y*z);
	}
}