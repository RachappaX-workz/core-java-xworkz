class RadioTester {
    public static void main(String[] args) {
        Radio radio1 = new Radio();
        radio1.brand = "Sony";
        radio1.color = "black";
        radio1.price = 99.99;
        radio1.playMusic();
        System.out.println("Brand: " + radio1.brand);
        System.out.println("Color: " + radio1.color);
        System.out.println("Price: " + radio1.price);

        Radio radio2 = new Radio();
        radio2.brand = "Philips";
        radio2.color = "silver";
        radio2.price = 79.99;
        radio2.playMusic();
        System.out.println("Brand: " + radio2.brand);
        System.out.println("Color: " + radio2.color);
        System.out.println("Price: " + radio2.price);

        Radio radio3 = new Radio();
        radio3.brand = "JBL";
        radio3.color = "red";
        radio3.price = 149.99;
        radio3.playMusic();
        System.out.println("Brand: " + radio3.brand);
        System.out.println("Color: " + radio3.color);
        System.out.println("Price: " + radio3.price);

        Radio radio4 = new Radio();
        radio4.brand = "Bose";
        radio4.color = "white";
        radio4.price = 199.99;
        radio4.playMusic();
        System.out.println("Brand: " + radio4.brand);
        System.out.println("Color: " + radio4.color);
        System.out.println("Price: " + radio4.price);


    }
}
