/*class Subtraction{
	public static void main(String args[]){
		sub(93,74);
		sub(47,83);
		sub(87,43);
		sub(983,23);
		sub(542,95);
		sub(84,23);
		sub(894,849);
		sub(432,132);
		sub(7569,1238);
		sub(536,2424);
	}
	static void sub(int x,int y){
		System.out.println(x-y);
    }
}*/

class Subtraction{
	public static void main(String args[]){
		int sub=sub(9,4,2);
		System.out.println(sub);
		int sub1=sub(29,54,562);
		System.out.println(sub1);
		int sub2=sub(9,4);
		System.out.println(sub2);
		int sub3=sub(239,4,22);
		System.out.println(sub3);
		int sub4=sub(92,44,222);
		System.out.println(sub4);
		
	}
	public static int sub(int x,int y){
		return (x-y);
    }
	public static int sub(int x,int y,int z){
		return (x-y-z);
    }
}
