package main.java.kabaddi;

public class Match {

	private Team team1;
	private Team team2;
	
	private int matchDay;
	private int slot;
	
	private String venue;
	
	public Team getTeam1() {
		return team1;
	}


	public void setTeam1(Team team1) {
		this.team1 = team1;
	}



	public Team getTeam2() {
		return team2;
	}



	public void setTeam2(Team team2) {
		this.team2 = team2;
	}



	public int getMatchDay() {
		return matchDay;
	}



	public void setMatchDay(int matchDay) {
		this.matchDay = matchDay;
	}



	public int getSlot() {
		return slot;
	}



	public void setSlot(int slot) {
		this.slot = slot;
	}



	public String getVenue() {
		return venue;
	}



	public void setVenue(String venue) {
		this.venue = venue;
	}



	@Override
	public String toString(){
		return "Teams : "+this.team1+" vs "+this.team2+"day : "+this.matchDay+", slot:"+this.slot+" venue: "+this.venue;
	}
	
}
