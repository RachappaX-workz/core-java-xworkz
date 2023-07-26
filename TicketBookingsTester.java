class TicketBookingsTester{
	public static void main(String args[]){
		TicketBookings ticketBooking=new TicketBookings();
		ticketBooking.setBookId(1);
		ticketBooking.setNoOfSeats(16592);
		ticketBooking.setSource("Hospete");
		ticketBooking.setDestination("Bangalore");
		ticketBooking.setDate("27/06/2023");
		ticketBooking.setTimings("09:00PM");
		ticketBooking.setPNR("423-4888961");
		ticketBooking.setPrice(450.0);
		ticketBooking.setBookingClass("AC 2tier");
		ticketBooking.setBookingType("General");
		ticketBooking.setTransportName("Hampi Express");
		
		System.out.println(ticketBooking.getBookId()+"\n"+ticketBooking.getNoOfSeats()+"\n"+ticketBooking.getSource()+"\n"+ticketBooking.getDestination()+"\n"+ticketBooking.getDate()+"\n"+ticketBooking.getTimings()+"\n"+ticketBooking.getPNR()+"\n"+ticketBooking.getPrice()+"\n"+ticketBooking.getBookingClass()+"\n"+ticketBooking.getBookingType()+"\n"+ticketBooking.getTransportName());
		System.out.println("-------------------------");
		TicketBookings ticketBooking1=new TicketBookings();
		ticketBooking1.setBookId(2);
		ticketBooking1.setNoOfSeats(18358);
		ticketBooking1.setSource("Bangalore");
		ticketBooking1.setDestination("Hubli");
		ticketBooking1.setDate("15/07/2023");
		ticketBooking1.setTimings("10:30AM");
		ticketBooking1.setPNR("423-8363829");
		ticketBooking1.setPrice(350.0);
		ticketBooking1.setBookingClass("AC 4tier");
		ticketBooking1.setBookingType("Sleeper");
		ticketBooking1.setTransportName("Rani Chennamma Express");
		
		System.out.println(ticketBooking1.getBookId()+"\n"+ticketBooking1.getNoOfSeats()+"\n"+ticketBooking1.getSource()+"\n"+ticketBooking1.getDestination()+"\n"+ticketBooking1.getDate()+"\n"+ticketBooking1.getTimings()+"\n"+ticketBooking1.getPNR()+"\n"+ticketBooking1.getPrice()+"\n"+ticketBooking1.getBookingClass()+"\n"+ticketBooking1.getBookingType()+"\n"+ticketBooking1.getTransportName());
	}
}