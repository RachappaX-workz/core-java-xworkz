public class TubeLightTester {
    public static void main(String[] args) {
        TubeLight tubeLight1 = new TubeLight();
        tubeLight1.brand = "Philips";
        tubeLight1.color = "White";
        tubeLight1.price = 19.99;
       
        tubeLight1.displayDetails();
		
		System.out.println("Brand: " + tubeLight1.brand );
        System.out.println("Color: " +tubeLight1.color);
        System.out.println("Price: " + tubeLight1.price);

        TubeLight tubeLight2 = new TubeLight();
        tubeLight2.brand = "Havells";
        tubeLight2.color = "Yellow";
        tubeLight2.price = 15.99;
      
        tubeLight2.displayDetails();
		
		System.out.println("Brand: " + tubeLight2.brand );
        System.out.println("Color: " +tubeLight2.color);
        System.out.println("Price: " + tubeLight2.price);

        TubeLight tubeLight3 = new TubeLight();
        tubeLight3.brand = "Syska";
        tubeLight3.color = "Cool Daylight";
        tubeLight3.price = 12.99;
     
        tubeLight3.displayDetails();
		
		System.out.println("Brand: " + tubeLight3.brand );
        System.out.println("Color: " +tubeLight3.color);
        System.out.println("Price: " + tubeLight3.price);

        TubeLight tubeLight4 = new TubeLight();
        tubeLight4.brand = "Bajaj";
        tubeLight4.color = "Warm White";
        tubeLight4.price = 9.99;
        tubeLight4.displayDetails();
		
		System.out.println("Brand: " + tubeLight4.brand );
        System.out.println("Color: " +tubeLight4.color);
        System.out.println("Price: " + tubeLight4.price);
    }
}
