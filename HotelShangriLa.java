/*class HotelShangriLa {
	 static String restaurantFoods[] = {"Pizza", "Burger", "Pasta", "Sushi", "Steak", "Salad", "Tacos", "Sandwich", "Chicken Wings", "Hot Dog",
                                  "Curry", "Ramen", "Fried Rice", "Pho", "Enchiladas", "Fish and Chips", "Shawarma", "Dumplings", "Nachos", "Gyros",
                                  "Biryani", "Falafel", "Lasagna", "Hamburger", "Sashimi", "Barbecue Ribs", "Crab Cakes", "Pad Thai", "Calamari", "Paella",
                                  "Dim Sum", "Tandoori Chicken", "Goulash", "Ceviche", "Lobster Bisque", "Beef Stroganoff", "Mussels", "Eggs Benedict",
                                  "Peking Duck", "Chicken Parmesan", "Lamb Chops", "Butter Chicken", "Egg Rolls", "Croissant", "Beef Wellington",
                                  "Creme Brulee", "Escargot", "Lobster Roll", "Croque Monsieur", "Philly Cheesesteak"};
	    public static void main(String market[]){
		
			System.out.println(restaurantFoods[0]+ "\n"+ restaurantFoods[1]+"\n"+ restaurantFoods[2] +"\n"+ restaurantFoods[3] +"\n"+ restaurantFoods[4] +"\n" +restaurantFoods[5]+ restaurantFoods[6] +"\n"+ restaurantFoods[7] +"\n" +restaurantFoods[8] +"\n" +restaurantFoods[9] +"\n"+ restaurantFoods[10]+ restaurantFoods[11] +"\n"+ restaurantFoods[12] +"\n" +restaurantFoods[13] +"\n" +restaurantFoods[14] +"\n"+ restaurantFoods[15] +"\n"+ restaurantFoods[16]+ restaurantFoods[17] +"\n"+ restaurantFoods[18] +"\n"+ restaurantFoods[19] +"\n"+ restaurantFoods[20] +"\n"+ restaurantFoods[21] +"\n"+ restaurantFoods[22] +"\n"+ restaurantFoods[23] +"\n"+ restaurantFoods[24] +"\n" +restaurantFoods[25] +"\n" +restaurantFoods[26] +"\n"+ restaurantFoods[27] +"\n" +restaurantFoods[28] +"\n"+ restaurantFoods[29] +"\n" +restaurantFoods[30] +"\n" +restaurantFoods[31] +"\n"+ restaurantFoods[32] +"\n"+ restaurantFoods[33] +"\n" +restaurantFoods[34] +"\n"+ restaurantFoods[35] +"\n"+ restaurantFoods[36] +"\n"+ restaurantFoods[37] +"\n"+ restaurantFoods[38] +"\n"+ restaurantFoods[39] +"\n"+ restaurantFoods[40] +"\n"+ restaurantFoods[41]  +"\n"+ restaurantFoods[42] +"\n"+ restaurantFoods[43] +"\n"+ restaurantFoods[44] +"\n"+ restaurantFoods[45] +"\n"+ restaurantFoods[46] +"\n"+ restaurantFoods[47] +"\n"+ restaurantFoods[48] +"\n"+ restaurantFoods[49]);
			//System.out.println( +"\n" +"\n");
		}
			
}*/


/*class HotelShangriLa {
	 static String restaurantFoods[] = {"Pizza", "Burger", "Pasta", "Sushi", "Steak", "Salad", "Tacos", "Sandwich", "Chicken Wings", "Hot Dog",
                                  "Curry", "Ramen", "Fried Rice", "Pho", "Enchiladas", "Fish and Chips", "Shawarma", "Dumplings", "Nachos", "Gyros",
                                  "Biryani", "Falafel", "Lasagna", "Hamburger", "Sashimi", "Barbecue Ribs", "Crab Cakes", "Pad Thai", "Calamari", "Paella",
                                  "Dim Sum", "Tandoori Chicken", "Goulash", "Ceviche", "Lobster Bisque", "Beef Stroganoff", "Mussels", "Eggs Benedict",
                                  "Peking Duck", "Chicken Parmesan", "Lamb Chops", "Butter Chicken", "Egg Rolls", "Croissant", "Beef Wellington",
                                  "Creme Brulee", "Escargot", "Lobster Roll", "Croque Monsieur", "Philly Cheesesteak"};
	    public static void main(String market[]){
			for(String i:restaurantFoods){
			System.out.println(i);
			}
		}
}*/



//Using method..
class HotelShangriLa {
	 static String restaurantFoods[] = {"Pizza", "Burger", "Pasta", "Sushi", "Steak", "Salad", "Tacos", "Sandwich", "Chicken Wings", "Hot Dog",
                                  "Curry", "Ramen", "Fried Rice", "Pho", "Enchiladas", "Fish and Chips", "Shawarma", "Dumplings", "Nachos", "Gyros",
                                  "Biryani", "Falafel", "Lasagna", "Hamburger", "Sashimi", "Barbecue Ribs", "Crab Cakes", "Pad Thai", "Calamari", "Paella",
                                  "Dim Sum", "Tandoori Chicken", "Goulash", "Ceviche", "Lobster Bisque", "Beef Stroganoff", "Mussels", "Eggs Benedict",
                                  "Peking Duck", "Chicken Parmesan", "Lamb Chops", "Butter Chicken", "Egg Rolls", "Croissant", "Beef Wellington",
                                  "Creme Brulee", "Escargot", "Lobster Roll", "Croque Monsieur", "Philly Cheesesteak"};
	    public static void main(String market[]){
			getRestaurentFoods();
		}
		public static void getRestaurentFoods(){
			System.out.println("The list of foods:");
			for(String i:restaurantFoods){
				System.out.println(i);
			}
		}
}













