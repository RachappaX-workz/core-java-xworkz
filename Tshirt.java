/*class Tshirt {
	public static void main(String tshirt[]){
		String tShirtBrand[]={"Adidas","Puma","Highlander","Under Armour","Luis philippe","H&M","Peter England"};
		tShirtBrand[2]="Tommy Hilfiger";
		System.out.println(tShirtBrand[0]+"\n"+ tShirtBrand[1]+"\n"+ tShirtBrand[2]+"\n"+ tShirtBrand[3]+"\n"+ tShirtBrand[4]+"\n"+ tShirtBrand[5]+"\n"+ tShirtBrand[6]);
	}
}*/

class Tshirt {
	public static void main(String shirt[]){
		String tShirtBrands[]={"Adidas","Puma","Highlander","Under Armour","Luis philippe","H&M","Peter England"};
		for(String tShirtBrand:tShirtBrands){
		System.out.println(tShirtBrand);
	    }
	}
}













/*class Tshirt {
	public static void main(String tshirt[]){
		String tShirtBrand[]={"Adidas","Puma","Highlander","Under Armour","Luis philippe","H&M","Peter England"};
		int i=0;
		while(i<tShirtBrand.length){
			System.out.println(tShirtBrand[i]);
			i++;
		}
	}
} */

/*class Tshirt {
	public static void main(String tshirt[]){
		String tShirtBrand[]={"Adidas","Puma","Highlander","Under Armour","Luis philippe","H&M","Peter England"};
		int i=0;
		for(i=0;i<tShirtBrand.length;i++){
		System.out.println(tShirtBrand[i]);
	    }
	}
}*/

/*class Tshirt {
	public static void main(String tshirt[]){
		String tShirtBrand[]={"Adidas","Puma","Highlander","Under Armour","Luis philippe","H&M","Peter England"};
	    int i=0;
		do {
		System.out.println(tShirtBrand[i]);
		i++;
	    }
		while(i<tShirtBrand.length);
	}
}*/

/*class Tshirt{                                        //Java Method
	static int brand(int x,int y){
		return x+y;
	}
	public static void main(String tshirt[]){
		System.out.println(brand(4,5));
	}
}*/

/*class Tshirt{
	static int brand(int x){
		return x + 4;
	}
	public static void main(String tshirt[]){
		System.out.println(brand(5));
	}
}*/

/*class Tshirt{
	static void brand(){
		System.out.println("I'm Method");
	}
	public static void main(String tshirt[]){
		brand();
	}
}*/