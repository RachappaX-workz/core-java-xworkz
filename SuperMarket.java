/*class SuperMarket{
	//show 5 vegetables
	static String vegetable1="Potato";
	static String vegetable2="Carrot";
    static String vegetable3="Beans";
	static String vegetable4="Brinjal";
	static String vegetable5="Onion";
	static String biscuit1="Parle";
	static String biscuit2="Anmol ";
	static String biscuit3="Brittania";
	static String biscuit4="Good Day";
	static String biscuit5="Unibic";
	static String biscuit6="Orian";
	static String biscuit7="Sunfeast";
	static String biscuit8="NutriChoice";
	static String biscuit9="Cremica";
	static String biscuit10="Cadbury";
	static String perfume1="Denver";
	static String perfume2="Perk Avenue";
	static String perfume3="One8";
	static String perfume4="Puma";
	static String perfume5="Jaguar";
	static String perfume6="Adidas";
	static String perfume7="Creed Aventus";
	static String perfume8="Dior Sauvage";
	static String perfume9="Baccarat Rouge";
	static String perfume10="Armani";
	public static void main(String market[]){
		System.out.println("Main started\n");
		System.out.println("List of vegetables are:");
		System.out.println("1st Rack "+vegetable1);
		System.out.println("2nd Rack "+vegetable2);
		System.out.println("3rd Rack "+vegetable3);
		System.out.println("4th Rack "+vegetable4);
	    System.out.println("5th Rack "+vegetable5);
		System.out.println("\n");
		System.out.println("List of biscuits are:");
		System.out.println("6th Rack "+biscuit1);
		System.out.println("7th Rack "+biscuit2);
		System.out.println("8th Rack "+biscuit3);
		System.out.println("9th Rack "+biscuit4);
		System.out.println("10th Rack "+biscuit5);
		System.out.println("11th Rack "+biscuit6);
		System.out.println("12th Rack "+biscuit7);
		System.out.println("13th Rack "+biscuit8);
		System.out.println("14th Rack "+biscuit9);
		System.out.println("16th Rack "+biscuit10);
		System.out.println("\n");
		System.out.println("List of perfumes are:");
		System.out.println("17th Rack "+perfume1);
		System.out.println("18th Rack "+perfume2);
		System.out.println("19th Rack "+perfume3);
		System.out.println("20th Rack "+perfume4);
		System.out.println("21th Rack "+perfume5);
		System.out.println("22th Rack "+perfume6);
		System.out.println("23th Rack "+perfume7);
		System.out.println("24th Rack "+perfume8);
		System.out.println("25th Rack "+perfume9);
		System.out.println("26th Rack "+perfume10);
		System.out.println("\n");
		System.out.println("Main ended");
	}
	
}*/
//biscuits - 10
//perfumes - 10
//groceries - 10


//Array -- It is a container which stores group of similar type of data/value into a single reference..
//Datatype variableNamae[] = {value1,value2,...};
//index = noOfElements - 1
//Array Length - variableName.length

//Using Java Array - Collection of maore than one elements/data of same Data types../
/*class SuperMarket {
	static String[] vegetable={"Potato","Carrot","Beans","Brinjal","Onion"};
	static String[] perfume={"one8","Jaguar","Perk Avenue","Puma","Adidas"," Denver","Creed Aventus","Dior Sauvage","Dior Sauvage","Armani"};
	static String[] biscuit={"Parle","Brittania","Good Day","Anmol","Unibic","Orian","Sunfeast","NutriChoice","Cremica","Cadbury"};
	public static void main(String market[]){
			System.out.println("Main started\n");
		    System.out.println("List of vegetables");
			System.out.println("1st Rack "+vegetable[0]);
			System.out.println("2st Rack "+vegetable[1]);
			System.out.println("3st Rack "+vegetable[2]);
			System.out.println("4st Rack "+vegetable[3]);
			System.out.println("5st Rack "+vegetable[4]);
			System.out.println("List of biscuits are:\n");
			System.out.println("6th Rack "+biscuit[0]);
			System.out.println("7th Rack "+biscuit[1]);
			System.out.println("8th Rack "+biscuit[2]);
			System.out.println("9th Rack "+biscuit[3]);
			System.out.println("10th Rack "+biscuit[4]);
			System.out.println("11th Rack "+biscuit[5]);
			System.out.println("12th Rack "+biscuit[6]);
			System.out.println("13th Rack "+biscuit[7]);
			System.out.println("14th Rack "+biscuit[8]);
			System.out.println("16th Rack "+biscuit[9]);
			System.out.println("List of perfumes are:\n");
			System.out.println("17th Rack "+perfume[0]);
			System.out.println("18th Rack "+perfume[1]);
			System.out.println("19th Rack "+perfume[2]);
			System.out.println("20th Rack "+perfume[3]);
			System.out.println("21th Rack "+perfume[4]);
			System.out.println("22th Rack "+perfume[5]);
			System.out.println("23th Rack "+perfume[6]);
			System.out.println("24th Rack "+perfume[7]);
			System.out.println("25th Rack "+perfume[8]);
			System.out.println("26th Rack "+perfume[9]);
			System.out.println("Main ended");
	}
}*/


/*class SuperMarket {
	static String vegetable[]={"Potato","Carrot","Beans","Brinjal","Onion","Tomato","Corn","Radish","Cucumber","Okra"};
	static String perfume[]={"one8","Jaguar","Perk Avenue","Puma","Adidas"," Denver","Creed Aventus","Dior Sauvage","Dior Sauvage","Armani"};
	static String biscuits[]={"Parle","Brittania","Good Day","Anmol","Unibic","Orian","Sunfeast","NutriChoice","Cremica","Cadbury"};
	static String groceries[]={"Salt","Pepper","Cooking Oil","Veginar","Honey","Chilly Powder","Ginger","Sugar","Garlic","Rice"};
	static String alcohol[] = {"Whiskey", "Vodka", "Rum", "Gin", "Tequila", "Beer", "Wine", "Scotch", "Brandy", "Sake",
                            "Bourbon", "Absinthe", "Cognac", "Rye", "Rum and Coke", "Mojito", "Margarita", "Martini",
                            "Sangria", "Mimosa", "Piña Colada", "Old Fashioned", "Negroni", "Manhattan", "Caipirinha",
                            "Moscow Mule", "Cosmopolitan", "Mai Tai", "Irish Coffee", "Gimlet"};


	public static void main(String market[]){
			System.out.println("Main started\n");
		    System.out.println("List of vegetables");
			System.out.println(vegetable[0]+ "\n"+vegetable[1]+ "\n"+vegetable[2]+ "\n"+vegetable[3]+ "\n"+vegetable[4]+ "\n"+vegetable[5]+ "\n"+vegetable[6]+ "\n"+vegetable[7]+ "\n"+vegetable[8]+ "\n"+vegetable[9]+"\n");
			System.out.println("List of perfumes");
			System.out.println(perfume[0]+"\n"+ perfume[1]+"\n"+ perfume[2]+"\n"+ perfume[3]+"\n"+perfume[4]+"\n"+ perfume[5]+"\n"+ perfume[6]+"\n"+ perfume[7]+"\n"+ perfume[8]+"\n"+ perfume[9]+"\n");
			System.out.println("List of biscuits");
			System.out.println(biscuits[0]+"\n"+ biscuits[1]+"\n"+ biscuits[2]+"\n"+ biscuits[3]+"\n"+ biscuits[4]+"\n"+ biscuits[5]+"\n"+ biscuits[6]+"\n"+ biscuits[7]+"\n"+ biscuits[8]+"\n"+ biscuits[9]+"\n");
			System.out.println("List of groceries");
			System.out.println(groceries[0]+ "\n" + groceries[1]+ "\n" + groceries[2]+ "\n" + groceries[3]+ "\n" + groceries[4]+ "\n" + groceries[5]+ "\n" + groceries[6]+ "\n" + groceries[7]+ "\n" + groceries[8]+ "\n" + groceries[9]);
			System.out.println(alcohol[0] +"\n"+ alcohol[1] +"\n"+ alcohol[2] +"\n"+ alcohol[3] +"\n"+ alcohol[4] +"\n"+ alcohol[5] +"\n"+ alcohol[6] +"\n"+ alcohol[7] +"\n"+ alcohol[8] +"\n"+ alcohol[9] +"\n"+ alcohol[10] +"\n"+ alcohol[11] +"\n"+ alcohol[12] +"\n"+ alcohol[13] +"\n"+ alcohol[14] +"\n"+ alcohol[15] +"\n"+ alcohol[16] +"\n"+ alcohol[17] +"\n"+ alcohol[18] +"\n"+ alcohol[19] +"\n"+ alcohol[20] +"\n"+ alcohol[21] +"\n"+ alcohol[22] +"\n"+ alcohol[23] +"\n"+ alcohol[24] +"\n"+ alcohol[25] +"\n"+ alcohol[26] +"\n"+ alcohol[27] +"\n"+ alcohol[28] +"\n"+ alcohol[29] );
			
	}
}*/

//Datatype variableName[] = {"data1","data2",.......};
//index = length - 1 or Index = noOfElements - 1

/*class SuperMarket {
	static String vegetables[]={"Potato","Carrot","Beans","Brinjal","Onion","Tomato","Corn","Radish","Cucumber","Okra"};
	static String perfumes[]={"one8","Jaguar","Perk Avenue","Puma","Adidas"," Denver","Creed Aventus","Dior Sauvage","Dior Sauvage","Armani"};
	static String biscuits[]={"Parle","Brittania","Good Day","Anmol","Unibic","Orian","Sunfeast","NutriChoice","Cremica","Cadbury"};
	static String groceries[]={"Salt","Pepper","Cooking Oil","Veginar","Honey","Chilly Powder","Ginger","Sugar","Garlic","Rice"};
	static String alcohols[] = {"Whiskey", "Vodka", "Rum", "Gin", "Tequila", "Beer", "Wine", "Scotch", "Brandy", "Sake",
                            "Bourbon", "Absinthe", "Cognac", "Rye", "Rum and Coke", "Mojito", "Margarita", "Martini",
                            "Sangria", "Mimosa", "Piña Colada", "Old Fashioned", "Negroni", "Manhattan", "Caipirinha",
                            "Moscow Mule", "Cosmopolitan", "Mai Tai", "Irish Coffee", "Gimlet"};


	public static void main(String market[]){
		for(String i:vegetables){
			System.out.println(i);
		}
		for(String j:perfumes){
			System.out.println(j);
		}
		for(String k:biscuits){
			System.out.println(k);
		}
		for(String l:groceries){
			System.out.println(l);
		}
		for(String m:alcohols){
			System.out.println(m);
		}
	}
}*/


//Using method
class SuperMarket {
	static String vegetables[]={"Potato","Carrot","Beans","Brinjal","Onion","Tomato","Corn","Radish","Cucumber","Okra\n"};
	static String perfumes[]={"one8","Jaguar","Perk Avenue","Puma","Adidas"," Denver","Creed Aventus","Dior Sauvage","Dior Sauvage","Armani\n"};
	static String biscuits[]={"Parle","Brittania","Good Day","Anmol","Unibic","Orian","Sunfeast","NutriChoice","Cremica","Cadbury\n"};
	static String groceries[]={"Salt","Pepper","Cooking Oil","Veginar","Honey","Chilly Powder","Ginger","Sugar","Garlic","Rice\n"};
	static String alcohols[] = {"Whiskey", "Vodka", "Rum", "Gin", "Tequila", "Beer", "Wine", "Scotch", "Brandy", "Sake",
                            "Bourbon", "Absinthe", "Cognac", "Rye", "Rum and Coke", "Mojito", "Margarita", "Martini",
                            "Sangria", "Mimosa", "Piña Colada", "Old Fashioned", "Negroni", "Manhattan", "Caipirinha",
                            "Moscow Mule", "Cosmopolitan", "Mai Tai", "Irish Coffee", "Gimlet\n"};
	public static void main(String args[]){
	System.out.println("Main started\n");
	getVegetables();
	getPerfumes();
	getBiscuits();
	getGroceries();
	getAlcohols();
	System.out.println("Main Ended\n");
    }
	public static void getVegetables(){ //get,fetch,read
	    System.out.println("List of perfumes");
		for(String i:vegetables){
			System.out.println(i);
		}
	}
	public static void getPerfumes(){
		System.out.println("List of perfumes");
		for(String i:perfumes){
			System.out.println(i);
		}
	}
	public static void getBiscuits(){
		System.out.println("List of biscuits");
		for(String i:biscuits){
			System.out.println(i);
		}
	}
	public static void getGroceries(){
		System.out.println("List of groceries");
		for(String i:groceries){
			System.out.println(i);
		}
	}
	public static void getAlcohols(){
		System.out.println("List of alcohols");
		for(String i:alcohols){
			System.out.println(i);
		}
	}
}

							




















