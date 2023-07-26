class IndianRupeeTester{
	public static void main(String args[]){
		IndianRupee indianRupee=new IndianRupee();
		indianRupee.setRupeeId(1);
		indianRupee.setRupeeName("10 Rupee");
		indianRupee.setPrintDate("10/08/2000");
		indianRupee.setColor("Chacolate Brown");
	    indianRupee.setSerialNo("16G 08J442");
		IndianRupee.noOfLanguages=15;
		indianRupee.setSize("123mm*63mm");
		indianRupee.setBackSidePlaceName("Sun Temple,Konark");
		indianRupee.setLocation("Reserve Bank Of India");
		
		System.out.println(indianRupee.getRupeeId()+"\n"+indianRupee.getRupeeName()+"\n"+indianRupee.getPrintDate()+"\n"+indianRupee.getColor()+"\n"+indianRupee.getSerialNo()+"\n"+IndianRupee.noOfLanguages+"\n"+indianRupee.getSize()+"\n"+indianRupee.getBackSidePlaceName()+"\n"+indianRupee.getLocation());
		System.out.println("-----------------");
		
		IndianRupee indianRupee1=new IndianRupee();
		indianRupee1.setRupeeId(2);
		indianRupee1.setRupeeName("50 Rupee");
		indianRupee1.setPrintDate("20/05/2022");
		indianRupee1.setColor("Flurescent blue");
	    indianRupee1.setSerialNo("16K 08L8925");
		indianRupee1.setSize("140mm*66mm");
		indianRupee1.setBackSidePlaceName("Hampi with Chariot");
		indianRupee1.setLocation("Reserve Bank Of India");
		
		System.out.println(indianRupee1.getRupeeId()+"\n"+indianRupee1.getRupeeName()+"\n"+indianRupee1.getPrintDate()+"\n"+indianRupee1.getColor()+"\n"+indianRupee1.getSerialNo()+"\n"+IndianRupee.noOfLanguages+"\n"+indianRupee1.getSize()+"\n"+indianRupee1.getBackSidePlaceName()+"\n"+indianRupee1.getLocation());
		System.out.println("-----------------");
		
		IndianRupee indianRupee3=new IndianRupee();
		indianRupee3.setRupeeId(3);
		indianRupee3.setRupeeName("100 Rupee");
		indianRupee3.setPrintDate("25/04/2021");
		indianRupee3.setColor("Blue-green");
	    indianRupee3.setSerialNo("16M 08T8925");
		indianRupee3.setSize("142mm*66mm");
		indianRupee3.setBackSidePlaceName("Hampi with Chariot");
		indianRupee3.setLocation("Reserve Bank Of India");
		
		System.out.println(indianRupee3.getRupeeId()+"\n"+indianRupee3.getRupeeName()+"\n"+indianRupee3.getPrintDate()+"\n"+indianRupee3.getColor()+"\n"+indianRupee3.getSerialNo()+"\n"+IndianRupee.noOfLanguages+"\n"+indianRupee3.getSize()+"\n"+indianRupee3.getBackSidePlaceName()+"\n"+indianRupee3.getLocation());
	}
}