class HelmetTester {
    public static void main(String[] args) {
        Helmet helmet1 = new Helmet();
        helmet1.brandName = "Bell";
        helmet1.color = "Black";
        helmet1.price = 99;
        helmet1.size = "M";
        helmet1.protectHead();
        System.out.println("Brand Name: " + helmet1.brandName);
        System.out.println("Color: " + helmet1.color);
        System.out.println("Price: " + helmet1.price);
        System.out.println("Size: " + helmet1.size);

        Helmet helmet2 = new Helmet();
        helmet2.brandName = "Shoei";
        helmet2.color = "White";
        helmet2.price = 299;
        helmet2.size = "L";
        helmet2.protectHead();
        System.out.println("Brand Name: " + helmet2.brandName);
        System.out.println("Color: " + helmet2.color);
        System.out.println("Price: " + helmet2.price);
        System.out.println("Size: " + helmet2.size);

        Helmet helmet3 = new Helmet();
        helmet3.brandName = "AGV";
        helmet3.color = "Red";
        helmet3.price = 199;
        helmet3.size = "S";
        helmet3.protectHead();
        System.out.println("Brand Name: " + helmet3.brandName);
        System.out.println("Color: " + helmet3.color);
        System.out.println("Price: " + helmet3.price);
        System.out.println("Size: " + helmet3.size);

        Helmet helmet4 = new Helmet();
        helmet4.brandName = "HJC";
        helmet4.color = "Yellow";
        helmet4.price = 149;
        helmet4.size = "XL";
        helmet4.protectHead();
        System.out.println("Brand Name: " + helmet4.brandName);
        System.out.println("Color: " + helmet4.color);
        System.out.println("Price: " + helmet4.price);
        System.out.println("Size: " + helmet4.size);

      }
}
	  
