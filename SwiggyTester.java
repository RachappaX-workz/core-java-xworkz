class SwiggyTester{
	public static void main(String args[]){
		int priceOfFood=Swiggy.search("Samosa");
		System.out.println(priceOfFood);
		priceOfFood=Swiggy.search("Veg Biriyani");
		System.out.println(priceOfFood);
		priceOfFood=Swiggy.search("Burger");
		System.out.println(priceOfFood);
		priceOfFood=Swiggy.search("Chicken Biriyani");
		System.out.println(priceOfFood);
		priceOfFood=Swiggy.search("Mutton Biriyani");
		System.out.println(priceOfFood);
		
		
		
		int priceOfFoodWithQuantity=Swiggy.search("Pizza",2);
		System.out.println(priceOfFoodWithQuantity);
		priceOfFoodWithQuantity=Swiggy.search("Veg Biriyani",4);
		System.out.println(priceOfFoodWithQuantity);
		priceOfFoodWithQuantity=Swiggy.search("Burger",5);
		System.out.println(priceOfFoodWithQuantity);
		priceOfFoodWithQuantity=Swiggy.search("Chicken Biriyani",6);
		System.out.println(priceOfFoodWithQuantity);
		priceOfFoodWithQuantity=Swiggy.search("Mutton Biriyani",2);
		System.out.println(priceOfFoodWithQuantity);
	}
}