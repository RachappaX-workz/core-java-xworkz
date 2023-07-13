class ZomatoTester{
	public static void main(String args[]){
		
		double priceOfFood=Zomato.search("Pizza");
		System.out.println(priceOfFood);
		priceOfFood=Zomato.search("Veg Biriyani");
		System.out.println(priceOfFood);
		priceOfFood=Zomato.search("Burger");
		System.out.println(priceOfFood);
		priceOfFood=Zomato.search("Chicken Biriyani");
		System.out.println(priceOfFood);
		priceOfFood=Zomato.search("Mutton Biriyani");
		System.out.println(priceOfFood);
		
		
		
		
		double priceOfFoodWithQuantity=Zomato.search("Pizza",2);
		System.out.println(priceOfFoodWithQuantity);
		priceOfFoodWithQuantity=Zomato.search("Veg Biriyani",4);
		System.out.println(priceOfFoodWithQuantity);
		priceOfFoodWithQuantity=Zomato.search("Burger",5);
		System.out.println(priceOfFoodWithQuantity);
		priceOfFoodWithQuantity=Zomato.search("Chicken Biriyani",6);
		System.out.println(priceOfFoodWithQuantity);
		priceOfFoodWithQuantity=Zomato.search("Mutton Biriyani",2);
		System.out.println(priceOfFoodWithQuantity);
	}
}