/*class Addition{
	public static void main(String args[]){
		add(344,433);
		add(424,732);
		add(341,809);
		add(8272,95276);
		add(63252,82726);
		add(861363,389636);
		add(12315,93833922);
		add(8763253,236213);
		add(763523,397771);
		add(735253,7646114);
		
	}
	public static void add(int z, int u){
		System.out.println(z+u);
	}
}*/


class Addition{
	public static void main(String args[]){
		int sum=add(2,3,9);
		System.out.println(sum);
		int sum1=add(2,3);
		System.out.println(sum1);
		int sum2=add(424,732);
		System.out.println(sum2);
		int sum3=add(267,332,943);
		System.out.println(sum3);
		int sum4=add(297,397,249);
		System.out.println(sum4);
		
	}
	public static int add(int z, int u){
		return (z+u);
	}
	public static int add(int z, int u,int x){
		return (z+u+x);
	}
}