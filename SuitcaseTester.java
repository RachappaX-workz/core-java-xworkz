class SuitcaseTester {
    public static void main(String[] args) {
        Suitcase suitcase1 = new Suitcase();
        suitcase1.brand = "Samsonite";
        suitcase1.color = "Black";
        suitcase1.price = 199.99;
        suitcase1.capacity = 80;
        suitcase1.displayDetails();
		
		 System.out.println("Brand: " + suitcase1.brand);
        System.out.println("Color: " + suitcase1.color);
        System.out.println("Price: " + suitcase1.price);
        System.out.println("Capacity: " + suitcase1.capacity + " liters");

        Suitcase suitcase2 = new Suitcase();
        suitcase2.brand = "American Tourister";
        suitcase2.color = "Blue";
        suitcase2.price = 149.99;
        suitcase2.capacity = 60;
        suitcase2.displayDetails();
		
		System.out.println("Brand: " + suitcase2.brand);
        System.out.println("Color: " + suitcase2.color);
        System.out.println("Price: " + suitcase2.price);
        System.out.println("Capacity: " + suitcase2.capacity + " liters");

        Suitcase suitcase3 = new Suitcase();
        suitcase3.brand = "Delsey";
        suitcase3.color = "Silver";
        suitcase3.price = 179.99;
        suitcase3.capacity = 70;
        suitcase3.displayDetails();
		
		System.out.println("Brand: " + suitcase3.brand);
        System.out.println("Color: " + suitcase3.color);
        System.out.println("Price: " + suitcase3.price);
        System.out.println("Capacity: " + suitcase3.capacity + " liters");

        Suitcase suitcase4 = new Suitcase();
        suitcase4.brand = "Rimowa";
        suitcase4.color = "Red";
        suitcase4.price = 299.99;
        suitcase4.capacity = 90;
        suitcase4.displayDetails();
		System.out.println("Brand: " + suitcase4.brand);
        System.out.println("Color: " + suitcase4.color);
        System.out.println("Price: " + suitcase4.price);
        System.out.println("Capacity: " + suitcase4.capacity + " liters");
    }
}