/*class CricketMania {
	static String top10Batsmen[] = {"Virat Kohli", "Kane Williamson", "Steve Smith", "Joe Root", "Rohit Sharma", 
                                "Babar Azam", "David Warner", "Ross Taylor", "Kumar Sangakkara", "AB de Villiers"};
	static String bccTop10teamRankings[] = {"India", "New Zealand", "Australia", "England", "Pakistan", "South Africa", "Bangladesh", "West Indies", "Sri Lanka", "Afghanistan"};
    static String iplTeams[] = {"Mumbai Indians", "Chennai Super Kings", "Kolkata Knight Riders", "Royal Challengers Bangalore",
                            "Sunrisers Hyderabad", "Rajasthan Royals", "Kings XI Punjab", "Delhi Capitals",
                            "Pune Warriors India", "Deccan Gladiators"};

	public static void main(String market[]){
		System.out.println(top10Batsmen[0]+ "\n"+ top10Batsmen[1]+ "\n"+ top10Batsmen[2]+ "\n"+ top10Batsmen[3]+ "\n"+ top10Batsmen[4]+ "\n"+ top10Batsmen[5]+ "\n"+ top10Batsmen[6]+ "\n"+ top10Batsmen[7]+ "\n"+ top10Batsmen[8]+ "\n"+ top10Batsmen[9]+"\n");
		System.out.println(iplTeams[0]+"\n"+ iplTeams[1]+"\n"+ iplTeams[2]+"\n"+ iplTeams[3]+"\n"+ iplTeams[4]+"\n"+ iplTeams[5]+"\n"+ iplTeams[6]+"\n"+ iplTeams[7]+"\n"+ iplTeams[8]+"\n"+ iplTeams[9]+"\n");
		System.out.println(bccTop10teamRankings[0]+"\n"+ bccTop10teamRankings[1]+"\n"+ bccTop10teamRankings[2]+"\n"+ bccTop10teamRankings[3]+"\n"+ bccTop10teamRankings[4]+"\n"+ bccTop10teamRankings[5]+"\n"+ bccTop10teamRankings[6]+"\n"+ bccTop10teamRankings[7]+"\n"+ bccTop10teamRankings[8]+"\n"+ bccTop10teamRankings[9]);
	}

}*/



/*class CricketMania {
	static String top10Batsmens[] = {"Virat Kohli", "Kane Williamson", "Steve Smith", "Joe Root", "Rohit Sharma", 
                                "Babar Azam", "David Warner", "Ross Taylor", "Kumar Sangakkara", "AB de Villiers"};
	static String bccTop10teamRankings[] = {"India", "New Zealand", "Australia", "England", "Pakistan", "South Africa", "Bangladesh", "West Indies", "Sri Lanka", "Afghanistan"};
    static String iplTeams[] = {"Mumbai Indians", "Chennai Super Kings", "Kolkata Knight Riders", "Royal Challengers Bangalore",
                            "Sunrisers Hyderabad", "Rajasthan Royals", "Kings XI Punjab", "Delhi Capitals",
                            "Pune Warriors India", "Deccan Gladiators"};

	public static void main(String args[]){
		for(String top10Batsmen:top10Batsmens){
		System.out.println(top10Batsmen);
		}
	}

}*/


//Using methods
class CricketMania {
	static String top10Batsmen[] = {"Virat Kohli", "Kane Williamson", "Steve Smith", "Joe Root", "Rohit Sharma", 
                                "Babar Azam", "David Warner", "Ross Taylor", "Kumar Sangakkara", "AB de Villiers\n"};
	static String iccTop10teamRankings[] = {"India", "New Zealand", "Australia", "England", "Pakistan", "South Africa", "Bangladesh", "West Indies", "Sri Lanka", "Afghanistan\n"};
    static String iplTeams[] = {"Mumbai Indians", "Chennai Super Kings", "Kolkata Knight Riders", "Royal Challengers Bangalore",
                            "Sunrisers Hyderabad", "Rajasthan Royals", "Kings XI Punjab", "Delhi Capitals",
                            "Pune Warriors India", "Deccan Gladiators\n"};
    public static void main(String args[]){
		getTop10Batsmen();
		getIccTop10TeamMembers();
		getIplTeams();
	}
	public static void getTop10Batsmen(){
		System.out.println("The list of top 10 batsmen:");
		for(String i:top10Batsmen){
			System.out.println(i);
		}
	}
	public static void getIccTop10TeamMembers(){
		System.out.println("The list of ICC top 10 rankings:");
		for(String i:iccTop10teamRankings){
			System.out.println(i);
		}
	}
	public static void getIplTeams(){
		System.out.println("The list of IPL teams:");
		for(String i:iplTeams){
			System.out.println(i);
		}
	}
}

