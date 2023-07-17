class RocketTester {
    public static void main(String[] args) {
        Rocket rocket1 = new Rocket();
        rocket1.manufacturer = "SpaceX";
        rocket1.color = "White";
        rocket1.price = 60000000.0;
        rocket1.payloadCapacity = 22000;
        rocket1.launch();
    
		
		System.out.println("Manufacturer: " + rocket1.manufacturer);
        System.out.println("Color: " + rocket1.color);
        System.out.println("Price: " + rocket1.price);
        System.out.println("Payload Capacity: " + rocket1.payloadCapacity + " kg");

        Rocket rocket2 = new Rocket();
        rocket2.manufacturer = "Blue Origin";
        rocket2.color = "Blue";
        rocket2.price = 50000000.0;
        rocket2.payloadCapacity = 15000;
        rocket2.launch();
		
        System.out.println("Manufacturer: " + rocket2.manufacturer);
        System.out.println("Color: " + rocket2.color);
        System.out.println("Price: " + rocket2.price);
        System.out.println("Payload Capacity: " + rocket2.payloadCapacity + " kg");

        Rocket rocket3 = new Rocket();
        rocket3.manufacturer = "NASA";
        rocket3.color = "Red";
        rocket3.price = 80000000.0;
        rocket3.payloadCapacity = 30000;
        rocket3.launch();
        
		System.out.println("Manufacturer: " + rocket3.manufacturer);
        System.out.println("Color: " + rocket3.color);
        System.out.println("Price: " + rocket3.price);
        System.out.println("Payload Capacity: " + rocket3.payloadCapacity + " kg");

        Rocket rocket4 = new Rocket();
        rocket4.manufacturer = "Roscosmos";
        rocket4.color = "Silver";
        rocket4.price = 40000000.0;
        rocket4.payloadCapacity = 18000;
        rocket4.launch();
      
	    System.out.println("Manufacturer: " + rocket4.manufacturer);
        System.out.println("Color: " + rocket4.color);
        System.out.println("Price: " + rocket4.price);
        System.out.println("Payload Capacity: " + rocket4.payloadCapacity + " kg");
    }
}