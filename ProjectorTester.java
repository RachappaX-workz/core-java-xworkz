class ProjectorTester {
    public static void main(String[] args) {
        Projector projector1 = new Projector();
        projector1.brandName = "Epson";
        projector1.color = "White";
        projector1.price = 999;
        projector1.type = "LCD";
        projector1.displayInfo();
		
		System.out.println("Brand Name: " + projector1.brandName);
        System.out.println("Color: " + projector1.color);
        System.out.println("Price: " + projector1.price);
        System.out.println("Type: " + projector1.type);

        Projector projector2 = new Projector();
        projector2.brandName = "Sony";
        projector2.color = "Black";
        projector2.price = 1499;
        projector2.type = "DLP";
        projector2.displayInfo();
		
		System.out.println("Brand Name: " + projector2.brandName);
        System.out.println("Color: " + projector2.color);
        System.out.println("Price: " + projector2.price);
        System.out.println("Type: " + projector2.type);

        Projector projector3 = new Projector();
        projector3.brandName = "BenQ";
        projector3.color = "Silver";
        projector3.price = 799;
        projector3.type = "LED";
        projector3.displayInfo();
		
		System.out.println("Brand Name: " + projector3.brandName);
        System.out.println("Color: " + projector3.color);
        System.out.println("Price: " + projector3.price);
        System.out.println("Type: " + projector3.type);

        Projector projector4 = new Projector();
        projector4.brandName = "Optoma";
        projector4.color = "Gray";
        projector4.price = 1299;
        projector4.type = "4K";
        projector4.displayInfo();
		
		System.out.println("Brand Name: " + projector4.brandName);
        System.out.println("Color: " + projector4.color);
        System.out.println("Price: " + projector4.price);
        System.out.println("Type: " + projector4.type);
    }
}